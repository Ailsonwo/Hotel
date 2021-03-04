package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import action.Action;
import model.Employee;

@WebServlet("/main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramAction = request.getParameter("action");
		HttpSession session = request.getSession();
		Employee currentEmployee = (Employee)session.getAttribute("currentEmployee");
		boolean hasAEmployee = (currentEmployee != null);
		boolean isAProtectedAction = !(paramAction.equals("Login") || paramAction.equals("ShowLoginForm"));
		
		if(!hasAEmployee && isAProtectedAction) {
			response.sendRedirect("main?action=ShowLoginForm");
			return;
		}
		
		Action action;
		try {
			Class c = Class.forName("action." + paramAction);
			action = (Action)c.newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}
		String name = action.run(request, response);
	
		String[] directionAndAddress = name.split(":");
		String direction = directionAndAddress[0];
		String Address = directionAndAddress[1];
		
		if(direction.equalsIgnoreCase("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher(Address);
			rd.forward(request, response);
		} else if(direction.equalsIgnoreCase("redirect")) {
			response.sendRedirect(Address);
		}
		
		
	}

}

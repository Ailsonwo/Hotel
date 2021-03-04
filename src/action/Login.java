package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Database;
import model.Employee;

public class Login implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		Database db = new Database();
		
		Employee employee = db.validate(login, password);
		if(employee == null)
			return "redirect:main?action=ShowLoginForm";
		
		HttpSession session = request.getSession();
		session.setAttribute("currentEmployee", employee);
		
		return "redirect:main?action=ShowEmployeeScreen";

	}

}

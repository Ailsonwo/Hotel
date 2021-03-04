package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Client;
import model.Database;

public class ClientValidate implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramCpf = request.getParameter("cpf");
		Database db = new Database();
		System.out.println();
		
		Client client = db.hasClient(paramCpf);
		
		if(client != null) {
			HttpSession session =  request.getSession();
			session.setAttribute("currentClient", client);
			return "redirect:main?action=ShowClientRooms";
		}
		
		return "redirect:main?action=ShowSearchEmployee";
	}

}

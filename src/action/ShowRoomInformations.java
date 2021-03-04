package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Database;
import model.Room;

public class ShowRoomInformations implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer roomNumber = Integer.valueOf(request.getParameter("roomNumber"));
		Database db = new Database();
		Room room = db.getRoom(roomNumber);
		request.setAttribute("room", room);
		return "forward:WEB-INF/view/roomInformations.jsp";
	}

}

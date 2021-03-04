package action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Database;
import model.Room;

public class ShowAvailableRooms implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Database db = new Database();
		List<Room> rooms = db.getRoomList();
		request.setAttribute("rooms", rooms);
		return "forward:WEB-INF/view/availableRooms.jsp";
	}

}

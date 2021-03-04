package model;

import java.util.ArrayList;
import java.util.List;

public class Database {

	private static int userSequence = 0;
	private static List<Employee> employeeList = new ArrayList<>();
	private static List<Client> clientList = new ArrayList<>();
	private static List<Room> roomList = new ArrayList<>();
	
	
	static {
		Database db = new Database();
		db.addEmployee("ailson", "12345");
		
		db.addClient("12345678901", "rafaela", "12345");
		db.addClient("09876543212", "pandora", "12345");
		
		for(int floor = 0; floor <= 5; floor++) {
			for(int room = 1; room <= 5; room++) {
				Room r = new Room((floor*10) + room);
				roomList.add(r);
			}
		}
		
		db.setRoom(25, db.hasClient("12345678901"));
	}
	
	public List<Employee> getUserList() {
		return employeeList;
	}
	
	public void addEmployee(String login, String password) {
		employeeList.add(new Employee(login, password, userSequence++));
	}
	
	public static List<Client> getClientList() {
		return clientList;
	}
	
	public void addClient(String cpf, String name, String password) {
		clientList.add(new Client(cpf, name, password));
	}
	
	
	public Employee validate(String login, String password) {
		for (Employee employee : employeeList) {
			if(employee.isEqual(login, password))
				return employee;
		}

		return null;
	}
	
	public Client hasClient(String cpf) {
		for (Client client : clientList) {
			if(client.getCpf().equals(cpf))
				return client;
		}
		return null;
	}
	
	public Room getRoom(Integer number) {
		for (Room room : roomList) {
			if(room.getNumber().equals(number))
				return room;
		};
		
		return null;
	}
	
	public void setRoom(Integer number, Client client) {
		Room room = getRoom(number);
		client.setRoom(room);
		room.setAvailable(false);
	}
	
	public List<Room> getRoomList() {
		return roomList;
	}
}

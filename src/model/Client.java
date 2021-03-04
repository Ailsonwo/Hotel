package model;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String cpf;
	private String name;
	private String password;
	private String address;
	private String telephone;
	private List<Room> clientRooms = new ArrayList<>();
	
	Client(String cpf, String name, String password) {
		this.cpf = cpf;
		this.name = name;
		this.password = password;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public List<Room> getClientRooms() {
		return clientRooms;
	}
	
	public void setRoom(Room room) {
		this.clientRooms.add(room);
	}
	
}

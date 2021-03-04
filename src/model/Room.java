package model;

public class Room {

	private boolean available;
	private Integer number;
	private Integer simpleBeds = 2;
	private Integer premiumBeds = 3;
	
	Room(Integer number){
		this.number = number;
		this.available = true;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getSimpleBeds() {
		return simpleBeds;
	}

	public void setSimpleBeds(Integer simpleBeds) {
		this.simpleBeds = simpleBeds;
	}

	public Integer getPremiumBeds() {
		return premiumBeds;
	}

	public void setPremiumBeds(Integer premiumBeds) {
		this.premiumBeds = premiumBeds;
	}
	
	
}

package entites;

public class Hotel {
	private String name;
	private String email;
	private Integer room;
	
	public Hotel(String name, String email, Integer room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}

	public String toString() {
		return room+ ": "+name+", "+email;
	}
}

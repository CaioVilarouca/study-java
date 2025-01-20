package application;

public class Rent {
	private String name;
	private Integer numberRoom;
	
	public Rent(String name, Integer numberRoom) {
		super();
		this.name = name;
		this.numberRoom = numberRoom;
	}
	public String getName() {
		return name;
	}
	public Integer getNumberRoom() {
		return numberRoom;
	}
	@Override
	public String toString() {
		return String.format(numberRoom + " : nome: " + name);
	}
}

package model.entites;

public class Notes {
	private Double notes01;
	private Double notes02;
	private Double notes03;
	
	public Notes(Double notes01, Double notes02, Double notes03) {
		this.notes01 = notes01;
		this.notes02 = notes02;
		this.notes03 = notes03;
	}

	public Double getNotes01() {
		return notes01;
	}

	public void setNotes01(Double notes01) {
		this.notes01 = notes01;
	}

	public Double getNotes02() {
		return notes02;
	}

	public void setNotes02(Double notes02) {
		this.notes02 = notes02;
	}

	public Double getNotes03() {
		return notes03;
	}

	public void setNotes03(Double notes03) {
		this.notes03 = notes03;
	}
}

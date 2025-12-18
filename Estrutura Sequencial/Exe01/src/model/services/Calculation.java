package model.services;

import model.entites.Value;

public class Calculation {
	private Value value;
	
	public Calculation(Value value) {
		this.value = value;
	}

	public int sum() {
		return value.getNumber01() + value.getNumber02();
	}
}

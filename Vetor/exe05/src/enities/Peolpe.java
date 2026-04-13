package enities;

public class Peolpe {
	private String name;
	private Integer age;
	private Double height;
	
	public Peolpe(String name, Integer age, Double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public Integer getAge() {
		return age;
	}

	public Double getHeight() {
		return height;
	}

	public String getName() {
		return name;
	}
}

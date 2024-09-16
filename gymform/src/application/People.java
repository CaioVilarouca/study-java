package application;

public class People {
	// Atributos
	String name;
	double height;
	double weight;
	
	public People(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}

    @Override
	public String toString() {
		return "Formulário [Nome=" + name + ", Altura=" + height + ", Peso=" + weight + "]";
	}
} 

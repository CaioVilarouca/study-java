package application;

public class Form {
	People people;
	double imc;
	
	// Calculando o IMC em java
	public double calculationImc (People people) {
		imc = people.weight / (people.height * 2);
		return imc;
	}
	
	// Tabale do IMC
	public void tableImc (People people) {
		if (imc >= 17.0 && imc < 18.4) {
			System.out.println("Status: ABAIXO DO PESO");
		}else if (imc >= 18.5 && imc < 24.9) {
			System.out.println("Status: PESO NORMAL");
		}else if (imc >= 25 && imc < 29.9) {
			System.out.println("Status: ACIMA DO PESO");
		}else {
			System.out.println("Status: OBESIDADE");
		}
	}
}

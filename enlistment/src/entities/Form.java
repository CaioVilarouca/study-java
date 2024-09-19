package entities;

public class Form {
	protected People people;
	private static final int age = 18;
	
	// Idade
	public void ageCorrent(People people) {
		int ageCorrent = DateNow.dateCorrent() - people.getYear();
		people.setAge(ageCorrent);
		}
	
	
	// Resutado
	public String resultEnlistment(People people) {
		String result;
		if (people.getAge() >= age) {
			result = "APROVADO";
		}else {
			result = "REPROVADO";
		}
		return String.format("\nNome do candidato: %s\nData de nasc: %d\nIdade %d\n"
				+ "Status %s para alistamento militar", people.getName(), people.getYear(), people.getAge(), result);
	}
	} 
	

package contratosTrabalhista;

public class Empregado {
	
	private String nome;
	protected Double horasTrabalhadas;
	protected Double valorHoraTrabalhada;
	
	public Empregado() {
		
	}

	public Empregado(String nome, Double horasTrabalhadas, Double valorHoraTrabalhada) {
		super();
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHoraTrabalhada = valorHoraTrabalhada;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(Double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Double getValorHoraTrabalhada() {
		return valorHoraTrabalhada;
	}

	public void setValorHoraTrabalhada(Double valorHoraTrabalhada) {
		this.valorHoraTrabalhada = valorHoraTrabalhada;
	}
	
	// Calculando o salario do colaborador
	public double calcRedimentos() {
		return  horasTrabalhadas * valorHoraTrabalhada;
	}
}

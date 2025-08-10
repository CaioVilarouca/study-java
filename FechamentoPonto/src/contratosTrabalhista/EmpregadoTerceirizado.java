package contratosTrabalhista;

public final class EmpregadoTerceirizado extends Empregado{
	private Double bonus = 0.0;
	
	public EmpregadoTerceirizado() {
		
	}

	public EmpregadoTerceirizado(String nome, Double horasTrabalhadas, Double valorHoraTrabalhada, Double bonus) {
		super(nome, horasTrabalhadas, valorHoraTrabalhada);
		this.bonus = bonus;
	}


	
}

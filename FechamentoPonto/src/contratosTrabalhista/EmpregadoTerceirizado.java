package contratosTrabalhista;

public final class EmpregadoTerceirizado extends Empregado{
	private Double bonus;
	
	public EmpregadoTerceirizado() {
		
	}

	public EmpregadoTerceirizado(String nome, Double horasTrabalhadas, Double valorHoraTrabalhada, Double bonus) {
		super(nome, horasTrabalhadas, valorHoraTrabalhada);
		this.bonus = bonus;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	// Calculando o salario do colaborador
	@Override
	public final double calcRedimentos() {
		// Vai la super Class pega o resultado + bonus * 1.1
		return  super.calcRedimentos() + bonus * 1.1;
	}	

}

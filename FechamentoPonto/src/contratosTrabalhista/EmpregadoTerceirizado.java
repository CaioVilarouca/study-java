package contratosTrabalhista;

public class EmpregadoTerceirizado extends Empregado{
	private Double bonus;
	
	public EmpregadoTerceirizado() {
		
	}

	public EmpregadoTerceirizado(String nome, Double horasTrabalhadas, Double valorHoraTrabalhada, Double bonus) {
		super(nome, horasTrabalhadas, valorHoraTrabalhada);
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "EmpregadoTerceirizado [bonus=" + bonus + "]";
	}
	
}

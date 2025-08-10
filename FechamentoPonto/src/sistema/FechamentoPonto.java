package sistema;

import contratosTrabalhista.Empregado;
import contratosTrabalhista.EmpregadoTerceirizado;

public final class FechamentoPonto {
	private Empregado empregado;
	private EmpregadoTerceirizado empregadoTerceirizado;
	private Double salarioColaborador;
	
	public FechamentoPonto() {
	}

	public FechamentoPonto(Empregado empregado, EmpregadoTerceirizado empregadoTerceirizado) {
		super();
		this.empregado = empregado;
		this.empregadoTerceirizado = empregadoTerceirizado;
	}

	
}

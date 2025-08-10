package sistema;

import contratosTrabalhista.Empregado;
import contratosTrabalhista.EmpregadoTerceirizado;

public final class FechamentoPonto {
	private Empregado empregado;
	private EmpregadoTerceirizado empregadoTerceirizado;
	
	public FechamentoPonto() {
		
	}

	public FechamentoPonto(Empregado empregado) {
		super();
		this.empregado = empregado;
	}

	public FechamentoPonto(EmpregadoTerceirizado empregadoTerceirizado) {
		super();
		this.empregadoTerceirizado = empregadoTerceirizado;
	}

	@Override
	public String toString() {
		return "FechamentoPonto [empregado=" + empregado + "\nempregadoTerceirizado=" + empregadoTerceirizado + "]";
	}
	
	
}

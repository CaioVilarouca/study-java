package contasUsuarios;

public class ContaPJ extends Conta {
	private Double LimiteEmp;
	
	
	public ContaPJ() {
		
	}


	public ContaPJ(Integer numero, String titular, Double saldo, Double limiteEmp) {
		super(numero, titular, saldo);  // Construtor da SuperClass 
		LimiteEmp = limiteEmp;
	}


	public Double getLimiteEmp() {
		return LimiteEmp;
	}


	public void setLimiteEmp(Double limiteEmp) {
		LimiteEmp = limiteEmp;
	}
	
	public void limte(Double amount) {
		// Qted a ser Emp nao pode ser mais q atributo LimiteEmp 
		if (amount <= LimiteEmp) {
			// Taxa de juros 10 
			saldo  += amount - 10.0;
		}
	}
	
	@Override
	public void retirada(Double amount) {
		super.retirada(amount);
		saldo -= 2.0;
	}
}

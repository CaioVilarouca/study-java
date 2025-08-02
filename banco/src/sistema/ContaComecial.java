package sistema;

public class ContaComecial extends Conta{
	private Double limiteEmp;
	
	public ContaComecial() {
		super();
	}

	public ContaComecial(Integer numeroConta, String titular, Double saldo, Double limiteEmp) {
		super(numeroConta, titular, saldo);
		this.limiteEmp = limiteEmp;
	}
	
	public void limite(Double amount) {
		if (saldo <= limiteEmp) {
			saldo -= limiteEmp;
		}
	}
}

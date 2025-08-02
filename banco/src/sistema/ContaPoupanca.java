package sistema;

public class ContaPoupanca extends Conta{
	private Double taxaJuros;
	
	public ContaPoupanca() {
		
	}

	public ContaPoupanca(Integer numeroConta, String titular, Double saldo, Double taxaJuros) {
		super(numeroConta, titular, saldo);
		this.taxaJuros = taxaJuros;
	}
	
	public void update() {
		taxaJuros -= 0.5;
	}
}

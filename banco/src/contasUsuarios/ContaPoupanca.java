package contasUsuarios;

public class ContaPoupanca extends Conta{
	private Double taxaJuros;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaJuros) {
		super(numero, titular, saldo);
		this.taxaJuros = taxaJuros;
	}

	public void updateSaldo() {
		saldo +=  saldo * taxaJuros;
	}
	
	@Override
	public final void retirada(Double amount) {
		saldo -= amount;
	}
}

package contasUsuarios;

public class Conta {
	private Integer numero;
	private String titular;
	protected Double saldo;
	
	public Conta() {
		
	}

	public Conta(Integer numero, String titular, Double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void retirada(Double amount) {
		// Um retirada N valor mais 5 de taxa juros
		saldo -= amount + 5;
	}
	
	public void deposito(Double amount) {
		saldo += amount;
	}
}

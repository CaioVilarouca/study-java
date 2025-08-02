package sistema;

public class Conta {
	private Integer numeroConta;
	private String titular;
	private Double saldo;
	
	public Conta() {
		
	}

	public Conta(Integer numeroConta, String titular, Double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void retirada(Double amount) {
		saldo -= amount;
	}
	
	public void deposito(Double amount) {
		saldo += amount;
	}

	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", titular=" + titular + ", saldo R$" + saldo + "]";
	}
}

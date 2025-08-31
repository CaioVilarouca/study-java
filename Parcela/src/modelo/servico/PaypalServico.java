package modelo.servico;

public class PaypalServico {
	public double taxaPagamento(Double quantidade) {
		return quantidade * 0.1;
	}
}

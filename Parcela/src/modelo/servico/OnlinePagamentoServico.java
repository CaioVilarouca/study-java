package modelo.servico;

public interface OnlinePagamentoServico {
	double taxaPagamento(double quantidade);
	double juros(double quantidade, int mes);
}
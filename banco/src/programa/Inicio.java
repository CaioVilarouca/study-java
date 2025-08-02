package programa;

import sistema.Conta;
import sistema.ContaComecial;
import sistema.ContaPoupanca;

public class Inicio {
	public static void main (String[] args) {
		new Inicio().contas();
	}
	public void contas() {
		Conta conta = new Conta(2004, "Thiago", 2098.0);
		ContaComecial contaComecial = new ContaComecial(010101, "Emily", 45.000, 400.0);
		ContaPoupanca contaPounaca = new ContaPoupanca(8080, "Arthur", 0.0, 0.5);
	}
}

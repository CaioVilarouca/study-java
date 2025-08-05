package start;

import contasUsuarios.Conta;
import contasUsuarios.ContaPJ;
import contasUsuarios.ContaPoupanca;

public class Program {
	public static void main (String[] args) {
		new Program().teste();
	}
	
	public void teste() {
		Conta contaTeste01 = new Conta(1001, "Alex", 1000.0);
		contaTeste01.retirada(200.0);
		System.out.println(contaTeste01.getSaldo());
		
		Conta contaTeste02 = new ContaPoupanca(1002, "Maria", 1000.0, 0.1);
		contaTeste02.retirada(200.0);
		System.out.println(contaTeste02.getSaldo());
		
		Conta contaTeste03 = new ContaPJ(1003, "Bob", 1000.0, 500.0);
		contaTeste03.retirada(200.0);
		System.out.println(contaTeste03.getSaldo());
	}
}

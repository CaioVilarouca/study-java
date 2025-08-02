package programa;

import sistema.Conta;

public class Inicio {
	public static void main (String[] args) {
		new Inicio().contas();
	}
	public void contas() {
		Conta conta = new Conta(2004, "Thiago", 2098.0);
		
		System.out.println(conta);
	}
}

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
		
		// UPCASTING 
		Conta conta01 = contaComecial;
		//    Super Class    Sub Class
		Conta conta02 = new ContaComecial(2003, "Caio", 25.0, 50.0);
		Conta conta03 = new ContaPoupanca(1098, "Jamison", 100.0, 0.0);
		
		// DOWCASTING
		ContaComecial conta04 = (ContaComecial)conta02;
		conta04.limite(100.0);

		if (conta04 instanceof ContaComecial) {
			System.out.println("POSITIVO!");
		}
		

		if (conta02 instanceof ContaPoupanca) {
			System.out.println("POSITIVO!");
		}else {
			System.out.println("NEGATIVO!");
		}
	}
}

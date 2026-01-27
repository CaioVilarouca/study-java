import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		new Program().system();
	}
	public void system() {
		System.out.println("CODIGO  ESPECIFICAÇÃO PREÇO");
		System.out.println("  1     HOT DOG       R$ 4.00");
		System.out.println("  2     X-Salada      R$ 4.50");
		System.out.println("  3     X-Bacon       R$ 5.00");
		System.out.println("  4     Torrada       R$ 2.00");
		System.out.println("  5     Regrigerante  R$ 1.50");
		
		String number01 = "HOT DOG";
		String number02 = "X-Salada";
		String number03 = "X-Bacon";
		String number04 = "Torrada";
		String number05 = "Regrigerante";
		
		double number01Value = 4.00;
		double number02Value = 4.50;
		double number03Value = 5.00;
		double number04Value = 2.00;
		double number05Value = 1.50;
		
		System.out.println("Informe o menu: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int amount = scanner.nextInt();
		
		if (number == 01)
			System.out.println("Produto ["+number01+"] Total R$ "+ (amount*number01Value));
		else if (number == 02)
			System.out.println("Produto ["+number02+"] Total R$ "+ (amount*number02Value));
		else if (number == 03)
			System.out.println("Produto ["+number03+"] Total R$ "+ (amount*number03Value));
		else if (number == 04)
			System.out.println("Produto ["+number04+"] Total R$ "+ (amount*number04Value));
		else if (number == 05)
			System.out.println("Produto ["+number05+"] Total R$ "+ (amount*number05Value));
		scanner.close();
	}
}

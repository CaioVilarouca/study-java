package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int counter=1,alcool=0,gasolina=0,disel=0;
		do {
			int inpunt=scanner.nextInt();
			if(inpunt==1)
				alcool++;
			else if (inpunt==2)
				gasolina++;
			else if (inpunt==3)
				disel++;
			counter++;
		}while (counter<=6);
		System.out.printf("MUITO OBRIGADO\nAlcool %d\nGasolina %d\nDisel %d",alcool,gasolina,disel);
		scanner.close();
	}
}

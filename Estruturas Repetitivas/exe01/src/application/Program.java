package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int sum=0;
		do{
			int x=scanner.nextInt(); 
			if(x==0)
				break;
			sum +=x;
		}while(true);
		scanner.close();
		System.out.println("Soma = "+sum);
	}
}

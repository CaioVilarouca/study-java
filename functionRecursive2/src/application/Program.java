package application;

public class Program {
	public static void main(String[] args) {
		int value=6;
		System.out.println("Soma: "+ fuction(value));
	}
	public static int fuction(int number) {
		if (number==0) {
			return 1;
		} else {
			return number + fuction(number-1);
		}
	}
}

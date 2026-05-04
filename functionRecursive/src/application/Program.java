package application;

public class Program {
	public static void main(String[] args) {
		new Program().system();
	}
	public void system() {
		int i=10;
		int number=0;
		fuctionRecursive(i, number);
		
	}
	
	public void fuctionRecursive(int num, int number) {
		if(num!=0) {
			System.out.println(number+=1);
			num--;
			fuctionRecursive(num, number);
		} 
	}
}

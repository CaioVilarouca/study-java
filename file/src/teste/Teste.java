package teste;

import java.io.BufferedReader;
import java.io.FileReader;

public class Teste {
	public static void main (String[] args) {
		String path = "/home/caio/Downloads/text.txt";
		
		FileReader fr = null;
		BufferedReader  br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			while(line  != null) {
				System.out.println(line);
				line = br.readLine();
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

package exerc�cios;

import java.util.Scanner;

public class EX01 {
	
	public static void main (String [] args) {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Entre com um n�mero: ");
			int n1 = sc.nextInt();
			System.out.println("Entre com outro n�mero: ");
			int n2 = sc.nextInt();
			
			int total = n1 + n2;
			
			System.out.println(total);
			
			sc.close();
	}
	

	
	
}

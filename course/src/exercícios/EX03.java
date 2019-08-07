package exercícios;

import java.util.Scanner;

public class EX03 {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com A: ");
		int a = sc.nextInt();
		System.out.println("Entre com B: ");
		int b = sc.nextInt();
		System.out.println("Entre com C: ");
		int c = sc.nextInt();
		System.out.println("Entre com D: ");
		int d = sc.nextInt();
		
		int diferenca = (a*b) - (c*d);
		 
		System.out.println("Diferença :" + diferenca);
		
		sc.close();
	}
}

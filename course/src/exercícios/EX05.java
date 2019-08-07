package exercícios;

import java.util.Scanner;

public class EX05 {

	public static void main (String args []) {
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("codigo de peca 1: ");
		//int cod1 = sc.nextInt(); ??? não será usado pra nada
		System.out.println("numero de pecas 1: ");
		int num1 = sc.nextInt();
		System.out.println("valor unitario peca 1");
		double valor1 = sc.nextDouble();
		
		//System.out.println("codigo peca 2: ");
		//int cod2 = sc.nextInt(); ???? não será usado pra nada
		System.out.println("numero de pecas 2: ");
		int num2 = sc.nextInt();
		System.out.println("valor unitario peca 2: ");
		double valor2 = sc.nextDouble();
		
		double total1 = num1 * valor1;
		double total2 = num2 * valor2;
		double valorApagar = total1 + total2;
		
		System.out.printf("Valor a pagar: %.2f.%n" , valorApagar);
		
		sc.close();
		
	}
}

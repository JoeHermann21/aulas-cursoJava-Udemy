package exerc�cios;

import java.util.Scanner;

public class EX02 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com o valor do raio do c�rculo ");
		double raio = s.nextDouble();
		double area = Math.PI * (raio*raio);
		
		
		System.out.println("A �rea do c�rculo �: " + area);
		
		s.close();
	}
}

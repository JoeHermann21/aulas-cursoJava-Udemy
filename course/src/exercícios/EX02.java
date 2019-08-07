package exercícios;

import java.util.Scanner;

public class EX02 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com o valor do raio do círculo ");
		double raio = s.nextDouble();
		double area = Math.PI * (raio*raio);
		
		
		System.out.println("A área do círculo é: " + area);
		
		s.close();
	}
}

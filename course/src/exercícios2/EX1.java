package exercícios2;

import java.util.Scanner;

public class EX1 {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Entre com um número: ");
		numero = sc.nextInt();
		
		if (numero > 0) {
			System.out.println("Positivo");
		} else if (numero < 0 ){
			System.out.println("Negativo");
		}else {
			System.out.println("Não negativo");
		}
		sc.close();
	}}

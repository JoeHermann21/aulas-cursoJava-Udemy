package exerc�cios2;

import java.util.Scanner;

public class EX1 {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Entre com um n�mero: ");
		numero = sc.nextInt();
		
		if (numero > 0) {
			System.out.println("Positivo");
		} else if (numero < 0 ){
			System.out.println("Negativo");
		}else {
			System.out.println("N�o negativo");
		}
		sc.close();
	}}

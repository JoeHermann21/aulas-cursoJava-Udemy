package exerc�cios2;

import java.util.Scanner;

public class EX2 {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero: ");
		int numero = sc.nextInt();
		
		if (numero %2 == 0 ) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
		
		sc.close();
	}
}

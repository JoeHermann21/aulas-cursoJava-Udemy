package exercícios2;

import java.util.Scanner;

public class EX6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double valor;
		
		System.out.println("entre com um valor: ");
		valor = sc.nextDouble();
		
		/* outra solucao
		 * if (numero < 0 || numero > 100)
		 */
		
		if (valor >0 && valor<=25) {
			System.out.println("Intervalo [0,25]");
		}else if (valor >25 && valor <=50) {
			System.out.println("Intervalo (25,50]");
		}else if (valor> 50 && valor <=75){
			System.out.println("Intervalo (50,75]");
		}else if (valor>75 && valor <=100) {
			System.out.println("Intervalo (75,100]");
		}else{
			System.out.println("Fora do intervalo");
		}
		
		sc.close();
	}
}

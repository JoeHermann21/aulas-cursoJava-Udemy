package exercicios4;

import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com um valor inteiro: ");
		int X = sc.nextInt();
		int cont;
		
		for (cont = 1; cont <= X; cont++) {
			// a condi��o deste if estava na condi��o do for com o "cont <=X && cont % 2 != 0"
			if (cont % 2 != 0) {
				System.out.println(cont);
			}
			
		}
		
		sc.close();
		}	
		

}
package exercícios2;

import java.util.Scanner;

public class EX7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com 2 valores (Mesma Linha): ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		}
		
		/*else if (x==0) {
			System.out.println("Eixo X");
		}
		else if(y == 0) {
			System.out.println("Eixo Y");
		}*/
		
		else if (x <0 && y>0) {
			System.out.println("Q2");
		}else if(x<0 && y<0) {
			System.out.println("Q3");
		}else if (x>0 && y<0) {
			System.out.println("Q4");
		}else if (x>0 && y>0) {
			System.out.println("Q1");					
		}
		
		
		sc.close();
	}
}

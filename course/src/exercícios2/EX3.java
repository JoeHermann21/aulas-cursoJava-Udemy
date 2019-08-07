package exercícios2;

import java.util.Scanner;

public class EX3 {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com 2 valores (na mesma linha): ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// mais bonito seria if (a % b == 0 || b % a == 0 ){
		if ( b % a == 0) {
			System.out.println("São múltiplos");
		} else if ( a % b == 0){
			System.out.println("São multiplos");
		}else {
			System.out.println("Não são multiplos");
		}
		
		sc.close();
	}
}

package exercicios4;

import java.util.Scanner;

public class E4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o valor N: ");
		int n = sc.nextInt();

		for (int x = 0; x < n; x++) {
			System.out.println("Entre com o valor: ");
			int n1 = sc.nextInt();
			System.out.println("Entre com o outro valor: ");
			int n2 = sc.nextInt();
			if (n2 == 0) {
				System.out.println("Divisao impossivel");
			} else {
				double divisao = (double) n1 / n2;
				System.out.println(divisao);
			}

		}

		
		sc.close();
	}
}

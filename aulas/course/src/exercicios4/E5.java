package exercicios4;

import java.util.Scanner;

public class E5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com um nº: ");
		int n = sc.nextInt();
		int fat = 1;

		for (int i = 1; i < n; i++) {
			fat *= (n - i);
			if (n==0) {
				n = 1;
				System.out.println(n);
			}
		}
		System.out.println(n * fat);
		sc.close();
	}
}

package exercicios4;

import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com um inteiro: ");
		int N = sc.nextInt();
		int X;
		int in = 0;
		int out = 0;

		for (X = 0; X <= N; X++) {
			System.out.println("Entre com um inteiro: ");
			N = sc.nextInt();

			if (N >= 10 && N <= 20) {
				in = in + 1;

			} else {
				out = out + 1;

			}

		}

		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();
	}

}

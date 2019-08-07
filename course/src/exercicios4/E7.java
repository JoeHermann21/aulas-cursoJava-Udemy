package exercicios4;

import java.util.Scanner;

public class E7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("entre com um nº: ");
		int N = sc.nextInt();
		int mult = 1;
		
		for(int i=1 ; i<=N; i++) {
			mult = i * i;
			System.out.print(i + " " + mult + " ");
			mult = mult * i;
			System.out.println(mult);
		}
		
		sc.close();
	}
}

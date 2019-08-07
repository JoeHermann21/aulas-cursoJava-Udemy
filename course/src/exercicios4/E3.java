package exercicios4;

import java.util.Scanner;

public class E3 {
	//exercício do INFERNOOOOO
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.println(media);
		}
		
		sc.close();
}
	
}



package exercicios3;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {

		Scanner beast = new Scanner(System.in);

		System.out.println("Entre com dois valores: ");
		
		int x = beast.nextInt();
		int y = beast.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
				/*x = beast.nextInt();
				y = beast.nextInt();*/
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
				/*x = beast.nextInt();
				y = beast.nextInt();*/
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
				/*x = beast.nextInt();
				y = beast.nextInt();*/
			} else {
				System.out.println("quarto");
				/*x = beast.nextInt();
				y = beast.nextInt();*/
			}
			x = beast.nextInt();
			y = beast.nextInt();
			
		}
			beast.close();


	}

}

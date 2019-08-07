package exercicios3;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("------------Cód Produto-------------");
		System.out.println(" 		     1 - Alcool 			");
		System.out.println(" 			 2 - Gasolina 		    ");
		System.out.println(" 		     3 - Diesel 			");
		System.out.println(" 			 4 - Fim 			    ");
		System.out.println("------------------------------------");
		System.out.println("									");
		System.out.println("Entre com o código:                 ");
		int cod = sc.nextInt();
		int a = 0;
		int g = 0;
		int d = 0;
		
		while (cod != 4) {
			System.out.println("Entre com o código:                 ");
			cod = sc.nextInt();
			switch(cod) {
			case 1:
				a = a + 1;				
				break;
			case 2:
				g = g + 1;
				break;
			case 3:
				d = d + 1;
				break;
			}}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + a);
		System.out.println("Gasolina: " + g);
		System.out.println("Diesel: " + d);
		System.out.println();
		
		sc.close();
	}}

package exercícios2;

import java.util.Scanner;

public class EX5 {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------------------------------------");
		System.out.println("Codigo       Especificação    Preço ");
		System.out.println(" 1              Hot Dog      R$ 4,00");
		System.out.println(" 2              X Salada     R$ 4,50");
		System.out.println(" 3              X Bacon      R$ 5,00");
		System.out.println(" 4      Torrada Simples      R$ 2,50");
		System.out.println(" 5              Refrigerante R$ 1,50");
		System.out.println("------------------------------------");
		
		int opcao;
		double valor1 = 0;
		int quantidade;
		
		System.out.println("Entre com uma opcao: ");
		opcao = sc.nextInt();
		System.out.println("Entre com a quantidade");
		quantidade = sc.nextInt();
		
		
		if (opcao == 1) {
			valor1 = 4.0;
		}else if (opcao == 2){
			valor1 = 4.5;			
		}else if (opcao == 3) {
			valor1 = 5.0;
		}else if (opcao == 4) {
			valor1 = 2.5;
		}else if (opcao ==5) {
			valor1 = 1.5;
		}else {
			System.out.println("não existe!!!");
		}
		
				
		System.out.println("Total : " + valor1 * quantidade);
		
		sc.close();
	}
}

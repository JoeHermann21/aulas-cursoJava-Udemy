package exercícios2;

import java.util.Scanner;


//olhei a resposta
public class EX4 {

	public static void main (String []args) {		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a hora de início do jogo: ");
		int inicio = sc.nextInt();
		System.out.println("Entre com a hora do fim do jogo: ");
		int fim = sc.nextInt();
		
		int duracao;
		if (inicio < fim) {
			duracao = fim - inicio;
		}else {
			duracao = 24 - inicio + fim;
		}
		
		System.out.println("O jogo durou " + duracao + " horas");
		
		sc.close();
	}
}

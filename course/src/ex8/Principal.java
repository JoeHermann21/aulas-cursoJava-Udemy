package ex8;

import java.util.Scanner;

import ex8entities.Estudante;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		while (n < 0 || n > 10) {
			System.out.println("So há dez quartos disponíveis! Favor entrar com outro valor: ");
			n = sc.nextInt();
		}
		Estudante[] vect = new Estudante[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Aluguel nº " + (i+1));
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Nº do quarto a alugar: ");
			int quarto = sc.nextInt();
			vect[i] = new Estudante(nome, email, quarto);
		}

		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < n; i++) {
			System.out.print(vect[i].getNumQuarto());
			System.out.print(" ");
			System.out.print(vect[i].getNome());
			System.out.print(" ");
			System.out.print(vect[i].getEmail());
			System.out.print(" ");
			System.out.println();
		}

		sc.close();
	}

}

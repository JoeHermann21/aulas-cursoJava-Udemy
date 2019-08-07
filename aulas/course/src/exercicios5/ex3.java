package exercicios5;

import java.util.Scanner;

import exercicios5entities.Aluno;

public class ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Aluno idiota = new Aluno();

		System.out.println("Digite o nome: ");
		idiota.nome = sc.nextLine();
		System.out.println("Digite a primeira nota");
		idiota.nota1 = sc.nextDouble();
		while (idiota.nota1 > 30) {
			System.out.println("Ninguém tira mais que 30! Digite novamente");
			idiota.nota1 = sc.nextDouble();
		}
		System.out.println("Digite a segunda nota");
		idiota.nota2 = sc.nextDouble();
		while (idiota.nota2 > 35) {
			System.out.println("Ninguém tira mais que 35! Digite novamente");
			idiota.nota2 = sc.nextDouble();
		}
		System.out.println("Digite a terceira nota");
		idiota.nota3 = sc.nextDouble();

		while (idiota.nota3 > 35) {
			System.out.println("Ninguém tira mais que 35! Digite novamente");
			idiota.nota3 = sc.nextDouble();
		}

		if (idiota.notaFinal() >= 60) {
			System.out.println(idiota.notaFinal());
			System.out.println("Aprovado");
		} else {
			System.out.println(idiota.notaFinal());
			System.out.println("Reprovado");
			System.out.println("Faltam " + (60 - idiota.notaFinal()) + "Pontos");
		}

		sc.close();
	}
}

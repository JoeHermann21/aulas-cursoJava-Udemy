package exercicio7;

import java.util.Scanner;

import exercicio7entities.ContaBancaria;
import exercicio7entities.DomainException;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ContaBancaria cb;

		System.out.println("Entre com os dados da Conta: ");
		System.out.println("Numero Conta: ");
		int numeroConta = sc.nextInt();
		System.out.println("Nome do Titular: ");
		String nome = sc.next();
		System.out.println("É sua primeira vez aqui? (s/n) ");
		char resposta = sc.next().charAt(0);
		double saqueInicial = 0;
		

		while (resposta != 's' && resposta != 'n') {
			System.out.println("Valor inválido, digite novamente");
			resposta = sc.next().charAt(0);
		}
		if (resposta == 's') {
			System.out.println("Depósito inicial: ");
			saqueInicial = sc.nextDouble();
			cb = new ContaBancaria(numeroConta, nome, saqueInicial);

		} else {
			cb = new ContaBancaria(numeroConta, nome);
		}

		cb.setValorInicial(saqueInicial);
		cb.adicionarValorDeposito();

		cb.setNumeroConta(numeroConta);
		cb.setNomeTitular(nome);
		cb.setValorInicial(saqueInicial);

		System.out.println("Dados do Cliente: " + numeroConta + " " + nome + " " + saqueInicial);

		System.out.println(" ");

		System.out.println("Entre com o valor para depósito: ");
		double valorDeposito = sc.nextDouble();
		cb.setValorInicial(valorDeposito);
		cb.adicionarValorDeposito();

		System.out.println("Dados do Cliente atualizados: " + cb);

		
			System.out.println("Entre com o valor para saque: ");
			double valorSaque = sc.nextDouble();
		try {
			cb.setValorInicial(valorSaque);
			valorSaque = cb.adicionarValorSaque();
			System.out.println("Dados do Cliente atualizados: " + cb);

		} catch (DomainException e) {
			System.out.println("Erro de saque: " + e.getMessage());

		}
		
		sc.close();
	}
}

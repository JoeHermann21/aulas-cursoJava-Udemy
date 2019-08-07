package ex9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ex9entites.Funcionario;

public class Aplicacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();
		Funcionario f = new Funcionario();

		System.out.println("Quantos empregados serão registrados?  ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println("Empregado Nº " + i);
			System.out.println("Id: ");
			int id = sc.nextInt();
			f.setId(id);
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			f.setNome(nome);
			sc.nextLine();
			System.out.println("Salário: ");
			double salario = sc.nextDouble();
			f.setSalario(salario);
			list.add(new Funcionario(id, nome, salario));

		}

		System.out.println("Entre com o id do empregado cujo salário será incrementado: ");
		int id = sc.nextInt();
		f = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (f == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Entre com a porcentagem: ");
			double acrescimo = sc.nextDouble();
			f.acrescimo(acrescimo);
		}

		System.out.println("Lista de funcionarios: ");
		for (Funcionario obj : list) {
			System.out.println(obj);
		}
		sc.close();
	}
}

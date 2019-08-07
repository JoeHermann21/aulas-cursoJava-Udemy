package exercicios5;

import java.util.Scanner;

import exercicios5entities.Funcionario;

public class ex2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Funcionario func = new Funcionario();
		
		System.out.println("Entre com os dados: ");
		System.out.println("Nome: ");
		func.nome = sc.nextLine();
		System.out.println("Salário bruto: ");
		func.salarioBruto = sc.nextDouble();
		System.out.println("Imposto: ");
		func.imposto = sc.nextDouble();
		
		System.out.println(func);
		
		System.out.println("Qual o valor do percentual a ser acrescentado ao salario? (%): ");
		func.acrescimoSalario(sc.nextDouble());
		
		System.out.println("Dados Atualizados: " + func);
		
		System.out.println();
		sc.close();
		
	}

}

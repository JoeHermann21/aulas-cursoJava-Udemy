package principal;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Empregado;
import entities.EmpregadoTercerizado;

public class AppEmpregado {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Empregado> e = new ArrayList<Empregado>();
		
		System.out.println("Entre com o número de empregados a serem cadastrados: ");
		int n = sc.nextInt();
		
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Dados do Empregado Nº " + i);
			System.out.println("Tercerizado? (s/n)");
			char op = sc.next().charAt(0);
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();	
			System.out.println("Horas trabalhadas: ");

			int horas = sc.nextInt();
			System.out.println("valor por hora: ");
			Double valor = sc.nextDouble();			
			if (op== 's') {
				System.out.println("Despesa adicional: ");
				Double despesa = sc.nextDouble();
				e.add(new EmpregadoTercerizado(nome, horas, valor, despesa));
			}else {
				e.add(new Empregado(nome, horas, valor));
			}
			
		}
		
		System.out.println("Pagamentos: ");
		System.out.println(e);

		sc.close();
				
	}

}

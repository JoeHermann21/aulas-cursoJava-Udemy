package exercícios2;

import java.util.Scanner;

public class EX8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qunato você ganha? ");
		double salario = sc.nextDouble();
		
		if (salario >0 && salario<= 2000) {
			System.out.println("Isento" );
		}else if (salario <= 3000) {
			System.out.println("8% ");
			System.out.println("Valor Imposto " + ((salario-2000)*0.08) );
		}else if (salario <= 4500) {
			System.out.println("18%");
			System.out.println("Valor Imposto " + ((salario-3000)*0.18 + 1000 * 0.08));
		}else{
			System.out.println("28%");
			System.out.println("Valor Imposto " + ((salario-4500)*0.28 + 1500.0 * 0.18 + 1000.0 * 0.08));
		}
		
		sc.close();
	}
}

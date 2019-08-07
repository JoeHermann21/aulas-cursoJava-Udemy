package exercícios;

import java.util.Scanner;

public class EX04 {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o Num: ");
		int num = sc.nextInt();		
		System.out.println("Entre com o numero de horas trabalhadas: ");
		int hr = sc.nextInt();
		System.out.println("Entre com o valor/hr: ");
		double valHr = sc.nextDouble();
		
		double salario = valHr * hr ;
		
		System.out.println("Numero: " + num);
		System.out.printf("Salario: %.2f%n ", salario);
		
		
		sc.close();
	}
}

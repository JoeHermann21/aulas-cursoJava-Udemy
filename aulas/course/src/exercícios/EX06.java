package exercícios;

import java.util.Scanner;

public class EX06 {

	public static void main (String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("Digite três valores (na mesma linha): ");		
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		
		double triangulo = (a * c)/2;
		double circulo = Math.PI * (c * c);
		double trapezio = ((a+b)*c)/2;
		double quadrado = b * b;
		double retangulo = b * a;		
		
		System.out.println("Triangulo: " + triangulo );
		System.out.println("Circulo: " + circulo);
		System.out.println("Trapezio: " + trapezio);
		System.out.println("Quadrado: " + quadrado);
		System.out.println("Retangulo: " + retangulo);

		scanner.close();
	}
}

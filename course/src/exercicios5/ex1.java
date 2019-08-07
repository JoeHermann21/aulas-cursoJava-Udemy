package exercicios5;

import java.util.Scanner;

import exercicios5entities.Retangulo;

public class ex1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com a largura e a altura do triângulo: ");
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();
		
		System.out.println(retangulo);
		
		sc.close();
	}

}

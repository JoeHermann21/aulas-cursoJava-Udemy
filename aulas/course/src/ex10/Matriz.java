package ex10;

import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite m: ");
		int m = sc.nextInt();
		System.out.println("Digite n: ");
		int n = sc.nextInt();
		
		int mat[][] = new int[m][n];
		
		for (int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.println("Digite um n�mero: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite x: ");
		int x = sc.nextInt();
		for (int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if (x == mat[i][j]) {
					System.out.println("Posi��o " + i +","+ j + " :");
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Em cima: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Direita: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Embaixo: " + mat[i+1][j]);
}
				}
			}
		}
		
		sc.close();
	}

}

package exercicios3;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha: ");
		int senha = sc.nextInt();
		int tentativa = 0;
		
		while(senha != 2002) {
			System.out.println("Senha inv�lida, tente novamente: ");
			senha = sc.nextInt();
			tentativa = tentativa+1;
			//quis me desafiar um pouco com essa op��o de bloquear a senha ap�s 10 tentativas
			if( tentativa > 10) {
				System.out.println("SENHA BLOQUEADA!!!");
				break;
			}	
		}	
		
		//sem esse desafio, n�o teria esse if
		if(senha == 2002){
			System.out.println("Acesso permitido");
			sc.close();
		
		}else {
			
		}
		
						
		
	}
}

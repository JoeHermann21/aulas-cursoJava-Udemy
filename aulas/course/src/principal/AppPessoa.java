package principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AppPessoa {

	public static void main(String[] args) {
				
		File arquivo = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(arquivo);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			
		}
			}catch (FileNotFoundException e){
				System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
			
		}finally {
			if (sc !=null) {
				sc.close();
			}
			System.out.println("FIM");
			
		}
		
		
	}
}

package PastasPrincipal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
	
		public static void main(String[] args) {
			
			String [] lines =  new String[] {"TV LED, 1290.99, 1", 
					"Video Game Chair, 350.50, 3", 
					"Samsung Galaxy 9, 850.00, 2"};
			
			String caminho = "c:\\temp\\summary.csv";{
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter (caminho, true))){
				for (String line : lines) {
					bw.write(line);
					bw.newLine();
				}
			}catch (IOException e) {
				e.printStackTrace();
			} 

		}					
			caminho = "c:\\temp\\summary.csv";
			try (BufferedReader br = new BufferedReader(new FileReader(caminho))){
				String line = br.readLine();
				while (line != null) {
					System.out.println(line);
					line = br.readLine();
				}
			}catch (IOException e) {
				System.out.println("Erro: " + e.getMessage());
			} 
		} 
	}



package ex13principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import ex13.model.entities.Contrato;
import ex13.model.entities.Prestacao;
import ex13.model.service.ContratoServico;
import ex13.model.service.ServicoPayPal;

public class MainContrato {

	public static void main(String[] args) throws ParseException {
			Scanner sc = new Scanner(System.in);
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			System.out.println("Entre com os dados do contrato: ");
			System.out.println("Numero: ");
			Integer numero = sc.nextInt();
			System.out.println("Data do contrato: ");
			sc.nextLine();
			Date data = sdf.parse(sc.nextLine());
			System.out.println("Valor do contrato: ");
			Double valor = sc.nextDouble();
			
			Contrato c = new Contrato(numero, data, valor);


			System.out.println("Entre com o nº de parcelas: ");
			int n = sc.nextInt();
			
			ContratoServico cs = new ContratoServico(new ServicoPayPal());
			cs.ContratoProcesso(c, n);

			
			System.out.println("parcelas: ");
			for (Prestacao x : c.getPrestacoes()) {				
				System.out.println(x);
			}
			sc.close();


	}

}

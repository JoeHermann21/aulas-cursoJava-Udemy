package ex11;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import ex11entities.Cliente;
import ex11entities.Item;
import ex11entities.OrderStatus;
import ex11entities.Pedido;
import ex11entities.Product;

public class App {
public static void main(String[] args) throws ParseException {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Nome: ");
	String nomeCliente = sc.nextLine();
	System.out.println("Email: ");
	String email = sc.nextLine();
	System.out.println("Data de Nascimento: ");
	String dataRecebida = sc.nextLine();
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");   
	Date dataNascimento = df.parse(dataRecebida);

	Cliente c = new Cliente(nomeCliente, email, dataNascimento);	
	
	System.out.println("Status do pedido: ");
	String status = sc.nextLine();
	OrderStatus os1 = OrderStatus.valueOf(status);
	
	Pedido pe = new Pedido(dataNascimento, os1, c);	

	System.out.println("Digite o número de itens para o pedido: ");
	int n = sc.nextInt();
	
	for (int i=1; i<=n; i++) {
		
		System.out.println("Entre com os dados do produto Nº: " + i);
		System.out.println("Entre com o nome do produto: ");
		String nome = sc.nextLine();
		sc.nextLine();		
		System.out.println("Entre com o preco: ");
		Double preco = sc.nextDouble();
		
		Product pr = new Product(nome, preco);
		
		System.out.println("Entre com a quantidade: ");
		Integer quantidade = sc.nextInt();

		Item it = new Item(quantidade, preco, pr);
		
		pe.addItem(it);
	}
	
	System.out.println("Lista de Pedidos: ");
	System.out.println(pe);
	
	
	sc.close();
}
}

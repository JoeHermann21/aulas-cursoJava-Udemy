package principal;

public class AppProduto {

	/*
	 * public static void main(String[] args) throws ParseException {
	 * 
	 * Scanner sc = new Scanner(System.in); SimpleDateFormat sdf = new
	 * SimpleDateFormat("dd/MM/yyyy");
	 * 
	 * System.out.println("Entre com o número de produtos: "); int num =
	 * sc.nextInt();
	 * 
	 * ArrayList<Produto> p = new ArrayList<Produto>();
	 * 
	 * 
	 * for(int i=1; i<=num; i++) { sc.nextLine();
	 * System.out.println("Dados do produto # " + i);
	 * System.out.println("Comum, usado ou importado? (c/u/i)? "); char op =
	 * sc.nextLine().charAt(0); System.out.println("Nome: "); String nome =
	 * sc.nextLine(); System.out.println("Preco: R$ "); Double preco =
	 * sc.nextDouble(); switch(op) { case 'c': p.add(new Produto(nome,preco));
	 * break; case 'u': System.out.println("Data de Fabricacao: "); sc.nextLine();
	 * Date data = sdf.parse(sc.next()); p.add(new ProdutoUsado(nome,preco,data));
	 * break; case 'i': System.out.println("Taxa de alfândega: R$ "); Double pa =
	 * sc.nextDouble(); p.add(new ProdutoImportado(nome, preco, pa)); break; }
	 * 
	 * 
	 * 
	 * }
	 * 
	 * System.out.println("Dados dos produtos: "); System.out.println(p);
	 * 
	 * 
	 * sc.close();
	 * 
	 * 
	 * }
	 */

	/*Comparator
	public static void main(String[] args) {
		
		List<Produto> list = new ArrayList<>();
		
		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 1200.00));
		list.add(new Produto("Tablet", 450.00));
		list.add(new Produto("HD Case", 80.90));
		
		//expressão lambda
		list.sort((p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));
		
		for (Produto p : list) {
			System.out.println(p);
		}

}*/

//	public static void main(String[] args) {
//		
//		List<Produto> list = new ArrayList<>();
//		
//		list.add(new Produto("TV", 900.00));
//		list.add(new Produto("Notebook", 1200.00));
//		list.add(new Produto("Tablet", 450.00));
//		list.add(new Produto("HD Case", 80.90));
//		
//		//Predicate<Produto> pred = p -> p.getPreco() >= 100;
//		
//		list.removeIf(p -> p.getPreco() >= 100);
//		
//		for (Produto p : list) {
//			System.out.println(p);
//		}
//		
//	}
	
//	public static void main(String[] args) {
//		List <Produto> list = new ArrayList<>();
//		
//		list.add(new Produto("TV", 900.00));
//		list.add(new Produto("Notebook", 1200.00));
//		list.add(new Produto("Tablet", 450.00));
//		list.add(new Produto("HD Case", 80.90));
//		
//		//list.forEach(new AtualizaPreco());
//		
//		//list.forEach(Produto::atualizaPreco);
//		
//		//list.forEach(Produto::atualizaPrecoNaoEstatico);
//		
////		for (Produto p: list) {
////			System.out.println(p);
////		}
//		
////		Consumidor<Produto> cons = p -> {
////			p.setPreco(p.getPreco() * 1.1);
////		};
//		
//		//list.forEach(cons);
//		
//		//list.forEach(p -> p.setPreco(p.getPreco() * 1.1));	
//		
//		list.forEach(System.out::println);
//				
//	}
	

}
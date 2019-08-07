package course;

/*public class Principal {

	public static void main(String[] args) {
		
		FormaAbstrata f1 = new Circulo(Cor.BRANCO, 2.0);
		FormaAbstrata f2 = new Retangulo(Cor.PRETO, 3.0, 4.0);
		
		System.out.println("Cor do circulo: " + f1.getCor() + " Area: " + f1.area());
		System.out.println("Cor do retangulo: " + f2.getCor() + " Area: " + f2.area());
		

	}
} */


/* public class Principal {
	public static void main(String[] args) {
		List<Empregado> list = new ArrayList<>();		
		String path = "C:\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String empregadoCsv = br.readLine();
			while (empregadoCsv != null) {
				String [] fields = empregadoCsv.split(",");
				list.add(new Empregado(fields[0], Double.parseDouble(fields[1])));
				empregadoCsv = br.readLine();
			}
			Collections.sort(list);
			for (Empregado emp : list) {
				System.out.println(emp);
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
} */


//	public static void main(String[] args) {
//		
//		Map<String, String> biscoitos = new TreeMap<>();
//		
//		biscoitos.put("usuario", "Maria");
//		biscoitos.put("email", "maira@gmail.com");
//		biscoitos.put("telefone", "666");
//		
//		biscoitos.remove("email");
//		biscoitos.put("telefone", "667");
//		
//		System.out.println("Contains phone key: " + biscoitos.containsKey("telefone"));
//		System.out.println("Telefone: " + biscoitos.get("telefone"));
//		System.out.println("Email: " + biscoitos.get("email"));
//		
//		System.out.println("ALL COOKIES: ");
//		for(String key: biscoitos.keySet()) {
//			System.out.println(key + ": " + biscoitos.get(key));
//		}
//	
//	}

public class Principal {	
	
}
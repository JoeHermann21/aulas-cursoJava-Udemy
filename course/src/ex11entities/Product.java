package ex11entities;

public class Product {
	
	private String nome;
	private Double preco;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Product(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	public Product() {

	}
	
	

}

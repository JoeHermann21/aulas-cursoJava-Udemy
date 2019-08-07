package entities;

public class Produto {

	protected String nome;
	protected Double preco;
	
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
	
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto() {
	}
	
	public String etiquetaPreco() {
		return "R$ " + preco;
	}
	
	public static boolean predicadoDeProdutoEstatico(Produto p) {
		return p.getPreco() >= 100.0;		
	}
	
	public boolean predicadoDeProdutoNaoEstatico() {
		return preco >= 100.0;		
	}
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + "]";
	}
	
	public static void atualizaPreco(Produto p) {
		p.setPreco(p.getPreco() * 1.1);
	}
	
	public void atualizaPrecoNaoEstatico() {
		preco = preco + (preco * 0.1);
	}
	
}

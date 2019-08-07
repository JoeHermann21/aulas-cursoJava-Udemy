package ex11entities;

public class Item {
	
	private Integer quantidade;
	private Double preco;
	
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Item() {
		
	}
	
	private Product produto;	
	
	
	public Item(Integer quantidade, Double preco, Product produto) {
		super();
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}
	public Product getProduto() {
		return produto;
	}
	public void setProduto(Product produto) {
		this.produto = produto;
	}
	public Item(Integer quantidade, Double preco) {
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public Double subTotal() {
		return preco * quantidade;
	}
	
	public String toString() {
		return produto.getNome() + ", R$ " + preco + ", Quantidade: " + quantidade + ", Subtotal: " + subTotal();
	}
	
	

}

package entities;

public class ProdutoImportado extends Produto {

	private Double taxaAlfandega;

	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}

	public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public ProdutoImportado() {
		super();
	}

	public Double precoTotal() {
		return preco + taxaAlfandega;
	}

	@Override
	public String etiquetaPreco() {
		return "Nome: " + nome + "Preço = R$ " + precoTotal() + " Taxa de alfândega = R$: " + taxaAlfandega +
				" Total = R$ " + precoTotal();
	}
	
	@Override
	public String toString() {
		return "ProdutoImportado " + etiquetaPreco();
	}

}

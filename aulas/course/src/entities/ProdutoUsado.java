package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
	
	private Date dataFabricacao;

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public ProdutoUsado(String nome, Double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}
	
	public ProdutoUsado() {
		super();
	}
	
	@Override
	public String etiquetaPreco() {
		SimpleDateFormat normal = new SimpleDateFormat("dd/MM/yyyy");
		return  "Nome: " + nome + "R$ " + preco + " Data de Fabricação: " + normal.format(dataFabricacao);
	}

	@Override
	public String toString() {
		return "ProdutoUsado" + etiquetaPreco();
	}

	

}

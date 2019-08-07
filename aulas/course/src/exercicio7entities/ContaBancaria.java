package exercicio7entities;

public class ContaBancaria {
	
	private int numeroConta;
	private String nomeTitular;
	private double valorInicial;
	private double valorFinal;
	
	
	public void setValorInicial(double valorInicial) {
		this.valorInicial = valorInicial;
	}

	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

		
	public ContaBancaria(int numeroConta, String nomeTitular) {
		super();
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}

	public ContaBancaria(int numeroConta, String nomeTitular, double valorInicial) {
		super();
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.valorInicial = valorInicial;
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	

	public double getValorInicial() {
		return valorInicial;
	}

	public double getValorFinal() {
		return valorFinal;
	}

	public String toString() {
		return numeroConta + " " + nomeTitular + " " + valorInicial + " " +valorFinal;
	}
	
	public double adicionarValorDeposito() {
		return valorFinal += valorInicial ;
	}
	
	public double adicionarValorSaque() {
		return valorFinal -= valorInicial + 5;
	}
	
	public ContaBancaria() {
		
	}
}

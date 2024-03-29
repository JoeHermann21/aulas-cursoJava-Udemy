package entities;

public class Empregado {
	
	protected String nome;
	protected Integer horas;
	protected Double valorPorHora;
	
	public Empregado(String nome, Integer horas, Double valorPorHora) {
		this.nome = nome;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
	}

	public Empregado() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	public Double pagamento() {
		return horas*valorPorHora;
	}

	@Override
	public String toString() {
		return "Empregado [nome: " + nome + ", R$ "	+ pagamento() + "]";
	}
	
	
	

}

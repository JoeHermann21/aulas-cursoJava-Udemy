package entities;

public class EmpregadoTercerizado extends Empregado {
	
	private Double despesaAdicional;

	public Double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(Double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}

	public EmpregadoTercerizado(String nome, Integer horas, Double valorPorHora, Double despesaAdicional) {
		super(nome, horas, valorPorHora);
		this.despesaAdicional = despesaAdicional;
	}

	public EmpregadoTercerizado() {
		super();
	}
	
	@Override
	public Double pagamento() {
		return (horas*valorPorHora) + (despesaAdicional*1.1);
	}
	
	@Override
	public String toString() {
		return "Empregado [nome: " + nome + ", R$ "	+ pagamento() + "]";
	}

}

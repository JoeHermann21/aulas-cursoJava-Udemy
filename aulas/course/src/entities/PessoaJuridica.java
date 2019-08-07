package entities;

public class PessoaJuridica extends Pessoa {

	private Integer numeroFuncionarios;

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public PessoaJuridica() {
		super();
	}

	@Override
	public Double imposto() {
		if (numeroFuncionarios > 10) {
			return rendaAnual * 0.14 ;
		} else {
			return rendaAnual * 0.16;
		}
	}

}

package ex13.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestacao {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
	
	private Date dataVencimento;
	private Double saldo;
	
	public Prestacao() {
		
	}
	
	public Prestacao(Date dataVencimento, Double saldo) {
		this.dataVencimento = dataVencimento;
		this.saldo = saldo;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Prestacao [dataVencimento=" + sdf.format(dataVencimento) + ", saldo=" + saldo + "]";
	}
	
	
	

}

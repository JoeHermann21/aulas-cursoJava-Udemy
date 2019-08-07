package ex13.model.service;

import java.util.Calendar;
import java.util.Date;

import ex13.model.entities.Contrato;
import ex13.model.entities.Prestacao;

public class ContratoServico {
	
	private ServicoPagamentoOnline servicoPagamentoOnline;	
			
	public ServicoPagamentoOnline getServicoPagamentoOnline() {
		return servicoPagamentoOnline;
	}

	public void setServicoPagamentoOnline(ServicoPagamentoOnline servicoPagamentoOnline) {
		this.servicoPagamentoOnline = servicoPagamentoOnline;
	}

	public ContratoServico(ServicoPagamentoOnline servicoPagamentoOnline) {
		this.servicoPagamentoOnline = servicoPagamentoOnline;
	}

	public void ContratoProcesso(Contrato c, Integer meses) {
		double parcelaBasica = c.getValorTotal() / meses;
		for (int i = 1; i <=meses; i++) {
			Date data = adicionarMeses(c.getData(), i);
			Double parcelaAtualizada = parcelaBasica + servicoPagamentoOnline.juros(parcelaBasica, i);
			Double parcelaInteira = parcelaAtualizada + servicoPagamentoOnline.taxaPagamento(parcelaAtualizada);
			c.adicionarPrestacao(new Prestacao (data, parcelaInteira));
		}
	}
	
	private Date adicionarMeses (Date data, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
		
	}

	@Override
	public String toString() {
		return "ContratoServico [servicoPagamentoOnline=" + servicoPagamentoOnline + "]";
	}
	
	

}

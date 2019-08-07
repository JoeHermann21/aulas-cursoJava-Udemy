package ex13.model.service;

public interface ServicoPagamentoOnline {	
	
	Double taxaPagamento (Double saldo);
	Double juros (Double saldo, Integer meses);	

}

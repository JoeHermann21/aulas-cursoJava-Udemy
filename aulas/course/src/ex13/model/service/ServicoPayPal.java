package ex13.model.service;

public class ServicoPayPal implements ServicoPagamentoOnline {
	
	@Override
	public Double taxaPagamento(Double saldo) {
		return saldo  * 0.02;
	}

	@Override
	public Double juros(Double saldo, Integer meses) {
		return saldo * 0.01 * meses;
	}

}

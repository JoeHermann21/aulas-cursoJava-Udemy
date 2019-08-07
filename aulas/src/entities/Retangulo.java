package entities;

public class Retangulo extends FormaAbstrata {

	private Double altura;
	private Double largura;
	
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getLargura() {
		return largura;
	}
	public void setLargura(Double largura) {
		this.largura = largura;
	}
	
	public Retangulo(Cor cor, Double altura, Double largura) {
		super(cor);
		this.altura = altura;
		this.largura = largura;
	}
	

	@Override
	public Double area() {
		return largura * altura;
	}
	
}

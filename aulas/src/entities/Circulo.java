package entities;

public class Circulo extends FormaAbstrata {
	
	private Double raio;

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	public Circulo(Cor cor, Double raio) {
		super(cor);
		this.raio = raio;
	}
	
	@Override
	public Double area() {
		return Math.PI * (raio * raio);
	}
	

}

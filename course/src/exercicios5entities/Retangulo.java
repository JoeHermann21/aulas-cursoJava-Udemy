package exercicios5entities;

public class Retangulo {
	public double largura;
	public double altura;
	
	public double area() {
		return largura * altura;
	}
	
	public double perimetro() {
		return largura + largura + altura + altura;
	}
	
	public double diagonal() {
		return Math.sqrt((largura* largura) + (altura * altura));
	}
	
	public String toString() {
		return "Area: " + area() + 
				" Perímetro: " + perimetro() + 
				" Diagonal: " + diagonal();
	}

}

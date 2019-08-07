package exercicios5entities;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void acrescimoSalario(double percentage) {
		salarioBruto += percentage/100 * salarioBruto;
	}
	
	public String toString() {
		return "Empregado: " + nome + " $ " + salarioLiquido();
	}
	

}

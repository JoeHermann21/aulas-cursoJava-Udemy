package entities;

public abstract class FormaAbstrata implements Forma {

	private Cor cor;

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public FormaAbstrata(Cor cor) {
		this.cor = cor;
	}	
	
	
}

package aula12;

public abstract class Animal {
	
	// Atributos
	private double peso;
	private int idade;
	private int membros;

    // Métodos acessores e mutantes
	public final double getPeso() {
		
		return peso;
	
	}
	
	public final void setPeso(double peso) {

		this.peso = peso;
	
	}

	public final int getIdade() {

		return idade;
	
	}

	public final void setIdade(int idade) {

		this.idade = idade;
	
	}

	public final int getMembros() {

		return membros;
	
	}
	
	public final void setMembros(int membros) {

		this.membros = membros;
	
	}

    // Métodos abstratos
    public abstract void locomover();

    public abstract void alimentar();
    
    public abstract void emitirSom();

}

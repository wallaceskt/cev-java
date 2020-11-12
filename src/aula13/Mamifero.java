package aula13;

public class Mamifero extends Animal {
	
	// Atributo privado
	private String corPelo;

    // Método acessor e mutante
	public final String getCorPelo() {
		
		return corPelo;
	
	}

	public final void setCorPelo(String corPelo) {
	
		this.corPelo = corPelo;
	
	}
	
	// Método construtor
	public Mamifero(double peso, int idade, int membros, String corPelo) {
		
		this.setPeso(peso);
		this.setIdade(idade);
		this.setMembros(membros);
		this.setCorPelo(corPelo);
		
	}
	
	// Sobrescrevendo métodos abstratos declarados na classe abstrata Animal
	// Polimorfismo de sobreposição
	@Override
	public void locomover() {
		
		System.out.println("O mamífero está correndo.\r\n");
		
	}

	@Override
	public void alimentar() {
		
		System.out.println("O mamífero está mamando.\r\n");
		
	}

	@Override
	public void emitirSom() {
		
		System.out.println("O mamífero emite som típico.\r\n");
		
	}
	
	// Outro método
	@Override
	public String toString() {
		return "Mamifero [peso=" + getPeso() + ", idade=" + getIdade()
				+ ", membros=" + getMembros() + ", corPelo=" + getCorPelo() + "]";
	}

}

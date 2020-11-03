package aula12;

public class Reptil extends Animal {
	
	// Atributo privado
	private String corEscama;

    // Método acessor e mutante
	public final String getCorEscama() {
		
		return corEscama;
	
	}

	public final void setCorEscama(String corEscama) {
	
		this.corEscama = corEscama;
	
	}
	
	// Método construtor
	public Reptil(double peso, int idade, int membros, String corEscama) {
		
		this.setPeso(peso);
		this.setIdade(idade);
		this.setMembros(membros);
		this.setCorEscama(corEscama);
		
	}
	
	// Sobrescrevendo métodos abstratos declarados na classe abstrata Animal
	// Polimorfismo de sobreposição
	@Override
	public void locomover() {
		
		System.out.println("O réptil está se rastejando.\r\n");
		
	}

	@Override
	public void alimentar() {
		
		System.out.println("O réptil está mamando.\r\n");
		
	}

	@Override
	public void emitirSom() {
		
		System.out.println("O réptil emite som típico.\r\n");
		
	}
	
	// Outro método
	@Override
	public String toString() {
		return "Réptil [peso=" + getPeso() + ", idade=" + getIdade()
				+ ", membros=" + getMembros() + ", corEscama=" + getCorEscama() + "]";
	}

}

package aula12;

public class Peixe extends Animal {
	
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
	public Peixe(double peso, int idade, int membros, String corEscama) {
		
		this.setPeso(peso);
		this.setIdade(idade);
		this.setMembros(membros);
		this.setCorEscama(corEscama);
		
	}
	
	// Sobrescrevendo métodos abstratos declarados na classe abstrata Animal
	// Polimorfismo de sobreposição
	@Override
	public void locomover() {
		
		System.out.println("O peixe está nadando.\r\n");
		
	}

	@Override
	public void alimentar() {
		
		System.out.println("O peixe está comendo substâncias.\r\n");
		
	}

	@Override
	public void emitirSom() {
		
		System.out.println("O peixe não emite som.\r\n");
		
	}
	
	// Outros métodos
	public void soltarBolha() {
		
		System.out.println("O peixe solta uma bolha.\r\n");
		
	}
	
	@Override
	public String toString() {
		return "Peixe [peso=" + getPeso() + ", idade=" + getIdade()
				+ ", membros=" + getMembros() + ", corEscama=" + getCorEscama() + "]\r\n";
	}

}

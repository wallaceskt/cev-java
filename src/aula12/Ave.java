package aula12;

public class Ave extends Animal {
	
	// Atributo privado
	private String corPena;

    // Método acessor e mutante
	public final String getCorPena() {
		
		return corPena;
	
	}

	public final void setCorPena(String corPena) {
	
		this.corPena = corPena;
	
	}
	
	// Método construtor
	public Ave(double peso, int idade, int membros, String corPena) {
		
		this.setPeso(peso);
		this.setIdade(idade);
		this.setMembros(membros);
		this.setCorPena(corPena);
		
	}
	
	// Sobrescrevendo métodos abstratos declarados na classe abstrata Animal
	// Polimorfismo de sobreposição
	@Override
	public void locomover() {
		
		System.out.println("O peixe está voando.\r\n");
		
	}

	@Override
	public void alimentar() {
		
		System.out.println("A ave está comendo frutas.\r\n");
		
	}

	@Override
	public void emitirSom() {
		
		System.out.println("A ave emite som típico.\r\n");
		
	}
	
	// Outros métodos
	public void fazerNinho() {
		
		System.out.println("A ave está fazendo um ninho.\r\n");
		
	}
	
	@Override
	public String toString() {
		return "Ave [peso=" + getPeso() + ", idade=" + getIdade()
				+ ", membros=" + getMembros() + ", corEscama=" + getCorPena() + "]\r\n";
	}

}

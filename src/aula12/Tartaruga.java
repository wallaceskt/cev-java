package aula12;

public class Tartaruga extends Reptil {
	
	// Método construtor
	public Tartaruga(double peso, int idade, int membros, String corEscama) {
		
		super(peso, idade, membros, corEscama);
		
	}
	
	// Sobrescrevendo métodos abstratos declarados na classe abstrata Animal
	// Polimorfismo de sobreposição
	@Override
	public void locomover() {
		
		System.out.println("A tartaruga está andando lentamente.\r\n");
		
	}
	
	@Override
	public String toString() {
		
		return "Tartaruga [peso=" + getPeso() + ", idade=" + getIdade()
		+ ", membros=" + getMembros() + ", corPelo=" + getCorEscama() + "]\r\n";
		
	}

}

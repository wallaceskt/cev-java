package aula13;

public class Lobo extends Mamifero {
	
	// Método construtor
	public Lobo(double peso, int idade, int membros, String corPelo) {
		
		super(peso, idade, membros, corPelo);
		
	}
	
	// Sobrescrevendo métodos abstratos declarados na classe abstrata Animal
	// Polimorfismo de sobreposição
	@Override
	public void emitirSom() {
		
		System.out.println("Auuuuuuuuuuu!\r\n");
		
	}
	
	// Outro método
	@Override
	public String toString() {
		
		return "Lobo [peso=" + getPeso() + ", idade=" + getIdade()
				+ ", membros=" + getMembros() + ", corPelo=" + getCorPelo() + "]\r\n";
	
	}

}

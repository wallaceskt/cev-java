package aula12;

public class Cachorro extends Mamifero {
	
	// Método construtor
	public Cachorro(double peso, int idade, int membros, String corPelo) {
		
		super(peso, idade, membros, corPelo);
		
	}
	
	// Sobrescrevendo métodos abstratos declarados na classe abstrata Animal
	// Polimorfismo de sobreposição
	@Override
	public void emitirSom() {
		
		System.out.println("O cachorro está latindo.\r\n");
		
	}
	
	// Outro método
	@Override
	public String toString() {
		
		return "Cachorro [peso=" + getPeso() + ", idade=" + getIdade()
				+ ", membros=" + getMembros() + ", corPelo=" + getCorPelo() + "]\r\n";
	
	}
	
	public void enterrarOsso() {
		
		System.out.println("O cachorro está enterrando o osso.\r\n");
		
	}
	
	public void abanarRabo() {
		
		System.out.println("O cachorro está abanando o rabo.\r\n");
		
	}

}

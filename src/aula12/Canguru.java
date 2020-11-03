package aula12;

public class Canguru extends Mamifero {
	
	// Método construtor
	public Canguru(double peso, int idade, int membros, String corPelo) {
		
		super(peso, idade, membros, corPelo);
		
	}
	
	// Sobrescrevendo métodos abstratos declarados na classe abstrata Animal
	// Polimorfismo de sobreposição
	@Override
	public void locomover() {
		
		System.out.println("O canguru está saltando.\r\n");
		
	}
	
	// Outro método
	@Override
	public String toString() {
		
		return "Canguru [peso=" + getPeso() + ", idade=" + getIdade()
				+ ", membros=" + getMembros() + ", corPelo=" + getCorPelo() + "]\r\n";
	
	}
	
	public void usarBolsa() {
		
		System.out.println("O canguru está usando a bolsa.\r\n");
		
	}

}

package aula13;

public class Cachorro extends Mamifero {
	
	// Método construtor
	public Cachorro(double peso, int idade, int membros, String corPelo) {
		
		super(peso, idade, membros, corPelo);
		
	}
	
	// Sobrescrevendo métodos abstratos declarados na classe abstrata Animal
	// Polimorfismo de sobreposição
	@Override
	public void emitirSom() {
		
		System.out.println("Au! Au! Au!\r\n");
		
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
	
	// Polimorfismo de sobrecarga
	public void reagir(String frase) {
		
		String reacao = "";

        if (frase.equals("toma comida") || frase.equals("olá")) {

            reacao = "O cachorro abana o rabo e late.";
        
        } else {
        
            reacao = "O cachorro rosna.";
        
        }

        System.out.println(reacao + "\r\n");
		
	}

	public void reagir(int hora, int min) {
		
		String reacao = "";

        if ((hora >= 0 && hora < 12) && (min >= 0 && min < 60)) {

            reacao = "O cachorro abana o rabo.";
        
        } else if ((hora > 12 && hora < 18) && (min >= 0 && min < 60)) {

            reacao = "O cachorro abana o rabo e late.";
            
        } else {
        
            reacao = "O cachorro ignora.";
        
        }

        System.out.println(reacao + "\r\n");
		
	}
	
	public void reagir(boolean dono) {
		
		String reacao = (dono) ? "O cachorro abana o rabo." : "O cachorro rosna e late.";

        System.out.println(reacao + "\r\n");
		
	}
	
	public void reagir(int idade, float peso) {
		
		String reacao = "";
		
		if (idade < 5) {
            
            if (peso < 10) {

                reacao = "O cachorro abana o rabo.";
            
            } else {
    
                reacao = "O cachorro late.";

            }
        
        } else {
            
            if (peso < 10) {

                reacao = "O cachorro rosna.";
    
            } else {
            
                reacao = "O cachorro ignora.";

            }

        }

        System.out.println(reacao + "\r\n");
		
	}

}

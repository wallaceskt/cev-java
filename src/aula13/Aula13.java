package aula13;

public class Aula13 {

	public static void main(String[] args) {

		System.out.println("\r\n========== MAMÍFERO ==========\r\n");
		
		Mamifero mamifero = new Mamifero(10, 2, 4, "preta");
		mamifero.locomover();
		mamifero.alimentar();
		mamifero.emitirSom();
		System.out.println(mamifero.toString());
		
		System.out.println("\r\n========== ========== ==========\r\n");

		System.out.println("\r\n========== LOBO ==========\r\n");
		
		Lobo lobo = new Lobo(32.5, 5, 4, "marrom");
		lobo.locomover();
		lobo.alimentar();
		lobo.emitirSom();
		System.out.println(lobo.toString());
		
		System.out.println("\r\n========== ========== ==========\r\n");

		System.out.println("\r\n========== CACHORRO ==========\r\n");
		
		Cachorro cachorro = new Cachorro(10, 2, 4, "branca");
		cachorro.locomover();
		cachorro.alimentar();
		cachorro.emitirSom();
		cachorro.enterrarOsso();
		cachorro.abanarRabo();
		cachorro.reagir("olá");
		cachorro.reagir("Danado");
		cachorro.reagir(11, 45);
		cachorro.reagir(21, 00);
		cachorro.reagir(true);
		cachorro.reagir(false);
		cachorro.reagir(2, 12.5f);
		cachorro.reagir(17, 4.5f);
		System.out.println(cachorro.toString());
		
		System.out.println("\r\n========== ========== ==========\r\n");
		
	}

}

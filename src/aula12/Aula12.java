package aula12;

public class Aula12 {

	public static void main(String[] args) {

		System.out.println("\r\n========== MAMÍFERO ==========\r\n");
		
		Mamifero mamifero = new Mamifero(10, 2, 4, "preta");
		mamifero.locomover();
		mamifero.alimentar();
		mamifero.emitirSom();
		System.out.println(mamifero.toString());
		
		Cachorro cachorro = new Cachorro(10, 2, 4, "branca");
		cachorro.locomover();
		cachorro.alimentar();
		cachorro.emitirSom();
		cachorro.enterrarOsso();
		cachorro.abanarRabo();
		System.out.println(cachorro.toString());
		
		Canguru canguru = new Canguru(32.5, 5, 4, "marrom");
		canguru.locomover();
		canguru.alimentar();
		canguru.emitirSom();
		canguru.usarBolsa();
		System.out.println(canguru.toString());
		
		System.out.println("\r\n========== ========== ==========\r\n");

		System.out.println("\r\n========== RÉPTIL ==========\r\n");
		
		Reptil reptil = new Reptil(.35, 3, 4, "prata");
		reptil.locomover();
		reptil.alimentar();
		reptil.emitirSom();
		System.out.println(reptil.toString());
		
		Reptil cobra = new Reptil(.95, 8, 0, "vermelha, preta e branca");
		cobra.locomover();
		cobra.alimentar();
		cobra.emitirSom();
		System.out.println(cobra.toString());
		
		Reptil tartaruga = new Reptil(8.6, 23, 4, "cinza");
		tartaruga.locomover();
		tartaruga.alimentar();
		tartaruga.emitirSom();
		System.out.println(tartaruga.toString());
		
		System.out.println("\r\n========== ========== ==========\r\n");

		System.out.println("\r\n========== PEIXE ==========\r\n");
		
		Peixe peixe = new Peixe(0.39, 1, 0, "vermelha");
		peixe.locomover();
		peixe.alimentar();
		peixe.emitirSom();
	    peixe.soltarBolha();
		System.out.println(peixe.toString());
		
		Peixe goldfish = new Peixe(0.36, 2, 0, "dourada");
		goldfish.locomover();
		goldfish.alimentar();
		goldfish.emitirSom();
		goldfish.soltarBolha();
		System.out.println(goldfish.toString());
		
		System.out.println("\r\n========== ========== ==========\r\n");

		System.out.println("\r\n========== AVE ==========\r\n");
		
		Ave ave = new Ave(0.89, 2, 2, "verde e azul");
		ave.locomover();
		ave.alimentar();
		ave.emitirSom();
		ave.fazerNinho();
		System.out.println(ave.toString());
		
		Ave arara = new Ave(0.78, 2, 2, "verde, amarela e azul");
		arara.locomover();
		arara.alimentar();
		arara.emitirSom();
		arara.fazerNinho();
		System.out.println(arara.toString());
		
		System.out.println("\r\n========== ========== ==========\r\n");

	}

}

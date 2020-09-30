package aula020304;

public class Aula02 {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta("Compactor", "Azul", 0.5f);
//		c1.setModelo("Compactor");
//		c1.setCor("Azul");
//		c1.setPonta(0.5f);
		c1.setCarga(10);
		//c1.setTampada(true);
		
		System.out.println("Caneta: " + c1.getModelo());
		System.out.println("Cor: " + c1.getCor());
		System.out.println("Ponta: " + c1.getPonta());
		System.out.println("Carga: " + c1.getCarga());
		System.out.println("Tampada: " + c1.isTampada());
		
		System.out.println(c1.destampar());
		//System.out.println(c1.tampar());
		System.out.println(c1.rabiscar());
		
		System.out.println(c1.status());
		
	}

}

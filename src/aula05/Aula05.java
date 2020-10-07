package aula05;

public class Aula05 {

	public static void main(String[] args) {
		
		ContaBanco c1 = new ContaBanco(1, "Jubileu");
		c1.abrirConta("cc");
		System.out.println(c1.depositar(50));
		System.out.println(c1.sacar(200));
		System.out.println(c1.estado());

		ContaBanco c2 = new ContaBanco(2, "Creuza");
		c2.abrirConta("cp");
		System.out.println(c2.depositar(80));
		System.out.println(c2.sacar(200));
		System.out.println(c2.estado());
	}

}

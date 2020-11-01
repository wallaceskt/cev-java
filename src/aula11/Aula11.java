package aula11;

public class Aula11 {

	public static void main(String[] args) {
		
		Visitante p1 = new Visitante();
		p1.setNome("Wallace Oliveira");
		p1.setIdade(41);
		p1.setSexo("M");
		
		System.out.println(p1.toString());
		p1.fazerAniversario();
		
		System.out.println("\r\n----------\r\n");
		
		Professor p2 = new Professor("Emily Batty", 25, "F", "Educação Física", 1500.50);

		System.out.println(p2.toString());
		p2.fazerAniversario();
		p2.receberAumento(500);
		
		System.out.println("\r\n----------\r\n");
		
		Aluno p3 = new Aluno("Valentina", 27, "F", 001, "Educação Fisíca");

		System.out.println(p3.toString());
		p3.fazerAniversario();
		p3.pagarMensalidade();
		p3.cancelarMatricula();
		
		System.out.println("\r\n----------\r\n");
		
		Bolsista p4 = new Bolsista("Katarina Konow", 26, "F", 002, "Artes", 500f);

		System.out.println(p4.toString());
		p4.fazerAniversario();
		p4.renovarBolsa();
		p4.pagarMensalidade();
		p4.cancelarMatricula();
		
		System.out.println("\r\n----------\r\n");
		
		Tecnico p5 = new Tecnico("Peter Parker", 23, "M", 003, "Fotografia", "TE001");

		System.out.println(p5.toString());
		p5.fazerAniversario();
		p5.praticar();
		p5.pagarMensalidade();
		p5.cancelarMatricula();

	}

}

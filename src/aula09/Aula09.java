package aula09;

public class Aula09 {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Wallace Oliveira", 41, "M");
		Pessoa p2 = new Pessoa("Fernanda Karla", 42, "F");
		
		Livro l1 = new Livro("Dominando Eclipse", "Edson Gonçalves", 400, p1);
		Livro l2 = new Livro("Abra a Cabeça Java", "Fulano e Ciclano", 430, p2);
		Livro l3 = new Livro("Análise Essencial", "S. Pompilho", 250, p2);
		
		l1.detalhes();
		l2.detalhes();

	}

}

package aula11;

public class Bolsista extends Aluno {
	
	// Atributos privados
	private float bolsa;
	
	// Métodos acessores e mutantes
	public float getBolsa() {
		
		return bolsa;
	
	}
	
	public void setBolsa(float bolsa) {

		this.bolsa = bolsa;
	
	}
	
	// Método construtor
	public Bolsista(String nome, int idade, String sexo, int matricula, String curso, float bolsa) {

		super(nome, idade, sexo, matricula, curso);
		this.setBolsa(bolsa);
	
	}

	// Sobrescrevendo métodos
	@Override
	public String toString() {
		
		return "Bolsista [nome=" + getNome() + ", idade=" + getIdade() + ", sexo=" + getSexo() + ", matricula=" + getMatricula() + ", curso=" + getCurso() + ", bolsa=" + getBolsa() + "]\r\n";
	
	}

	@Override
	public void pagarMensalidade() {
		
		System.out.println("\r\nA mensalidade do curso " + this.getCurso() + " foi paga no valor de R$ 250,00.\r\n");
		
	}
	
	// Outros métodos
	public void renovarBolsa() {
		
		System.out.println("\r\nA matrícula no curso " + this.getCurso() + " foi renovada.\r\n");
		
	}

}

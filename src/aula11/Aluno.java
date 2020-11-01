package aula11;

/**
 * Herança para diferença. Tem tudo que Pessoa tem e possui uma especialização.
 */
public class Aluno extends Pessoa {
	
	// Atributos
	private int matricula;
	private String curso;
	
	// Métodos acessores e mutantes
	public final int getMatricula() {
		
		return matricula;
	
	}
	
	public final void setMatricula(int matricula) {
	
		this.matricula = matricula;
	
	}
	
	public final String getCurso() {
	
		return curso;
	
	}
	
	public final void setCurso(String curso) {
	
		this.curso = curso;
	
	}
	
	// Método construtor
	public Aluno(String nome, int idade, String sexo, int matricula, String curso) {

		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.matricula = matricula;
		this.curso = curso;
	
	}
	
	// Outros métodos
	public void cancelarMatricula() {
		
		if (this.getMatricula() != 0) {

			System.out.println("A matrícula no curso " + this.getCurso() + " foi cancelada!");

			this.setMatricula(0);
			this.setCurso(null);
			
		} else {
			
			System.out.println("A matrícula no curso já está cancelada!");
			
		}
		
	}
	
	public void pagarMensalidade() {
		
		System.out.println("\r\nA mensalidade do curso " + this.getCurso() + " foi paga no valor de R$ 500,00.\r\n");
		
	}

	@Override
	public String toString() {
		
		return "Aluno [nome=" + getNome() + ", idade=" + getIdade() + ", sexo=" + getSexo() + ", matricula=" + matricula + ", curso=" + curso + "]";
	
	}

}

package aula10;

public class Aluno extends Pessoa {
	
	// Atributos
	private int matricula;
	private String curso;
	
	// Métodos acessores e mutantes
	public int getMatricula() {
		
		return matricula;
	
	}
	
	public void setMatricula(int matricula) {
	
		this.matricula = matricula;
	
	}
	
	public String getCurso() {
	
		return curso;
	
	}
	
	public void setCurso(String curso) {
	
		this.curso = curso;
	
	}
	
	// Método construtor
	public Aluno(String nome, int idade, String sexo, int matricula, String curso) {

		super(nome, idade, sexo);
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

}

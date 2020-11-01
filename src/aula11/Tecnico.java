package aula11;

public class Tecnico extends Aluno {
	
	// Atributos privados
	private String registroProfissional;
	
	// Métodos acessores e mutantes
	public String getRegistroProfissional() {
		
		return this.registroProfissional;
	
	}
	
	public void setRegistroProfissional(String registro) {

		this.registroProfissional = registro;
	
	}
	
	// Método construtor
	public Tecnico(String nome, int idade, String sexo, int matricula, String curso, String registro) {

		super(nome, idade, sexo, matricula, curso);
		this.setRegistroProfissional(registro);
	
	}

	// Sobrescrevendo métodos
	@Override
	public String toString() {
		
		return "Técnico [nome=" + getNome() + ", idade=" + getIdade() + ", sexo=" + getSexo() + ", matricula=" + getMatricula() + ", curso=" + getCurso() + ", registro profissional=" + getRegistroProfissional() + "]\r\n";
	
	}
	
	// Outros métodos
	public void praticar() {
		
		System.out.println("\r\nO técnico está praticando.\r\n");
		
	}

}

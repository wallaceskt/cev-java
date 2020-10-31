package aula10;

public class Professor extends Pessoa {
	
	// Atributos
	private String especialidade;
	private double salario;
	
	// Métodos acessores e mutantes
	public String getEspecialidade() {

		return especialidade;
	
	}
	
	public void setEspecialidade(String especialidade) {
	
		this.especialidade = especialidade;
	
	}
	
	public double getSalario() {
	
		return salario;
	
	}
	
	public void setSalario(double salario) {
	
		this.salario = salario;
	
	}
	
	// Método construtor
	public Professor(String nome, int idade, String sexo, String especialidade, double salario) {
		
		super(nome, idade, sexo);
		this.especialidade = especialidade;
		this.salario = salario;
	
	}
	
	// Outros métodos
	public void receberAumento(double aumento) {
		
		this.setSalario(this.getSalario() + aumento);
		
		System.out.println("O salário foi reajustado para R$ " + this.getSalario() + ".");
		
	}

}

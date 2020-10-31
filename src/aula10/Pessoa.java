package aula10;

public class Pessoa {
	
	// Atributos
	private String nome;
	private int idade;
	private String sexo;
	
	// Métodos acessores e mutantes
	public String getNome() {
	
		return nome;
	
	}
	
	public void setNome(String nome) {
	
		this.nome = nome;
	
	}
	
	public int getIdade() {
	
		return idade;
	
	}
	
	public void setIdade(int idade) {
	
		this.idade = idade;
	
	}
	
	public String getSexo() {
	
		return sexo;
	
	}
	
	public void setSexo(String sexo) {

		this.sexo = sexo;
	
	}
	
	// Método construtor
	public Pessoa(String nome, int idade, String sexo) {
		
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	
	}
	
	// Outros métodos
	public void fazerAniversario() {
		
		this.setIdade(this.getIdade() + 1);
		
		System.out.println(this.getNome() + " faz aniversário de " + this.getIdade() + " anos. Parabéns!");
		
	}

}

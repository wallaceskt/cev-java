package aula11;

/**
 * Classe abstrata Pessoa. Não pode ser instanciada e não pode gerar objetos. Tem atributos e métodos implementados.
 */
public abstract class Pessoa {
	
	// Atributos privados
	private String nome;
	private int idade;
	private String sexo;
	
	// Métodos acessores e mutantes
	public final String getNome() {
	
		return nome;
	
	}
	
	public final void setNome(String nome) {
	
		this.nome = nome;
	
	}
	
	public final int getIdade() {
	
		return idade;
	
	}
	
	public final void setIdade(int idade) {
	
		this.idade = idade;
	
	}
	
	public final String getSexo() {
	
		return sexo;
	
	}
	
	public final void setSexo(String sexo) {

		this.sexo = sexo;
	
	}
	
	// Método construtor
	/*protected Pessoa(String nome, int idade, String sexo) {
		
		super();
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
	
	}*/
	
	// Outros métodos
	public final void fazerAniversario() {
		
		this.setIdade(this.getIdade() + 1);
		
		System.out.println(this.getNome() + " faz aniversário de " + this.getIdade() + " anos. Parabéns!");
		
	}

	@Override
	public String toString() {
	
		return "\r\nDados [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]\r\n";
	
	}

}

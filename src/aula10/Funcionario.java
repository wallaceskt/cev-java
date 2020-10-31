package aula10;

public class Funcionario extends Pessoa {
	
	// Atributos
	private String setor;
	private boolean trabalhando;
	
	// Métodos acessores e mutantes
	public String getSetor() {

		return setor;
	
	}

	public void setSetor(String setor) {

		this.setor = setor;
	
	}

	public boolean isTrabalhando() {

		return trabalhando;
	
	}

	public void setTrabalhando(boolean trabalhando) {

		this.trabalhando = trabalhando;
	
	}
	
	// Método construtor
	public Funcionario(String nome, int idade, String sexo, String setor, boolean trabalhando) {
		
		super(nome, idade, sexo);
		this.setor = setor;
		this.trabalhando = trabalhando;
	
	}
	
	// Outros métodos
	public void mudarTrabalho(String setor) {
		
		this.setSetor(setor);
		
		System.out.println("O funcionáio(a) " + this.getNome() + " agora trabalha no setor " + this.getSetor() + ".");
		
	}

}

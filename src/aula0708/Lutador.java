package aula0708;

public class Lutador {
	// Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    // Métodos especiais de acesso e modificação
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria() {
		if (this.getPeso() < 52.2) {
			this.categoria = "Inválido";			
		} else if (this.getPeso() <= 70.3) {
			this.categoria = "Leve";
		} else if (this.getPeso() <= 83.9) {
			this.categoria = "Médio";
		} else if (this.getPeso() <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inválido";
		}
	}
	
	public int getVitorias() {
		return vitorias;
	}
	
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	
	public int getDerrotas() {
		return derrotas;
	}
	
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	
	public int getEmpates() {
		return empates;
	}
	
	public void setEmpates(int empates) {
		this.empates = empates;
	}

	// Método construtor
	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
		super();
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setVitorias(vitorias);
		this.setDerrotas(derrotas);
		this.setEmpates(empates);
	}

	// Outros métodos
	public void apresentar() {
		String retorno = "";
		
		retorno = "========== APRESENTAÇÃO ==========\r\n";
		retorno = retorno + "CHEGOU A HORA! Apresentamos o lutador " + this.getNome() + ".\r\n";
		retorno = retorno + "Diretamente de " + this.getNacionalidade() + "\r\n";
		retorno = retorno + "com " + this.getIdade() + " anos de idade e " + this.getAltura() + " m de altura.\r\n";
		retorno = retorno + "Pesando " + this.getPeso() + " kg.\r\n";
		retorno = retorno + this.getVitorias() + " vitória(s).\r\n";
		retorno = retorno + this.getDerrotas() + " derrota(s).\r\n";
		retorno = retorno + this.getEmpates() + " empate(s).\r\n";
		retorno = retorno + "========== ========== ===========\r\n";
		
		System.out.println(retorno);
	}
	
	public void status() {
		String retorno = "";
		
		//retorno = "========== LUTADOR ==========\r\n";
		retorno = retorno + this.getNome() + " é um peso " + this.getCategoria() + ".\r\n";
		retorno = retorno + "Ganhou " + this.getVitorias() + " vez(es).\r\n";
		retorno = retorno + "Perdeu " + this.getDerrotas() + " vez(es).\r\n";
		retorno = retorno + "Empatou " + this.getEmpates() + " vez(es).\r\n";
		//retorno = retorno + "========== ========== ===========\r\n";
		
		System.out.println(retorno);
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
		//return "Vitória!";
	}

	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
		//return "Derrota!";
	}

	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
		//return "Empate!";
	}
    
}

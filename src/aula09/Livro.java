package aula09;

public class Livro implements Publicacao {
	
	// Atributos
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	// Métodos acessores e mutantes
	public String getTitulo() {
		
		return titulo;

	}
	
	public void setTitulo(String titulo) {
	
		this.titulo = titulo;
	
	}
	
	public String getAutor() {
	
		return autor;
	
	}

	public void setAutor(String autor) {
	
		this.autor = autor;
	
	}
	
	public int getTotPaginas() {
	
		return totPaginas;
	
	}
	
	public void setTotPaginas(int totPaginas) {
	
		this.totPaginas = totPaginas;
	
	}
	
	public int getPagAtual() {
	
		return pagAtual;
	
	}
	
	public void setPagAtual(int pagAtual) {

		this.pagAtual = pagAtual;
	
	}
	
	public boolean isAberto() {
	
		return aberto;
	
	}
	
	public void setAberto(boolean aberto) {

		this.aberto = aberto;
	
	}
	
	public Pessoa getLeitor() {
	
		return leitor;
	
	}
	
	public void setLeitor(Pessoa leitor) {

		this.leitor = leitor;
	
	}

	// Método construtor
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
	
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.leitor = leitor;
	
	}
	
	// Método
	public void detalhes() {
		
		System.out.println("\r\n========== DETALHES ==========\r\n");
		System.out.println("Livro: " + this.getTitulo() + "\r\n");
		System.out.println("Autor: " + this.getAutor() + "\r\n");
		System.out.println("Páginas: " + this.getTotPaginas() + "\r\n");
		System.out.println("\r\n---\r\n");
		
		if (this.isAberto()) {
			
			System.out.println("O livro está aberto na página " + this.getPagAtual() + " pelo(a) leitor(a) " + this.getLeitor().getNome() + ".\r\n");
			
		} else {
			
			System.out.println("O livro está fechado e de posse do(a) leitor(a) " + this.getLeitor().getNome() + ".\r\n");
			
		}
		
		System.out.println("\r\n========== ======== ==========\r\n");
		
	}

	// Sobrescrevendo métodos abstratos declarados na interface
	@Override
	public void abrir() {
		
		if (!this.isAberto()) {
			
			this.setAberto(true);
			
			System.out.println("\r\nO livro foi aberto.\r\n");
			
		} else {
			
			System.out.println("\r\nO livro já está aberto!\r\n");
			
		}
		
	}

	@Override
	public void fechar() {
		
		if (this.isAberto()) {
			
			System.out.println("\r\nO livro foi fechado.\r\n");
			
		} else {
			
			System.out.println("\r\nO livro já está fechado!\r\n");
			
		}
		
	}

	@Override
	public void folhear(int pag) {
		
		if (this.isAberto() && pag < this.getTotPaginas() && pag > 0) {
			
			this.setPagAtual(pag);
			
			System.out.println("\r\nO livro está sendo folheado na página " + pag + ".\r\n");
			
		} else {
			
			this.setPagAtual(0);
			
			System.out.println("\r\nO livro está fechado!\r\n");
			
		}
		
	}

	@Override
	public void avancarPag() {
		
		if (this.isAberto() && this.getPagAtual() < this.getTotPaginas()) {
			
			this.setPagAtual(this.getPagAtual() + 1);
			
			System.out.println("\r\nAvançou uma página. Agora, está na página " + this.getPagAtual() + ".\r\n");
			
		} else {
			
			System.out.println("\r\nO livro está fechado!\r\n");
			
		}
		
	}

	@Override
	public void voltarPag() {
		
		if (this.isAberto() && this.getPagAtual() < 0) {
			
			this.setPagAtual(this.getPagAtual() - 1);
			
			System.out.println("\r\nVoltou uma página. Agora, está na página " + this.getPagAtual() + ".\r\n");
			
		} else {
			
			System.out.println("\r\nO livro está fechado!\r\n");
			
		}
		
	}

}

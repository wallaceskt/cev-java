package aula02e03;

public class Caneta {
	
	// Atributos
	private String modelo;
	private String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	// Métodos especiais de acesso
	public String getModelo() {
		
		return this.modelo;
		
	}
	
	public void setModelo(String modelo) {
		
		this.modelo = modelo;
		
	}
	
	public String getCor() {
		
		return this.cor;
		
	}
	
	public void setCor(String cor) {
		
		this.cor = cor;
		
	}
	
	public float getPonta() {
		
		return this.ponta;
		
	}
	
	public void setPonta(float ponta) {
		
		this.ponta = ponta;
		
	}
	
	public int getCarga() {
		
		return this.carga;
		
	}
	
	public void setCarga(int carga) {
		
		this.carga = carga;
		
	}
	
	public boolean getTampada() {
		
		return this.tampada;
		
	}
	
	public void setTampada(boolean tampada) {
		
		this.tampada = tampada;
	
	}

	// Método construtor
	public Caneta(String modelo, String cor, float ponta) {
		
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		
	}
	
	// Outros métodos
	public String rabiscar() {
		
		String retorno = "";
		
		if((this.getTampada()) || (this.getCarga() == 0)) {
			
			retorno = "[ERRO] A caneta " + this.getModelo() + " está tampada e/ou sem carga!";
			
		} else {
			
			retorno = "A caneta " + this.getModelo() + " está rabiscando...";
			
		}
		
		return retorno;
		
	}
	
	protected String tampar() {
		
		String retorno = "";
		
		if(this.getTampada()) {
			
			retorno = "A caneta já está tampada.";
			
		} else {

			this.setTampada(true);
			retorno = "A caneta está tampada.";
			
		}
		
		return retorno;
		
	}
	
	protected String destampar() {
		
		String retorno = "";
		
		if(this.getTampada()) {
			
			this.setTampada(false);
			retorno = "A caneta está destampada.";
			
		} else {
			
			retorno = "A caneta já esta destampada.";
			
		}
		
		return retorno;
		
	}
	
	public String status() {
		
		String status = "";
		
		status += "\r\n========== Status ==========\r\n";
		status += "Caneta: " + this.getModelo() + "\r\n";
		status += "Cor: " + this.getCor() + "\r\n";
		status += "Ponta: " + this.getPonta() + "\r\n";
		status += "Carga: " + this.getCarga() + "\r\n";
		status += "Tampada: ";
		status += (this.getTampada()) ? "Sim" : "Não";
		status += "\r\n";
		status += "========== ****** ==========\r\n";
		
		return status;
		
	}
}

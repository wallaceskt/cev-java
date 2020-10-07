package aula05;

public class ContaBanco {
	// Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	// Métodos acessores
	public int getNumConta() {
		return numConta;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getDono() {
		return dono;
	}
	
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}

	// Método construtor
	public ContaBanco(int numConta, String dono) {
		super();
		this.numConta = numConta;
		this.dono = dono;
		this.setStatus(false);
		this.setSaldo(0);
	}
	
	// Outros métodos
	public String abrirConta(String tipo) {
	
		String retorno;
		
		if (!this.isStatus()) {
			this.setTipo(tipo);
			this.setStatus(true);
			
			int t = (this.getTipo() == "cc") ? 50 : 150;
			this.setSaldo(t);
			
			retorno = "A conta está aberta. Seu saldo é de R$ " + this.getSaldo() + ".";
		} else {
			retorno = "A conta já está aberta.";
		}
		
		return retorno;

	}
	
	public String fecharConta() {
		
		String retorno;
		
		if (this.isStatus()) {
			if (this.getSaldo() > 0) {
				this.setStatus(false);
				retorno = "A conta está fechada.";				
			} else if (this.getSaldo() < 0) {
				retorno = "[ERRO] A conta está em débito!";
			} else {
				this.setStatus(false);
				retorno = "A conta está fechada.";
			}
		} else {
			retorno = "A conta já está fechada.";
		}
		
		return retorno;
		
	}
	
	public String depositar(float valor) {
		
		String retorno;
		
		if (this.isStatus()) {
			this.setSaldo(this.getSaldo() + valor);
			retorno = "Depósito no valor de R$ " + this.getSaldo() + " foi efetuado com sucesso.\r\n";
			retorno = retorno + "Saldo atual: R$ " + this.getSaldo() + ".";
		} else {
			retorno = "[ERRO] Impossível depositar! A conta está fechada.";
		}
		
		return retorno;
		
	}
	
	public String sacar(int valor) {
		
		String retorno;
		
		if (this.isStatus()) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				retorno = "Saque no valor de R$ " + valor + " efetuado com sucesso.\r\n";
				retorno = retorno + "Saldo atual: R$ " + this.getSaldo() + ".";
			} else {
				retorno = "[ERRO] O valor de R$ " + valor + " é maior que seu saldo!";
			}
		} else {
			retorno = "[ERRO] Impossível sacar! A conta está fechada.";
		}
		
		return retorno;
		
	}
	
	public String pagarMensalidade() {
		
		String retorno;
		
		if (this.isStatus()) {
			int v = 0;
			if (this.getTipo() == "cc") {
				v = 12;
			} else if (this.getTipo() == "cp") {
				v = 20;
			}
			this.setSaldo(this.getSaldo() - v);
			retorno = "Mensalidade paga no valor de R$ " + v + ".";
		} else {
			retorno = "[ERRO] Impossível sacar! A conta está fechada.";
		}
		
		return retorno;
	}

	public String estado() {
		
		String status;
		
		status = "\r\n========== Status ==========\r\n";
		status += "Conta: " + this.getNumConta() + "\r\n";
		status += "Tipo: " + this.getTipo() + "\r\n";
		status += "Titular: " + this.getDono() + "\r\n";
		status += "Saldo: " + this.getSaldo() + "\r\n";
		status += "Status: ";
		status += (this.isStatus()) ? "aberta" : "fechada";
		status += "\r\n";
		status += "========== ****** ==========\r\n";
		
		return status;
		
	}
	
}

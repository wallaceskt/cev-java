package aula0708;

public class Luta {
	
	// Atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	// Métodos especiais (getters e setters)
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	
	public Lutador getDesafiante() {
		return desafiante;
	}
	
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	
	public int getRounds() {
		return rounds;
	}
	
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	
	public boolean getAprovada() {
		return aprovada;
	}
	
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	// Outros métodos
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.desafiado = l1;
			this.desafiante = l2;
			this.setAprovada(true);
		} else {
			this.desafiado = null;
			this.desafiante = null;
			this.setAprovada(false);
		}		
	}
	
	public void lutar() {
		if (this.getAprovada()) {
			this.desafiado.apresentar();
			this.desafiante.apresentar();
			
			System.out.println("========== RESULTADO ==========\r\n");
			int numero = (int) (Math.random() * 3);
			
			switch (numero) {
				case 0: // Empate
					System.out.println("Empate!\r\n");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					this.desafiado.status();
					this.desafiante.status();
					break;
	
				case 1: // Vitória do desafiado
					System.out.println("Vitória do lutador desafiado " + this.desafiado.getNome() + "!\r\n");
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					this.desafiado.status();
					this.desafiante.status();
					break;
	
				case 2: // Vitória do desafiante
					System.out.println("Vitória do lutador desafiante " + this.desafiante.getNome() + "!\r\n");
					this.desafiado.perderLuta();
					this.desafiante.ganharLuta();
					this.desafiado.status();
					this.desafiante.status();
					break;
			}
			
			System.out.println("========== ========== ==========\r\n");
			
		} else {
			System.out.println("[ERRO] Impossível realizar a luta!");
		}
	}

}

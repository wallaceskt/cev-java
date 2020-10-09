package aula06;

public class ControleRemoto implements Controlador {
	
	// Atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	// Métodos especiais de acesso
	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	// Método construtor
	public ControleRemoto() {
		super();
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	// Sobrescrevendo métodos
	@Override
	public String ligar() {
		String retorno = "";
		
		if (!this.getLigado()) {
			this.setLigado(true);
			retorno = "O controle está ligado.";
		} else {
			retorno = "O controle já está ligado.";
		}
		
		return retorno;
	}

	@Override
	public String desligar() {
		String retorno = "";
		
		if (this.getLigado()) {
			this.setLigado(false);
			retorno = "O controle está desligado.";
		} else {
			retorno = "O controle já está desligado.";
		}
		
		return retorno;
	}

	@Override
	public String abrirMenu() {
		String retorno = "";
		
		if (this.getLigado()) {
			retorno = retorno + "========== MENU ==========\r\n";
			retorno = retorno + "1. Ligar/Desligar\r\n";
			retorno = retorno + "2. +\r\n";
			retorno = retorno + "3. -\r\n";
			retorno = retorno + "4. Mudo\r\n";
			retorno = retorno + "5. Play/Pause\r\n";
			retorno = retorno + "========== ==== ==========";
		} else {
			retorno = "O controle está desligado.";
		}
		
		return retorno;
	}

	@Override
	public String fecharMenu() {
		String retorno = "";
		
		if (this.getLigado()) {
			retorno = "Menu fechado.";
		} else {
			retorno = "O controle está desligado.";
		}
		
		return retorno;
	}

	@Override
	public String maisVolume() {
		String retorno = "";
		
		if (this.getLigado()) {
			if (this.getVolume() < 100) {
				this.setVolume(this.getVolume() + 10);
				retorno = "Volume: " + this.getVolume();
				String vol = " ";
				for (int i = 0; i < this.getVolume(); i+=10) {
					vol = vol + "|";
				}
				retorno = retorno + vol; 
			} else {
				retorno = "Volume no máximo.";
			}
		} else {
			retorno = "O controle está desligado.";
		}
		
		return retorno;
	}

	@Override
	public String menosVolume() {
		String retorno = "";
		
		if (this.getLigado()) {
			if (this.getVolume() > 0) {
				this.setVolume(this.getVolume() - 10);
				retorno = "Volume: " + this.getVolume();
				String vol = " ";
				for (int i = 0; i < this.getVolume(); i+=10) {
					vol = vol + "|";
				}
				retorno = retorno + vol; 
			} else {
				retorno = "Volume no mínimo.";
			}
		} else {
			retorno = "O controle está desligado.";
		}
		
		return retorno;
	}

	@Override
	public String ligarMudo() {
		String retorno = "";
		
		if (this.getLigado()) {
			if (this.getVolume() > 0) {
				this.setVolume(0);
				retorno = "Volume: X"; 
			} else {
				this.desligarMudo();
			}
		} else {
			retorno = "O controle está desligado.";
		}
		
		return retorno;
	}

	@Override
	public String desligarMudo() {
		String retorno = "";
		
		if (this.getLigado()) {
			if (this.getVolume() == 0) {
				this.setVolume(50);
				retorno = "Volume: " + this.getVolume();
				String vol = " ";
				for (int i = 0; i < this.getVolume(); i+=10) {
					vol = vol + "|";
				}
				retorno = retorno + vol;
			} else {
				this.ligarMudo();
			}
		} else {
			retorno = "O controle está desligado.";
		}
		
		return retorno;
	}

	@Override
	public String play() {
		String retorno = "";
		
		if (this.getLigado()) {
			if (!this.getTocando()) {
				this.setTocando(true);
				retorno = "Tocando.";
			} else {
				this.pause();
			}
		} else {
			retorno = "O controle está desligado.";
		}
		
		return retorno;
	}

	@Override
	public String pause() {
		String retorno = "";
		
		if (this.getLigado()) {
			if (this.getTocando()) {
				this.setTocando(false);
				retorno = "Pausado.";
			} else {
				this.play();
			}
		} else {
			retorno = "O controle está desligado.";
		}
		
		return retorno;
	}

}

package aula01;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 01/08/14

public class Carro {
	private String modelo;
	private String placa;
	private int numPortas;
	private boolean farol;
	private boolean chave;
	private boolean embreagem;
	private boolean freio;
	private int marcha;

	public Carro() {
	}

	public Carro(String modelo, String placa, int numPortas, boolean farol,
			boolean chave, boolean embreagem, boolean freio, int marcha) {
		// super();
		this.modelo = modelo;
		this.placa = placa;
		this.numPortas = numPortas;
		this.farol = farol;
		this.chave = chave;
		this.embreagem = embreagem;
		this.freio = freio;
		this.marcha = marcha;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	public boolean isFarol() {
		return farol;
	}

	public void setFarol(boolean farol) {
		this.farol = farol;
	}

	public boolean isChave() {
		return chave;
	}

	public void setChave(boolean chave) {
		this.chave = chave;
	}

	public boolean isEmbreagem() {
		return embreagem;
	}

	public void setEmbreagem(boolean embreagem) {
		this.embreagem = embreagem;
	}

	public boolean isFreio() {
		return freio;
	}

	public void setFreio(boolean freio) {
		this.freio = freio;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

}

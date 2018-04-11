package aula06;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 07/08/14

public class Gabinete {
	private String modelo;
	private int memeoriaRam;
	private int velocidadeProcessador;
	private String descricaoProcessador;
	private Teclado teclado;
	private Mouse mouse;
	private Monitor monitor;

	public Gabinete(String modelo, int memeoriaRam, int velocidadeProcessador,
			String descricaoProcessador, Teclado teclado, Mouse mouse,
			Monitor monitor) {
		this.modelo = modelo;
		this.memeoriaRam = memeoriaRam;
		this.velocidadeProcessador = velocidadeProcessador;
		this.descricaoProcessador = descricaoProcessador;
		this.teclado = teclado;
		this.mouse = mouse;
		this.monitor = monitor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getMemeoriaRam() {
		return memeoriaRam;
	}

	public void setMemeoriaRam(int memeoriaRam) {
		this.memeoriaRam = memeoriaRam;
	}

	public int getVelocidadeProcessador() {
		return velocidadeProcessador;
	}

	public void setVelocidadeProcessador(int velocidadeProcessador) {
		this.velocidadeProcessador = velocidadeProcessador;
	}

	public String getDescricaoProcessador() {
		return descricaoProcessador;
	}

	public void setDescricaoProcessador(String descricaoProcessador) {
		this.descricaoProcessador = descricaoProcessador;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

}

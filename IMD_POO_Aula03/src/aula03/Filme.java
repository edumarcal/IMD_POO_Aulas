package aula03;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 31/07/14

public class Filme {
	private String nomeFilme;
	private String tipoFilme;
	private int duracao;

	public Filme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}

	public Filme(String nomeFilme, String tipoFilme, int duracao) {
		this.nomeFilme = nomeFilme;
		this.tipoFilme = tipoFilme;
		this.duracao = duracao;
	}

	public Filme(String nomeFilme, String tipoFilme) {
		this.setNomeFilme(nomeFilme);
		this.setTipoFilme(tipoFilme);
	}

	public String getTipoFilme() {
		return tipoFilme;
	}

	public void setTipoFilme(String tipoFilme) {
		this.tipoFilme = tipoFilme;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getNomeFilme() {
		return nomeFilme;
	}

	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}

}

package aula04;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 31/07/14

public class Crianca {
	private String nome;
	private Pai pai;
	private Mae mae;

	public Crianca(String nome, Pai pai, Mae mae) {
		this.nome = nome;
		this.pai = pai;
		this.mae = mae;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pai getPai() {
		return pai;
	}

	public void setPai(Pai pai) {
		this.pai = pai;
	}

	public Mae getMae() {
		return mae;
	}

	public void setMae(Mae mae) {
		this.mae = mae;
	}
}

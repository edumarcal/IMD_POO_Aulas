package aula08.exercicio04;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 14/08/14

public class Fisica extends Pessoa{
	private String cpf;

	public Fisica(String nome, String cpf) {
	super(nome);
	this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}

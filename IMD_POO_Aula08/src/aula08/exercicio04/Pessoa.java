package aula08.exercicio04;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 14/08/14

public class Pessoa {
	protected String nome;

	void escreverNome() {
		System.out.println(nome);
	}

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static void main(String[] args) {
		Juridica jj = new Juridica("Fulaninho", "1111111");
		jj.escreverNome();
		Fisica ff = new Fisica("Ciclano", "2222222");
		ff.escreverNome();

	}
}

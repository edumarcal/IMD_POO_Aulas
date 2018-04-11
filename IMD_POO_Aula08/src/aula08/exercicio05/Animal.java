package aula08.exercicio05;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 14/08/14
public class Animal {
	protected String nome;
	protected int idade;

	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public void comer(String nome) {
		System.out.println(nome + ": Comendo");
	}

	public void andar(String nome) {
		System.out.println(nome + ": Andando");
	}

	public void falar(String nome) {
		System.out.println(nome + ": Falando");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public static void main(String[] args) {
		Cachorro toto = new Cachorro("Toto", 1);
		Gato pompom = new Gato("Pompom", 2);
		pompom.falar(pompom.nome);
		toto.andar(toto.nome);
	}
}

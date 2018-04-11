package aula06;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 07/08/14

public class Professor {
	private String nome;
	private int idade;
	private RecursoDidatico recursoDidatico;
	private Aluno aluno;

	public Professor(String nome, int idade, RecursoDidatico recursoDidatico,
			Aluno aluno) {
		this.nome = nome;
		this.idade = idade;
		this.recursoDidatico = recursoDidatico;
		this.setAluno(aluno);
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

	public RecursoDidatico getRecursoDidatico() {
		return recursoDidatico;
	}

	public void setRecursoDidatico(RecursoDidatico recursoDidatico) {
		this.recursoDidatico = recursoDidatico;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

}

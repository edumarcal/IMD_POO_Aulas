package aula06;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 07/08/14

public class Curso {
	private String disciplina;
	private Professor professor;
	private Aluno aluno;
	private RecursoDidatico recursoDidatico;
	private Gabinete gabinete;

	public Curso(String disciplina, Professor professor, Aluno aluno,
			RecursoDidatico recursoDidatico, Gabinete gabinete) {
		this.disciplina = disciplina;
		this.professor = professor;
		this.aluno = aluno;
		this.recursoDidatico = recursoDidatico;
		this.gabinete = gabinete;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public RecursoDidatico getRecursoDidatico() {
		return recursoDidatico;
	}

	public void setRecursoDidatico(RecursoDidatico recursoDidatico) {
		this.recursoDidatico = recursoDidatico;
	}

	public Gabinete getGabinete() {
		return gabinete;
	}

	public void setGabinete(Gabinete gabinete) {
		this.gabinete = gabinete;
	}
}

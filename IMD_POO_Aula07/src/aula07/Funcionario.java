package aula07;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 14/08/14

public class Funcionario extends Pessoa {

	public Funcionario(String nome, int idade, int matricula,
			String departamento) {
		super(nome, idade);
		this.matricula = matricula;
		this.departamento = departamento;
	}

	private int matricula;
	private String departamento;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

}

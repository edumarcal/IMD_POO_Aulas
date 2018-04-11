package aula;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 03/09/14

public class Agenda {

	/*private*/ int dia;
	/*private*/ int mes;
	/*private*/ String anotacao;

	void anote(int d, int m, String nota) {
		dia = d;
		mes = m;
		anotacao = nota;

		validaData();
	}

	private void validaData() {
		if ((dia < 1) || (dia > 31) || (mes < 1) || (mes > 12)) {
			dia = 0;
			mes = 0;
			anotacao = "Anotacao nao inserida devido a data invalida";
		}
	}

	void mostraAnotacao() {
		System.out.println(dia + "/" + mes + " : " + anotacao);
	}
}

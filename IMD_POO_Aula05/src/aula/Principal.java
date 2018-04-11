package aula;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 03/09/14

public class Principal {

	public static void main(String[] args) {
		Agenda agenda1 = new Agenda();
		Agenda agenda2 = new Agenda();

		agenda1.anote(12, 10, "Dia das Criancas");
		agenda2.anote(7, 15, "Independencia do Brasil");
		
		agenda1.mostraAnotacao();
		agenda2.mostraAnotacao();
		
		//modificação indevida da classe principal
		agenda2.dia = 7;
		agenda2.mes = 15;
		agenda2.anotacao= "Independencia do Brasil";
		
		agenda2.mostraAnotacao();
	}

}

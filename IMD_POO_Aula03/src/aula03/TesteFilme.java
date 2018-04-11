package aula03;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 31/07/14

public class TesteFilme {

	public static void main(String[] args) {
		
		
		//Resolução do exercício 03
		Filme filme = new Filme("Até que a sorte nos separe", "comédia");
		filme.setDuracao(2);

		System.out.println("Nome do filme (0): " + filme.getNomeFilme());
		System.out.println("Tipo do filme (0): " + filme.getTipoFilme());
		System.out.println("Duração do filme (0): " + filme.getDuracao()+" horas");
		
		//Resolução do exercício 04
		Filme filme1 = new Filme("Os vingadores");
		filme1.setTipoFilme("Açao");
		filme1.setDuracao(1);
		
		System.out.println();
		System.out.println("Nome do filme (1): " + filme1.getNomeFilme());
		System.out.println("Tipo do filme (1): " + filme1.getTipoFilme());
		System.out.println("Duração do filme (1): " + filme1.getDuracao()+" horas");

		
		Filme filme2 = new Filme("Julio sumiu", "comedia", 2);
		
		System.out.println();
		System.out.println("Nome do filme (2): " + filme2.getNomeFilme());
		System.out.println("Tipo do filme (2): " + filme2.getTipoFilme());
		System.out.println("Duração do filme (2): " + filme2.getDuracao()+" horas");
		
	}

}

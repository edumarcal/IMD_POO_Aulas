package atividade10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 29/08/14

public class Exercicio05 {

	public static void main(String[] args) {
		// alternativa a)
		System.out.println("=======HashSet=======");
		HashSet<String> hashSetBrinquedos = new HashSet<String>();
		hashSetBrinquedos.add("boneca");
		hashSetBrinquedos.add("carro");
		hashSetBrinquedos.add("bola");
		for (String brinquedos : hashSetBrinquedos) {
			System.out.println(brinquedos);
		}
		System.out.println("tamanho: " + hashSetBrinquedos.size());

		// Alternativa b)
		System.out.println("\n=======ArrayList=======");
		ArrayList<String> arrayListDisciplinas = new ArrayList<String>();
		arrayListDisciplinas.add("matematica");
		arrayListDisciplinas.add("fisica");
		arrayListDisciplinas.add("ingles");
		for (String disciplinas : arrayListDisciplinas) {
			System.out.println(disciplinas);
		}
		System.out.println("Contem portugues "
				+ arrayListDisciplinas.contains("Portugues"));
		// Salientando o case-sensitive
		System.out.println("Contem matematica "
				+ arrayListDisciplinas.contains("matematica"));

		// Alternativa C)
		System.out.println("\n=======HashMap=======");
		HashMap<Integer, String> hashMapNumMatricula = new HashMap<Integer, String>();
		hashMapNumMatricula.put(2010192833, "aline");
		hashMapNumMatricula.put(2014319336, "eduardo");
		hashMapNumMatricula.put(2014000347, "marcal");
		System.out.println(hashMapNumMatricula);
		System.out.println("Apenas os valores");
		for (String alunosCadastrado : hashMapNumMatricula.values()) {
			System.out.println(alunosCadastrado);
		}

		// Alternativa D)
		System.out.println("\n=======Generics=======");
		List<String> lista = new ArrayList<String>();
		lista.add("Raggae");
		lista.add("Forró");
		lista.add("MPB");
		lista.add("Gospel");
		lista.add("Sertanejo");
		lista.add("POP");
		lista.add("HIP-HOP");
		System.out.println("Todos os estilos musicais:");
		for (String listaEstiloMusicais : lista) {
			System.out.println(listaEstiloMusicais);
		}

		System.out.println("O primeiro é: " + lista.get(0));
	}

}

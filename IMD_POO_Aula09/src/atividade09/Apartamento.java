package atividade09;

import javax.swing.JOptionPane;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 21/08/14

public class Apartamento extends Imovel {

	private int andar_apartamento;

	public Apartamento(int num_comodos, String localizacao,
			int andar_apartamento) {
		super(num_comodos, localizacao);
	}

	public int getAndar_apartamento() {
		return andar_apartamento;
	}

	public void setAndar_apartamento(int andar_apartamento) {
		this.andar_apartamento = andar_apartamento;
	}

	public void calcularArea(double numAreaPrivada, double numVagaGaragem, double numAreaComodo) {
		JOptionPane.showMessageDialog(null, "A Area da casa e: " + numAreaPrivada
				+ numVagaGaragem + numAreaComodo + " m²");
	}

}

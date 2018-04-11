package atividade09;

import javax.swing.JOptionPane;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 21/08/14

public class Imovel {
	protected int num_comodos;
	protected String localizacao;

	public Imovel(int num_comodos, String localizacao) {
		this.num_comodos = num_comodos;
		this.localizacao = localizacao;
	}

	public int getNum_comodos() {
		return num_comodos;
	}

	public void setNum_comodos(int num_comodos) {
		this.num_comodos = num_comodos;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public void calcularArea(double numero) {
		JOptionPane.showMessageDialog(null, "A Area desse imovel é: " + numero
				+ " m²");
	}
}

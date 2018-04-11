package atividade09;

import javax.swing.JOptionPane;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 21/08/14

public class Casa extends Imovel {

	public Casa(int num_comodos, String localizacao) {
		super(num_comodos, localizacao);
	}

	public void calcularArea(double numero) {
		JOptionPane.showMessageDialog(null, "A Area da casa e: " + numero
				+ " m²");
	}

	public void calcularArea(double numero1, double numero2) {
		JOptionPane.showMessageDialog(null, "A Area da casa e: " + numero1+numero2
				+ " m²");
	}

}

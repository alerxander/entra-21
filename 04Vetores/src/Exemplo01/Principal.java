package Exemplo01;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		///vetor � um tipo de varavel que armazena varios dados
		String[]nomes=new String[3];
		
		//pedir os tres nomes
		nomes[0] = JOptionPane.showInputDialog("1� nome");
		nomes[1] = JOptionPane.showInputDialog("2� nome");
		nomes[2] = JOptionPane.showInputDialog("3� nome");
		
		//exibir os trs nomes
		String exibirNomes = nomes[0];
		exibirNomes+= "\n"+nomes[1];
		exibirNomes+="\n"+nomes[2];
		JOptionPane.showMessageDialog(null, exibirNomes);

		
		
	}
}

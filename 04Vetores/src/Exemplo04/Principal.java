package Exemplo04;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		// vetores
		String nomes[] = new String[20];
		int[] idades = new int[20];

		// variaveis texte
		int indice = 0;
		int verificarContinuar;
		boolean continuar = true;

		// laço

		do {

			//obter dados
			nomes[indice]= JOptionPane.showInputDialog("Informe o "+(indice+1)+" º nome");
			idades[indice]= Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(indice+1)+" º idade"));
			
			//Incrementa o indice
			indice++;
			
			// verificar se quer continuar
			verificarContinuar = JOptionPane.showConfirmDialog(null, "Continuar?");
			if (verificarContinuar != 0) {
				continuar = false;
			}

		} while (continuar == true);

		//exibir mensagem contendo os nomes e idades
		String mensagem = "DADOS";
		
		for(int i =0;i<nomes.length;i++) {
			if(nomes[i]!= null) {
				mensagem +="\nNome:"+nomes[i]+" - idade: "+idades[i];
			}
			
		}
		JOptionPane.showMessageDialog(null, mensagem);
	}
}

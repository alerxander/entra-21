package exemplo07;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		int [][] numeros = new int [3][2];
		
		//laços
		for(int linha = 0 ;linha<3;linha++) {
			
			
			//colunas
			for(int colunas=0;colunas<2;colunas++) {
				
				
				numeros[linha][colunas] = Integer.parseInt(JOptionPane.showInputDialog(linha+""+colunas));
			}
		}
		
	}
	
}

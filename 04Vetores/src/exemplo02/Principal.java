package exemplo02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	//vetor names
		String []nomes = new String [3];
		
		//variavel indice
		int indice= 0;
		//laço while
		while(indice<3) {
			nomes[indice]=JOptionPane.showInputDialog((indice+1)+"º nome");
			indice++;
		}
		
		//laço while -exibir nomes
		indice = 0;
		while(indice<3) {
			System.out.println((indice+1)+"º nome é "+nomes[indice]);
			indice++;
		}
	}

}

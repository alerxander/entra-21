package Lista3;

import javax.swing.JOptionPane;

public class exerci04 {
public static void main(String[] args) {
	boolean verifica =false;
	int posicao=0;
	int[]numeros=new int[5];
	for(int i=0;i<5;i++) {
		int obter=Integer.parseInt(JOptionPane.showInputDialog("informe 5 numeros"));
		numeros[i]=obter;
		if(obter==10) {
			posicao =i;
			verifica=true;
		}
		
	}
	if(verifica==true) {
		JOptionPane.showMessageDialog(null, "O número 10 está na posição "+posicao+" do vetor" );
	}else {
		JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum número 10 ");
	}
}
}

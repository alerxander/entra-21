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
		JOptionPane.showMessageDialog(null, "O n�mero 10 est� na posi��o "+posicao+" do vetor" );
	}else {
		JOptionPane.showMessageDialog(null, "N�o foi encontrado nenhum n�mero 10 ");
	}
}
}

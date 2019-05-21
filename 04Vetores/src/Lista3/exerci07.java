package Lista3;

import javax.swing.JOptionPane;

public class exerci07 {

	public static void main(String[] args) {
		int diagP = 5;
		int diagS=4;
		int[][] matris=new int [5][5];
		for(int i1=0;i1<5;i1++) {
			for(int i2=0;i2<5;i2++) {
			matris[i1][i2]=	Integer.parseInt(JOptionPane.showInputDialog("informe 25 numeros um de cada vez"));
			}
		}
		
		int somaLinha=0,somaColuna=0,somaDiagonalP=0,somaDiagonalS=0,somatotal=0;
		for(int i =0;i<5;i++) {
			somaLinha+=matris[4][i];		
		}
		JOptionPane.showMessageDialog(null,"a soma da quarta linha é "+somaLinha);
		for(int i =0;i<5;i++) {
			somaColuna+=matris[i][2];	
		}
		JOptionPane.showMessageDialog(null,"A soma dos números informados na segunda coluna é "+somaColuna);
		for(int i= 0;i<5;i++) {
			somaDiagonalS+=matris[diagS][i];
			diagS--;
		}
		JOptionPane.showMessageDialog(null, "A soma da diagonal Secundaria é "+somaDiagonalS);
		for(int i=0;i<5;i++) {
			for(int i2=4;i2>=0;i2--) {
			somaDiagonalP+=matris[i][i2];
			}
		}
		JOptionPane.showMessageDialog(null, "A soma da diagonal principal é "+somaDiagonalS);
		for(int i1=0;i1<5;i1++) {
			for(int i2=0;i2<5;i2++) {
			somatotal=matris[i1][i2];
			}
		
	}
		String mensagem="";
		for(int i1=0;i1<5;i1++) {
			for(int i2=0;i2<5;i2++) {

				mensagem += "\n"+matris[i1][i2];
			}
		
}
		JOptionPane.showMessageDialog(null, mensagem);
}
}
package Lista3;

import javax.swing.JOptionPane;

public class exerci08 {
public static void main(String[] args) {
	
	
	int[][]matrisA = new int [3][2];
	int[][]matrisB=new int [2][3];
	
	for(int i =0;i<3;i++) {
		for(int i2=0;i2<2;i2++) {
			matrisA[i][i2]=Integer.parseInt(JOptionPane.showInputDialog("informe 6 numeros"));
		}
	}
	String mensagem="";
	for(int i =0;i<3;i++) {
		for(int i2=0;i2<2;i2++) {
		mensagem+=" "+matrisA[i][i2];	
		}
		mensagem+="\n";
		}JOptionPane.showMessageDialog(null, mensagem);
	
		for(int i =0;i<2;i++) {
			for(int i2=0;i2<3;i2++) {
			matrisB[i][i2]=matrisA[i2][i];		
			}
			}
		String mensagem2="";
		for(int i =0;i<2;i++) {
			for(int i2=0;i2<3;i2++) {
			mensagem2+=" "+matrisB[i][i2];	
			}
			mensagem2+="\n";
			}JOptionPane.showMessageDialog(null, mensagem2
					);
}
}

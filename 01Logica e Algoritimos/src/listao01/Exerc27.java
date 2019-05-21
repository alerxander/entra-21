package listao01;

import javax.swing.JOptionPane;

public class Exerc27 {

	public static void main(String[] args) {
		
		
		
		int ano =Integer.parseInt(JOptionPane.showInputDialog("informe o ano"));
		if(ano%4==0) {
			JOptionPane.showMessageDialog(null, "ano bissexto");
		}else {
			JOptionPane.showMessageDialog(null, "ano Não é bissexto");
		}
		
	}
}

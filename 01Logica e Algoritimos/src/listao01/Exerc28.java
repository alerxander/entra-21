package listao01;

import javax.swing.JOptionPane;

public class Exerc28 {
 public static void main(String[] args) {
	

	int num = Integer.parseInt(JOptionPane.showInputDialog("informe um numero inteiro"));
	
	if(num %2 ==0) {
		JOptionPane.showMessageDialog(null, "este numero é par");
	}else {
		JOptionPane.showMessageDialog(null, "este numero não é par");
	}
}
}
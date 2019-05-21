package listao01;

import javax.swing.JOptionPane;

public class Exerc22 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"Para saber se um objeto é quadrado informe  cumprimento dos quatro lados");
	int valor1 = Integer.parseInt(JOptionPane.showInputDialog("informe o cumprimento do 1°lado"));
	int valor2 = Integer.parseInt(JOptionPane.showInputDialog("informe o cumprimento do 2°lado"));
	int valor3 = Integer.parseInt(JOptionPane.showInputDialog("informe o cumprimento do 3°lado"));
	int valor4 = Integer.parseInt(JOptionPane.showInputDialog("informe o cumprimento do 4°lado"));
	if(valor1 == valor2 && valor1==valor3 && valor1 == valor4 ) {
		JOptionPane.showMessageDialog(null, "objeto é quadrado");
	}else {
		JOptionPane.showMessageDialog(null, "objeto não é quadrado");
	}
		

	}

}

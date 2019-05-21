package listao01;

import javax.swing.JOptionPane;

public class Exer01 {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("informe seu nome!");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("imforme sua idade!"));
		String cidade = JOptionPane.showInputDialog("informe a cidade onde mora");

		JOptionPane.showMessageDialog(null,
				" Olá " + nome + ", você tem" + idade + "anos de idade e mora em " + cidade);

	}

}

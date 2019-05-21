package listao01;

import javax.swing.JOptionPane;

public class Exerc26 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("informe seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("informe sua idade"));

		if (idade == 0 && idade < 4) {
			JOptionPane.showMessageDialog(null, nome + " é Bebe");
		} else if (idade >= 5 && idade <= 11) {
			JOptionPane.showMessageDialog(null, nome + " é Criança");
		} else if (idade >= 12 && idade <= 14) {
			JOptionPane.showMessageDialog(null, nome + " é Adolescente");
		} else if (idade >= 25 && idade <= 30) {
			JOptionPane.showMessageDialog(null, nome + " é Jovem");
		} else if (idade >= 31 && idade <= 45) {
			JOptionPane.showMessageDialog(null, nome + " é Maduro(a)");
		} else if (idade >= 46 && idade <= 60) {
			JOptionPane.showMessageDialog(null, nome + " é Adulto");
		} else if (idade >= 71 && idade <= 75) {
			JOptionPane.showMessageDialog(null, nome + " é idoso I");
		} else if (idade >= 76 && idade >= 90) {
			JOptionPane.showMessageDialog(null, nome + " é idoso II");
		} else if (idade > 90) {
			JOptionPane.showMessageDialog(null, nome + " é idoso III");
		}
		else {
			JOptionPane.showMessageDialog(null, "numero invalido");
		}
	}

}

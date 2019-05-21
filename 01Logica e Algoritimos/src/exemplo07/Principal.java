package exemplo07;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {

		// condicional composta

		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("nota 1"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("nota 2"));

		double media = (nota1 + nota2) / 2;

		if (media == 10) {
			JOptionPane.showConfirmDialog(null, "Parabens!você obteve media 10"+media);
		} else if (media >= 9) {
			JOptionPane.showConfirmDialog(null, "Otimo com media"+media);
		} else if (media >= 8) {
			JOptionPane.showConfirmDialog(null, "bom com media"+media);
		} else if (media >= 7) {
			JOptionPane.showConfirmDialog(null, "na media"+media);
		} else if (media >= 5) {
			JOptionPane.showConfirmDialog(null, "em exame com media"+media);
		} else {
			JOptionPane.showConfirmDialog(null, "reprovado"+media);
		}

	}
}

package listao01;

import javax.swing.JOptionPane;

public class Exerc25 {

	public static void main(String[] args) {

		boolean valida = false;
		while (valida == false) {

			try {
				int hora = Integer.parseInt(JOptionPane.showInputDialog("informe a hora"));
				if (hora >= 0 && hora <= 6) {
					JOptionPane.showMessageDialog(null, "Boa madrugada");
				} else if (hora >= 7 && hora <= 11) {
					JOptionPane.showMessageDialog(null, "Bom dia");
				} else if (hora >= 12 && hora <= 18) {
					JOptionPane.showMessageDialog(null, "Boa Tarde");
				} else if (hora >= 19 && hora <= 23) {
					JOptionPane.showMessageDialog(null, "Boa noite");
				}
				valida = true;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "somente numeros inteiros,tente novamente");
				valida = false;
			}
		}

	}
}
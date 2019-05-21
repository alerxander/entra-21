package listao01;

import javax.swing.JOptionPane;

public class Exer05 {

	public static void main(String[] args) {

		int dia = Integer
				.parseInt(JOptionPane.showInputDialog("informe um dia qualquer para saber se é find ou dia de semana"));

		if ((dia >= 1) && (dia <= 28)) {
			if ((dia == 2) || (dia == 3) || (dia == 9) || (dia == 10) || (dia == 16) || (dia == 17) || (dia == 23)
					|| (dia == 24)) {
				JOptionPane.showMessageDialog(null, "Final de Semana");
			} else {
				JOptionPane.showMessageDialog(null, "Dia de semana");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Dia invalido");
		}
	}

}

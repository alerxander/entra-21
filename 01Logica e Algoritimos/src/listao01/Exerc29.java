package listao01;

import javax.swing.JOptionPane;

public class Exerc29 {

	public static void main(String[] args) {
		int horaA = Integer.parseInt("informe a hora atual,sem os minutos");
		int horaN;
		int valida = Integer.parseInt(JOptionPane
				.showInputDialog("qual pais deseja saber a hora atual?\n1-Estados Unidos\n2-Inglaterra\n3-Russia"));
		switch (valida) {
		case 1:
			horaN = horaA - 1;
			JOptionPane.showConfirmDialog(null, "Agora são " + horaN + " horas nos Estados Unidos");
			break;
		case 2:
			horaN = horaA + 4;
			JOptionPane.showConfirmDialog(null, "Agora são " + horaN + " horas na Inglaterra");
		default:
		case 3:
			horaN = horaA + 6;
			JOptionPane.showConfirmDialog(null, "Agora são "+horaN+" horas na Russia");
			break;
		}

	}

}

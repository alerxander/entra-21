package exercicio02;

import java.util.Random;

import javax.swing.JOptionPane;

public class JogoAdivinha {
	public static void main(String[] args) {
		int palpites = 0;
		double aleatorio = Math.random() * 100;
		double numero = Math.round(aleatorio);
		boolean verifica = false;
		while (verifica == false) {
			int usuario = Integer.parseInt(
					JOptionPane.showInputDialog("jogo da adivinha,\n tente adivinhar o numero para passar desta fase"));

			if (usuario == numero) {
				JOptionPane.showMessageDialog(null, "Nossa! Acertou na mosca");
				verifica = true;
			} else if (usuario == numero && palpites <= 5) {
				JOptionPane.showMessageDialog(null, "Parabéns! Você é bom de adivinhação");
				verifica = true;
			} else if (usuario == numero && palpites <= 10) {
				JOptionPane.showMessageDialog(null, "Muito bom. Continue assim");
				verifica = true;
			} else if (usuario == numero && palpites <= 20) {
				JOptionPane.showMessageDialog(null, "Mm... Podia ser melhor. Continue tentando");
				verifica = true;
			} else if (usuario == numero && palpites > 20) {
				JOptionPane.showMessageDialog(null, "Meio lerdo você, hein?");
				verifica = true;
			} else if ((numero-usuario)<=10) {
				JOptionPane.showMessageDialog(null, "Está perto");
			} else if ((numero-usuario)<=20) {
				JOptionPane.showMessageDialog(null, "está longe");
			} else if ((numero-usuario)>20) {
				JOptionPane.showMessageDialog(null, "esta muito longe");
			}
		}

	}
}

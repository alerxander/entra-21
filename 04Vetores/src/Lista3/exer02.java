package Lista3;

import javax.swing.JOptionPane;

public class exer02 {

	public static void main(String[] args) {
		int[] numeros1 = new int[10];
		int[] numeros2 = new int[10];
		int soma = 0;
		for (int i = 0; i < 10; i++) {
			numeros1[i] = Integer.parseInt(JOptionPane.showInputDialog("informe 10 numeros um de cada vez"));
		}

		for (int i2 = 0; i2 < 10; i2++) {
			numeros2[i2] = Integer.parseInt(JOptionPane.showInputDialog("informe novamente 10 numeros um de cada vez"));
		}
		String mensagem = "";
		Object[] opcao = { "somar", "subtrair", "multiplicar", "Dividir" };
		int opcao1 = JOptionPane.showOptionDialog(null, "qual operação deseja realizar?", "menu",
				JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, opcao, 0);
		if (opcao1 == 0) {
			for (int i = 0; i < 10; i++) {
				soma = numeros1[i] + numeros2[i];
				mensagem += "\n" + numeros1[i] + " + " + numeros2[i] + " | soma= " + soma;
			}
			JOptionPane.showMessageDialog(null, mensagem);
		} else if (opcao1 == 1) {

			for (int i = 0; i < 10; i++) {
				soma = numeros1[i] - numeros2[i];
				mensagem += "\n" + numeros1[i] + " - " + numeros2[i] + " | soma= " + soma;
			}
			JOptionPane.showMessageDialog(null, mensagem);

		} else if (opcao1 == 2) {

			for (int i = 0; i < 10; i++) {
				soma = numeros1[i] * numeros2[i];
				mensagem += "\n" + numeros1[i] + " * " + numeros2[i] + " | soma= " + soma;
			}
			JOptionPane.showMessageDialog(null, mensagem);
		} else if (opcao1 == 3) {

			for (int i = 0; i < 10; i++) {
				soma = numeros1[i] / numeros2[i];
				mensagem += "\n" + numeros1[i] + " / " + numeros2[i] + " | soma= " + soma;
			}
			JOptionPane.showMessageDialog(null, mensagem);
		}
	}
}

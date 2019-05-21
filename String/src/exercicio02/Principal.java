package exercicio02;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {

		String frase = JOptionPane.showInputDialog("informe uma frase");

		String pegaFrase = "";
		int vogais = 0;
		int tamanho = frase.length();

		for (int i = 0; i < tamanho; i++) {
			pegaFrase = String.valueOf(frase.charAt(i));

			if (pegaFrase.equals("a") || pegaFrase.equals("e") || pegaFrase.equals("i") || pegaFrase.equals("o")
					|| pegaFrase.equals("u")) {

				vogais++;

			}
		}

		JOptionPane.showMessageDialog(null, "A quantidade de vogais= " + vogais);
	}
}

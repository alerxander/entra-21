package exercicio03;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {

		String verbo = JOptionPane.showInputDialog("informe um verbo terminado em 'AR'");
		int tamanho = verbo.length();
		String verboUsar = verbo.toLowerCase();
		String fim = "ar";
		
		
		String Mensagem1 = "";
		String Mensagem2 = "";
		String Mensagem3 = "";
		String Mensagem4 = "";
		String Mensagem5 = "";
		String Mensagem6 = "";

		if (verboUsar.endsWith(fim)) {

			for (int i = 0; i < (tamanho - 2); i++) {
				Mensagem1 += String.valueOf(verbo.charAt(i));
				Mensagem2 += String.valueOf(verbo.charAt(i));
				Mensagem3 += String.valueOf(verbo.charAt(i));
				Mensagem4 += String.valueOf(verbo.charAt(i));
				Mensagem5 += String.valueOf(verbo.charAt(i));
				Mensagem6 += String.valueOf(verbo.charAt(i));
			}
			Mensagem1 += "o";
			Mensagem2 += "as";
			Mensagem3 += "a";
			Mensagem4 += "amos";
			Mensagem5 += "ais";
			Mensagem6 += "am";
			JOptionPane.showMessageDialog(null,
					"eu " + Mensagem1 + "\n tu " + Mensagem2 + "\n ele " + Mensagem3 + "\n nós "
							+ Mensagem4 + "\n vós " + Mensagem5 + "\n eles " + Mensagem6);

		} else {
			JOptionPane.showMessageDialog(null, "o termo inserido nao é um verbo");
		}

	}
}

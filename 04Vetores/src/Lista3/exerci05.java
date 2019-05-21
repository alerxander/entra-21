package Lista3;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class exerci05 {
	public static void main(String[] args) {

		boolean verifica = false;
		boolean verifica2 = false;
		String[] gabarito = new String[10];
		String[] gabaritoAluno = new String[10];
		int posicao = 0;
		String[] nomes = new String[10];
		int []erros = new int[10];
		int[] acertos = new int[10];
		while (verifica == false) {
			while (verifica2 == false) {
				for (int i = 0; i < 10; i++) {
					String letra = JOptionPane.showInputDialog("informe o gabarito com as opções A,B,C,D:");
					if (letra.equals("A") || letra.equals("B") || letra.equals("C") || letra.equals("D")) {
						verifica2 = true;
						gabarito[i] = letra;
					} else {
						JOptionPane.showMessageDialog(null, "Apenas as letras A,B,C,D");
					}
				}
			}

			verifica2 = false;
			String sair = JOptionPane.showInputDialog("informe o nome do aluno \n Digite 'Sair' para sair");
			if (!sair.equals("Sair")) {
				while (verifica2 == false) {
					nomes[posicao] = sair;
					
					for (int i = 0; i < 10; i++) {
						String letra = JOptionPane
								.showInputDialog("informe o gabarito do Aluno com as opções A,B,C,D:");
						if (letra.equals("A") || letra.equals("B") || letra.equals("C") || letra.equals("D")) {
							verifica2 = true;
							gabaritoAluno[i] = letra;

						} else {
							JOptionPane.showMessageDialog(null, "Apenas as letras A,B,C,D");
						}
					}
				}

				for (int i = 0; i < 10; i++) {
					if (gabarito[i].equals(gabaritoAluno[i])) {
						acertos[posicao]+=1;
					} else if (gabarito[i] != gabaritoAluno[i]) {
						erros[posicao]=+1;
					}
				}
				JOptionPane.showMessageDialog(null, "o aluno teve " + acertos[posicao] + " acertos e "+erros[posicao	]+" erros");
			} else if (sair.equals("Sair")) {
				verifica = true;
			}
			
			posicao++;

		}
		String n = null;
		int maiorNumero = 0;
		for (int i1 = 0; i1 < 9; i1++) {
			for (int i2 = i1 + 1; i2 < 10; i2++) {
				if (acertos[i2] > acertos[i1]) {
					maiorNumero = acertos[i2];
					acertos[i2] = acertos[i1];
					acertos[i1] = maiorNumero;
					n = nomes[i1];
					nomes[i1] = nomes[i2];
					nomes[i2] = n;

				}
			}

		}
		String mensagem = "";
		for (int i = 0; i < nomes.length; i++) {
			if(!(nomes[i]==null)) {
			mensagem += "\n" + nomes[i] + " acertou " + acertos[i] ;
			}
		}
JOptionPane.showMessageDialog(null, mensagem);
	}
}

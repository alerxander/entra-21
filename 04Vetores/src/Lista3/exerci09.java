package Lista3;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class exerci09 {
	public static void main(String[] args) {
		String[][] informacao = new String[20][6];
		int qtd1 = 0, qtd2 = 0, qtd3 = 0, qtd4 = 0, qtd5 = 0, qtd6 = 0, qtd7 = 0;
		int situ1 = 0, situ2 = 0, situ3 = 0, situ4 = 0, situ5 = 0, situ6 = 0, situ7 = 0;
		int homem = 0, mulher = 0;
		for (int i = 1; i < 4; i++) {
			informacao[i][0] = "nome:";
			informacao[i][0] = JOptionPane.showInputDialog("informe seu nome");
			informacao[i][1] = JOptionPane.showInputDialog("informe seu sexo:\nmasculino\nfeminino");
			if (informacao[i][1].equals("masculino")) {
				homem++;
			} else if (informacao[i][1].equals("feminino")) {
				mulher++;
			}
			informacao[i][2] = JOptionPane.showInputDialog("informe sua altura");
			informacao[i][3] = JOptionPane.showInputDialog("informe seu peso");
		}

		informacao[0][4] = "IMC";
		informacao[0][5] = "situação";
		DecimalFormat form = new DecimalFormat();
		for (int i = 1; i < 4; i++) {
			double imc1 = Double.parseDouble(informacao[i][3]);
			double imc2 = Double.parseDouble(informacao[i][2]);
			double imc = imc1 / (Math.pow(imc2, 2));

			informacao[i][4] = String.valueOf(imc);
			if (imc < 17) {
				informacao[i][5] = "Muito abaixo do peso ";
				qtd1++;
				situ1++;
			} else if (imc >= 17 && imc < 18.49) {
				informacao[i][5] = "Abaixo do peso ";
				qtd2++;
				situ2++;
			} else if (imc >= 18.5 && imc < 24.99) {
				informacao[i][5] = "Peso normal ";
				qtd3++;
				situ3++;
			} else if (imc >= 25 && imc < 29.99) {
				informacao[i][5] = "Acima do peso ";
				qtd4++;
				situ4++;
			} else if (imc >= 30 && imc < 34.99) {
				informacao[i][5] = "Obesidade I ";
				qtd5++;
				situ5++;
			} else if (imc >= 35 && imc < 39.99) {
				informacao[i][5] = "Obesidade II (severa) ";
				qtd6++;
				situ6++;
			} else if (imc > 40) {
				informacao[i][5] = "Obesidade III (mórbida) ";
				qtd7++;
				situ7++;
			}
		}

		String mensagem = "";
		for (int i = 0; i < 5; i++) {

			mensagem += "\n" + informacao[i][0] + " |  " + informacao[i][4] + " |   " + informacao[i][5];
		}
		int total = homem + mulher;
		int percentualH = (100 / total) * homem;
		int percentualM = (100 / total) * mulher;

		JOptionPane.showMessageDialog(null, mensagem);
		JOptionPane.showMessageDialog(null,
				"Quantidade e percentual de homens e mulheres que participou:\nquantidade de homens: " + homem
						+ "\nquatidade de mulheres: " + mulher + "\npercentual de homens: " + percentualH
						+ "%\nPercentual de mulheres: " + percentualM + "%");

		JOptionPane.showMessageDialog(null,
				"quantidade de cada situação \nMuito abaixo do peso  :" + situ1 + " \nAbaixo do peso : " + situ2
						+ "\nPeso normal : " + situ3 + " \nAcima do peso : " + situ4 + " \nObesidade I : " + situ5
						+ " \nObesidade II (severa): " + situ6 + "\n Obesidade III (mórbida) : " + situ7);

	}

}

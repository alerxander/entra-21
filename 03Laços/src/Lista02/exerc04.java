package Lista02;

import javax.swing.JOptionPane;

public class exerc04 {
	public static void main(String[] args) {

		boolean valida = false;
		int qtidadeC = 0;
		int qtidadeA = 0;
		int qtidadeV = 0;
		while (valida == false) {
			double excelente = 0, otimo = 0, bom = 0, regular = 0, ruim = 0;
			int idade = Integer.parseInt(JOptionPane.showInputDialog("informe sua idade!"));
			int opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"por favor,informe a qualidade do filme:\n1-Exelente\n2-Otimo\n3-Bom\n4-Regular\n5-Ruim"));
			int totalNota = 0;

			if (idade > 0 && idade <= 9) {
				qtidadeC++;
			} else if (idade >= 10 && idade <= 17) {
				qtidadeA++;
			} else if (idade > 17 && idade <= 100) {
				qtidadeV++;
			}
			switch (opcao) {
			case 1:
				excelente += 1;
				totalNota++;
				break;
			case 2:
				otimo += 1;
				totalNota++;
				break;
			case 3:
				bom += 1;
				totalNota++;
				break;
			case 4:
				regular += 1;
				totalNota++;
				break;
			case 5:
				ruim += 1;
				totalNota++;
				break;
			default:
				break;
			}
			int continuar = Integer.parseInt(JOptionPane.showInputDialog("deseja votar novamente?\n1-sim\n2-não"));
			if (continuar == 2) {
				valida = true;

			}
			JOptionPane.showMessageDialog(null,
					"Execelente teve " + (100/totalNota ) * excelente + "% de votos\notimo teve"
							+ (100/totalNota ) * otimo + "% de votos\nBom teve " + (100/totalNota ) * bom
							+ "% de votos/nregular teve " + (100/totalNota) * regular + "% de votos\nruim teve "
							+ (100/totalNota ) * ruim + "% de votos");
			JOptionPane.showMessageDialog(null, "quantidade de:\ncrianças(0 á 9 anos) =" + qtidadeC
					+ "\nadolescentes(10 á 17 anos) =" + qtidadeA + "\naldutos(acima de 17 anos" + qtidadeV);
		}
	}
}

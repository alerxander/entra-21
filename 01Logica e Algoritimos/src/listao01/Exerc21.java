package listao01;

import javax.swing.JOptionPane;

public class Exerc21 {

	public static void main(String[] args) {

		int opcao = Integer
				.parseInt(JOptionPane.showInputDialog("produtos:\n1-calça\n2-camisa\n3-casaco\n4-Meias\n5-paleto"));
		int valor = Integer.parseInt(
				JOptionPane.showInputDialog("Formas de pagamento:\n1-a vista\n2-prazo 30 dias\n3-prazo 60 dias"));

		if(valor==1) {

			switch (opcao) {
			case 1:
				JOptionPane.showMessageDialog(null, "seu produto é calça e custara R$ 150,00");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "seu produto é Camisa e custara R$300,00");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "seu produto é Casaco e custara R$ 250,00");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "seu produto é meias e custara R$ 30,00");
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "seu produto é paleto e custara R$ 450,00");
				break;
			}
		}
		else if(valor==2) {

			switch (opcao) {
			case 1:
				JOptionPane.showMessageDialog(null, "seu produto é calça e custara R$ 165,00");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "seu produto é Camisa e custara R$330,00");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "seu produto é Casaco e custara R$ 275,00");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "seu produto é meias e custara R$ 33,00");
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "seu produto é paleto e custara R$ 495,00");
				break;
			}
		}
		else if(valor==3) {
			
			switch (opcao) {
			case 1:
				JOptionPane.showMessageDialog(null, "seu produto é calça e custara R$ 180,00");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "seu produto é Camisa e custara R$360,00");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "seu produto é Casaco e custara R$ 300,00");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "seu produto é meias e custara R$ 36,00");
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "seu produto é paleto e custara R$ 540,00");
				break;
			}
			

		}

	}

}

package Lista02;

import javax.swing.JOptionPane;

public class exer03 {
	public static void main(String[] args) {

		boolean valida = true;
		double totalApagar = 0;
		
		 do{
			 int opcao = Integer.parseInt(JOptionPane.showInputDialog(
						"segue cardapio\n1-Hamburguer+suco de laranja = R$ 5,00\n2-Sanduiche natural+suco de uva = R$4,50\n3-Prato do dia = R$8,00\n4-mais opçoes\n5- sair"));

			switch (opcao) {
			case 1:
				totalApagar +=5;
				break;
			case 2:
				totalApagar +=4.5;
				break;
			case 3:
				totalApagar +=8;
				break;
			case 4:
				int opcao2 = Integer.parseInt(JOptionPane.showInputDialog(
						"1- pizza = R$12,00\n2- Lasanha = R$16,00\n3- Pão de queijo = R$1,00\n4- Bolo = R$2,50\n5- sair"));
				switch (opcao2) {
				case 1:
					totalApagar +=12;
					break;
				case 2:
					totalApagar +=16;
					break;
				case 3:
					totalApagar +=1;
					break;
				case 4:
					totalApagar+=2.50;
					break;
				case 5:
					valida=false;
					break;
				default:
					JOptionPane.showMessageDialog(null, "opção invalida,tente novamente");
					break;
				}
			case 5:
				valida = false;
				break;
			default:
				JOptionPane.showMessageDialog(null, "opção invalida,tente novamente");
				break;
			}
		}while (valida == true);
		
		
		
		boolean valida2 = false;
		while (valida2 == false) {
			int valorPago = Integer.parseInt(JOptionPane
					.showInputDialog("preço total a pagar é de R$" + totalApagar + "\n informe o valor do pagamento"));
			if (valorPago >= totalApagar) {
				double resto = totalApagar - valorPago;
				if (resto <= 0) {
					JOptionPane.showMessageDialog(null, "Compra concluida com sucesso");
					valida2=true;
				} else {
					JOptionPane.showMessageDialog(null, "Compra concluida com sucesso,seu troco é de R$" + resto);
					valida2=true;
				}
			} else {
				JOptionPane.showMessageDialog(null, "valor insuficiente para realizar a compra,tente novamente");
			}
		}
	}
}

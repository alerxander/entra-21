package listao01;

import javax.swing.JOptionPane;



public class Exer04 {

	public static void main(String[] args) {
		
		
		JOptionPane.showMessageDialog(null, "informe  o Nome de um produto, valor e forma de pagamento");
		String nome = JOptionPane.showInputDialog("Nome do produto");
		int valor =Integer.parseInt(JOptionPane.showInputDialog("valor do produto"));
		String FormaPagamento=JOptionPane.showInputDialog("Forma de pagamento");
		int desconto = (valor/100)*10;
		
		if(valor>500 && FormaPagamento.equals("a vista")) {
			JOptionPane.showMessageDialog(null, "com o ganho de 10% de desconto seu produto"+nome+" custara "+valor*0.9);
		}else {
			JOptionPane.showMessageDialog(null, "Você nao ganhou desconto");
		}
		

	}

}

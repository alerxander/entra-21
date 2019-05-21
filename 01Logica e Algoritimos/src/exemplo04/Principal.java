package exemplo04;

import javax.swing.JOptionPane;



public class Principal {

	public static void main(String[] args) {

		/*
		 * JOptionPane.showMessageDialog(null, "Bom dia!");
		 * JOptionPane.showMessageDialog(null, "Tudo ok?");
		 * JOptionPane.showMessageDialog(null, "informação", "titulo",
		 * JOptionPane.INFORMATION_MESSAGE);
		 * JOptionPane.showMessageDialog(null,"perigo",
		 * "titulo",JOptionPane.WARNING_MESSAGE); JOptionPane.showMessageDialog(null,
		 * "falha","titulo",JOptionPane.ERROR_MESSAGE);
		 */

		// armazenar valores

	/*	String nome = JOptionPane.showInputDialog("informe seu nome!");
		JOptionPane.showMessageDialog(null, "Bom dia " + nome);
		int idade = Integer.parseInt(JOptionPane.showInputDialog("informe sua idade!"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("informe sua altura!"));

		String mensagem = "Nome: " + nome;
		mensagem += "\nIdade: " + idade;
		mensagem += "\nAltura: " + altura;

		JOptionPane.showMessageDialog(null, mensagem);
		*/
		
		
		/*caixa de confirmação
		
		int resposta = JOptionPane.showConfirmDialog(null, "gostando de java?");
		
		switch (resposta) {
		case 0:
			JOptionPane.showMessageDialog(null, "que bom!");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "que pena!");
		case 2:
			JOptionPane.showMessageDialog(null, "Você cancelou");

		default:
			JOptionPane.showMessageDialog(null, "você saiu!");
		}
		*/
		
		/* caixa de confirmação 2
		
		int resposta = JOptionPane.showConfirmDialog(null, "hoje é terça?","titulo",JOptionPane.OK_CANCEL_OPTION);
		*/
		
		
		//comparando string
		
		String nome1=JOptionPane.showInputDialog( "informe seu primero nome");
		String nome2=JOptionPane.showInputDialog("Informew o segundo nome");
		System.out.println (nome1.equals(nome2));
	}
}

package Lista02;

import javax.swing.JOptionPane;

public class exer02 {

	public static void main(String[] args) {

		boolean valida = false;
		while (valida == false) {
			String nome = JOptionPane.showInputDialog("nome do jogador");
			if (nome.equals("sair")) {
				valida =true;
			}
			double altura = Double.parseDouble(JOptionPane.showInputDialog("informe a atura do jogador"));
			double peso = Double.parseDouble(JOptionPane.showInputDialog("informe o peso do jogador"));
			int idade= Integer.parseInt(JOptionPane.showInputDialog("qual a idade do jogador?"));
			
			int qjogador = 0;
			qjogador++;
			int maisVelho=0;
			String nomeMaisvelho="";
			double maiorAltura = 0;
			String nomeMaior="";
			double pesoMaior= 0;
			String nomePeso="";
			
			if(altura>maiorAltura) {
				maiorAltura= altura;
				nomeMaior=nome;
			}
			
			if(idade>maisVelho) {
				maisVelho=idade;
				nomeMaisvelho = nome;
			}
			if(peso>pesoMaior) {
				pesoMaior =peso;
				nomePeso = nome;
			}
			
			double soma = 0;
			soma =altura+ soma;
			double media = soma/qjogador;
			JOptionPane.showMessageDialog(null, "a quantidades de jogador é "+qjogador);
			JOptionPane.showMessageDialog(null,"o "+nomeMaior+" é o maior jogador com "+maiorAltura+" de altura");
			JOptionPane.showMessageDialog(null,"o "+nomeMaisvelho+" é o jogador mais velho com "+maisVelho+" anos");
			JOptionPane.showMessageDialog(null,"o "+nomePeso+" é o jogador mais pesado com "+pesoMaior+" Kg");
			JOptionPane.showMessageDialog(null,"a média das alturas é "+media);
		}
	}

}

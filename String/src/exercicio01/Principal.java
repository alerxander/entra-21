package exercicio01;

import javax.swing.JOptionPane;

public class Principal {

	
	public static void main(String[] args) {
		
	
	String nome = JOptionPane.showInputDialog("informe um nome");
	String mensagem="";
	String mensagemExibida="";
	int tamanho = nome.length();
	
	for(int i=0;i<tamanho;i++) {
		
		if(i%2==0) {
		mensagem=String.valueOf(nome.charAt(i));
		mensagemExibida +=mensagem.toUpperCase();
		}else {
		mensagem=String.valueOf(nome.charAt(i));
		mensagemExibida+=mensagem;
		}
	}
	
	JOptionPane.showMessageDialog(null, mensagemExibida);
}
	
}

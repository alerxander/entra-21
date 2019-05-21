package exemplo01;

import javax.swing.JFrame;

public class principal {
public static void main(String[] args) {
	//criar um  formulario	
	JFrame formulario = new JFrame();
	//define o tamnho do formulario
	formulario.setSize(500,300);
	//Sair e nao ficar em segundo plano
	formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//aparecer o formulario
	formulario.setVisible(true);
	//titulo no painel
	formulario.setTitle("Meu primeiro formulario");
	//centraliza o painel da abertura
	formulario.setLocationRelativeTo(null);
	
}
}

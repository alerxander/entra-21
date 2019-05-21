package exemplo04;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Principal {
public static void main(String[] args) {
	JFrame formulario = new JFrame();
	formulario.setSize(500,300);
	formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	formulario.setTitle("Meu primeiro formulario");
	formulario.setLocationRelativeTo(null);
	formulario.setLayout(null);
	
	// caixa de combinaçao,opções dentro da caixa
	JComboBox<String> combo = new JComboBox<String>();
	combo.setBounds(10, 10, 470, 30);
	combo.addItem("opção 01");
	combo.addItem("opção 02");
	combo.addItem("opção 03");

	//adicionar combo ao formulario
	formulario.add(combo);
	
	//exibir formularios e componentes
	formulario.setVisible(true);
	
}
}

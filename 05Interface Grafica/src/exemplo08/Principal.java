package exemplo08;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Principal {
public static void main(String[] args) {
	JFrame formulario = new JFrame();
	formulario.setSize(500,300);
	formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	formulario.setTitle("Meu primeiro formulario");
	formulario.setLocationRelativeTo(null);
	formulario.setLayout(null);
	
	//textArea
	
	JTextArea campo =new JTextArea();
	
	
	//Scroll
	JScrollPane barra  = new JScrollPane(campo);
	barra.setBounds(10, 10,200,100);
	
	
	formulario.add(barra);
	formulario.setVisible(true);
	
}
}

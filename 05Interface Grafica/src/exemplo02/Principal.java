package exemplo02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {
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
		//definir tamanho dos componetes do painel
		formulario.setLayout(null);
		// botao
		JButton botao =new JButton();
		botao.setText("enviar");
		
		//adicionaro botao no formulario
		formulario.add(botao);
		botao.setSize(100,20);
		botao.setBounds(200, 100,  100,30);
		//evento no botao
		botao.addActionListener(new ActionListener() {
			
			@Override
			//metedo que executa quando clicar no botao
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"olá mundo");
				
			}
		});
		
		
}
}

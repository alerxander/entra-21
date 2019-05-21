package exemplo03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {
public static void main(String[] args) {
	JFrame formulario = new JFrame();
	//define o tamnho do formulario
	formulario.setSize(500,300);
	//Sair e nao ficar em segundo plano
	formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//titulo no painel
	formulario.setTitle("Meu primeiro formulario");
	//centraliza o painel da abertura
	formulario.setLocationRelativeTo(null);
	//definir tamanho dos componetes do painel
	formulario.setLayout(null);

	// campo de botao
	JTextField campo = new JTextField();
	campo.setBounds(120,30,100, 30);
	
	//rotulo
	JLabel rotulo = new JLabel();
	rotulo.setText("informe seu nome");
	rotulo.setBounds(10, 30, 130, 30);
	// botao
	JButton botao =new JButton();
	botao.setText("enviar");
	
	
	//evento no botao
	botao.addActionListener(new ActionListener() {
		
		@Override
		//metedo que executa quando clicar no botao
		public void actionPerformed(ActionEvent e) {
			//armazenar o nome informado
			String nome = campo.getText();
			
			//mensagem
			JOptionPane.showMessageDialog(null, "Olá");
			
			//limpar campo nome
			campo.setText("");
			
			//cursor no campo pra digitar
			campo.requestFocus();
		}
	});
	//aparecer o formulario
		formulario.setVisible(true);
		//adicionaro botao no formulario
		formulario.add(botao);
		formulario.add(rotulo);
		formulario.add(campo);
		botao.setSize(100,20);
		botao.setBounds(230, 30,  100,30);
}
}

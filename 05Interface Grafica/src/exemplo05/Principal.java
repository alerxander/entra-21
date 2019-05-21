package exemplo05;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Principal {
public static void main(String[] args) {
	JFrame formulario = new JFrame();
	formulario.setSize(500,300);
	formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	formulario.setTitle("Meu primeiro formulario");
	formulario.setLocationRelativeTo(null);
	formulario.setLayout(null);
	
	// botões
	JButton botao =new JButton("Botao 1");
	botao.setBounds(50,10,150,30);
	
	JButton botao2 =new JButton("Botao 2");
	botao2.setBounds(200,10,150,30);
	
	//adicionar painel
	JPanel painel = new JPanel();
	painel.setBounds(25,50,350,150);
	//cor do painel
	painel.setBackground(Color.BLACK);
	
	JPanel painel2 = new JPanel();
	painel2.setBounds(25,50,350,150);
	painel2.setBackground(Color.WHITE);
	painel2.setVisible(false);
	
	//adicionando elementos ao painel
JButton botaop = new JButton("Clique aqui");
	botaop.setSize(150,30);
	painel2.add(botaop);
	
	//ações do botao
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				painel.setVisible(true);
				painel2.setVisible(false);
				
			}
		});
		
		botao2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				painel.setVisible(false);
				painel2.setVisible(true);
				
			}
		});
		
		botaop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

JOptionPane.showMessageDialog(null, "Pau mandado");
				
			}
		});
	
	formulario.add(botao);
	formulario.add(botao2);
	formulario.add(painel);
	formulario.add(painel2);
	formulario.setVisible(true);
	
}
}

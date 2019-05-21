package exemplo07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;



public class Principal {
public static void main(String[] args) {
	
	
	JFrame formulario = new JFrame();
	formulario.setSize(500,300);
	formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	formulario.setTitle("Meu primeiro formulario");
	formulario.setLocationRelativeTo(null);
	formulario.setLayout(null);
	
	JButton botao = new JButton("testar");
	botao.setBounds(10, 100, 100, 20);
	
	//radio buttton
	
	JRadioButton rtb1 = new JRadioButton("op��es 01");
	rtb1.setBounds(10, 10, 100, 20);
	rtb1.setActionCommand("primeiro bot�o");
	
	JRadioButton rtb2 = new JRadioButton("op��es 02");
	rtb2.setBounds(10, 40, 100, 20);
	rtb2.setActionCommand("segundo bot�o");
	
	JRadioButton rtb3 = new JRadioButton("op��es 03");
	rtb3.setBounds(10, 70, 100, 20);
	rtb3.setActionCommand("terceiro bot�o");
		
	
	
	//agrupar botoes de radio
	ButtonGroup  bg = new ButtonGroup();
	bg.add(rtb1);
	bg.add(rtb2);
	bg.add(rtb3);
	
	//a��o no botao
	
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			//try catch pr caso o usuario n�o selecine nenhuma das op��es
				
				try {
					//getSelection: obtem o radio button selecionado
					//getActionCommand : retorna um valor do radio button
					
					JOptionPane.showMessageDialog(null, bg.getSelection().getActionCommand());
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Favor selecionar uma op��o");
				}
			}
		});
	
	
	
	formulario.add(rtb1);
	formulario.add(rtb2);
	formulario.add(rtb3);
	formulario.add(botao);
	
	
	
	formulario.setVisible(true);
}
}

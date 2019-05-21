package exemplo06;

import javax.swing.JButton;
import javax.swing.JCheckBox;
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
		
		JButton botao = new JButton("concluir");
		botao.setSize(150,30);
		botao.setBounds(10, 100, 150, 30);
		
		//chekbox
		JCheckBox ckb1 = new JCheckBox("opçao 01");
		ckb1.setBounds(10,10,100,20);
		
		JCheckBox ckb2 = new JCheckBox("opçao 02");
		ckb2.setBounds(10,40,100,20);
		
		JCheckBox ckb3 = new JCheckBox("opçao 03");
		ckb3.setBounds(10,70,100,20);
		
		
		formulario.add(ckb1);
		formulario.add(ckb2);
		formulario.add(ckb3);
		formulario.add(botao);
		formulario.setVisible(true);
	}
}

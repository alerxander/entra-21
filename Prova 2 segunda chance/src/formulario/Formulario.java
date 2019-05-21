package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.Produto;
import dados.Dados;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtquantidadeExibida;
   Dados d = new Dados();
    Acao a = new Acao();
    Produto p1 =new Produto();
    Produto p2 =new Produto();
    Produto p3 =new Produto();
    Produto p4 =new Produto();
    Produto p5 =new Produto();
    Produto p6 =new Produto();
    Produto p7 =new Produto();
    Produto p8 =new Produto();
    
   
	
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel txtCamisa = new JLabel("Camisa");
		txtCamisa.setBounds(10, 23, 89, 14);
		contentPane.add(txtCamisa);
		
		JLabel txtCalca = new JLabel("Cal\u00E7a");
		txtCalca.setBounds(10, 93, 48, 14);
		contentPane.add(txtCalca);
		
		JLabel txttenis = new JLabel("Tenis");
		txttenis.setBounds(10, 159, 48, 14);
		contentPane.add(txttenis);
		
		JLabel txtChinelo = new JLabel("chinelo");
		txtChinelo.setBounds(10, 217, 48, 14);
		contentPane.add(txtChinelo);
		
		JLabel txtBune = new JLabel("bun\u00E9");
		txtBune.setBounds(208, 23, 89, 14);
		contentPane.add(txtBune);
		
		JLabel txtRelogio = new JLabel("relogio");
		txtRelogio.setBounds(208, 93, 89, 14);
		contentPane.add(txtRelogio);
		
		JLabel txtMeia = new JLabel("meia");
		txtMeia.setBounds(208, 159, 89, 14);
		contentPane.add(txtMeia);
		
		JLabel txtCelular = new JLabel("celular");
		txtCelular.setBounds(218, 217, 79, 14);
		contentPane.add(txtCelular);
		
		JButton btn1 = new JButton("+");
		btn1.setBounds(10, 48, 48, 23);
		contentPane.add(btn1);
		
		JButton btn3 = new JButton("+");
		btn3.setBounds(10, 125, 48, 23);
		contentPane.add(btn3);
		
		JButton btn5 = new JButton("+");
		btn5.setBounds(10, 183, 48, 23);
		contentPane.add(btn5);
		
		JButton btn7 = new JButton("+");
		btn7.setBounds(10, 242, 48, 23);
		contentPane.add(btn7);
		
		JButton btn9 = new JButton("+");
		btn9.setBounds(208, 48, 48, 23);
		contentPane.add(btn9);
		
		JButton btn11 = new JButton("+");
		btn11.setBounds(208, 118, 48, 23);
		contentPane.add(btn11);
		
		JButton btn13 = new JButton("+");
		btn13.setBounds(208, 183, 48, 23);
		contentPane.add(btn13);
		
		JButton btn15 = new JButton("+");
		btn15.setBounds(208, 242, 48, 23);
		contentPane.add(btn15);
		
		JButton btn2 = new JButton("-");
		btn2.setBounds(60, 48, 51, 23);
		contentPane.add(btn2);
		
		JButton btn4 = new JButton("-");
		btn4.setBounds(60, 125, 51, 23);
		contentPane.add(btn4);
		
		JButton btn6 = new JButton("-");
		btn6.setBounds(60, 183, 51, 23);
		contentPane.add(btn6);
		
		JButton btn8 = new JButton("-");
		btn8.setBounds(60, 242, 51, 23);
		contentPane.add(btn8);
		
		JButton btn16 = new JButton("-");
		btn16.setBounds(257, 242, 49, 23);
		contentPane.add(btn16);
		
		JButton btn14 = new JButton("-");
		btn14.setBounds(258, 183, 48, 23);
		contentPane.add(btn14);
		
		JButton btn12 = new JButton("-");
		btn12.setBounds(258, 118, 48, 23);
		contentPane.add(btn12);
		
		JButton btn10 = new JButton("-");
		btn10.setBounds(258, 48, 48, 23);
		contentPane.add(btn10);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(303, 23, 63, 14);
		contentPane.add(lblQuantidade);
		
		txtquantidadeExibida = new JTextField();
		txtquantidadeExibida.setEnabled(false);
		txtquantidadeExibida.setBounds(376, 20, 48, 20);
		contentPane.add(txtquantidadeExibida);
		txtquantidadeExibida.setColumns(10);
		
		 p1.setNome(txtCamisa.getText());
		 p2.setNome(txtCalca.getText());
		 p3.setNome(txttenis.getText());
		 p4.setNome(txtChinelo.getText());
		 p5.setNome(txtBune.getText());
		 p6.setNome(txtRelogio.getText());
		 p7.setNome(txtMeia.getText());
		 p8.setNome(txtCelular.getText());
		
		JButton btnEstatistica = new JButton("Estatistica");
		btnEstatistica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, a.exibir(p1, p2, p3, p4, p5, p6, p7, p8));
			}
		});
		btnEstatistica.setBounds(335, 64, 89, 23);
		contentPane.add(btnEstatistica);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				p1.setNome(txtCamisa.getText());
				a.somar(p1);
				
				 txtquantidadeExibida.setText(String.valueOf(a.somarQuantidade(p1, p2, p3, p4, p5, p6, p7, p8)));
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				a.subtrair(p1);
				 txtquantidadeExibida.setText(String.valueOf(a.somarQuantidade(p1, p2, p3, p4, p5, p6, p7, p8)));
			}
		});
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				
					a.somar(p2);
					 txtquantidadeExibida.setText(String.valueOf(a.somarQuantidade(p1, p2, p3, p4, p5, p6, p7, p8)));
			}
		});
btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				;
					a.subtrair(p2);
					 txtquantidadeExibida.setText(String.valueOf(a.somarQuantidade(p1, p2, p3, p4, p5, p6, p7, p8)));
			}
		});
btn5.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {

		
			a.somar(p3);
			 txtquantidadeExibida.setText(String.valueOf(a.somarQuantidade(p1, p2, p3, p4, p5, p6, p7, p8)));
	}
});
btn6.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {

		
			a.subtrair(p3);
			 txtquantidadeExibida.setText(String.valueOf(a.somarQuantidade(p1, p2, p3, p4, p5, p6, p7, p8)));
	}
});
btn7.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {

		
			a.somar(p4);
			 txtquantidadeExibida.setText(String.valueOf(a.somarQuantidade(p1, p2, p3, p4, p5, p6, p7, p8)));
	}
});
btn8.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {

		
			a.subtrair(p4);
			 txtquantidadeExibida.setText(String.valueOf(a.somarQuantidade(p1, p2, p3, p4, p5, p6, p7, p8)));
	}
});
btn9.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {

		
			a.somar(p5);
			 txtquantidadeExibida.setText(String.valueOf(a.somarQuantidade(p1, p2, p3, p4, p5, p6, p7, p8)));
	}
});
btn10.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {

		
			a.subtrair(p5);
			 txtquantidadeExibida.setText(String.valueOf(a.somarQuantidade(p1, p2, p3, p4, p5, p6, p7, p8)));
	}
});
btn11.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {

		
			a.somar(p6);
			 txtquantidadeExibida.setText(String.valueOf(a.somarQuantidade(p1, p2, p3, p4, p5, p6, p7, p8)));
	}
});
btn12.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {

		
			a.subtrair(p6);
			 txtquantidadeExibida.setText(String.valueOf(a.somarQuantidade(p1, p2, p3, p4, p5, p6, p7, p8)));
	}
});
btn13.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {

		
			a.somar(p7);
			 txtquantidadeExibida.setText(String.valueOf(a.somarQuantidade(p1, p2, p3, p4, p5, p6, p7, p8)));
	}
});btn14.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {

		
			a.subtrair(p7);
			 txtquantidadeExibida.setText(String.valueOf(a.somarQuantidade(p1, p2, p3, p4, p5, p6, p7, p8)));
	}
});
btn15.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {

		
			a.somar(p8);
			 txtquantidadeExibida.setText(String.valueOf(a.somarQuantidade(p1, p2, p3, p4, p5, p6, p7, p8)));
	}
});
btn16.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {

		
			a.subtrair(p8);
			 txtquantidadeExibida.setText(String.valueOf(a.somarQuantidade(p1, p2, p3, p4, p5, p6, p7, p8)));
	}
});
	}

}

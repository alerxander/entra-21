package modelo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Pergunta;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class TextSimulation extends JFrame {

	private JPanel contentPane;

	Pergunta p = new Pergunta();
	
	public TextSimulation() {
		
		p.pergunta();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbPergunta = new JLabel();
		lbPergunta.setText(p.questionario[0][p.numero]);
		lbPergunta.setBounds(80, 11, 327, 42);
		contentPane.add(lbPergunta);
		
		JButton btnA = new JButton("A");
		btnA.setBounds(10, 99, 39, 23);
		contentPane.add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.setBounds(10, 133, 39, 23);
		contentPane.add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(10, 167, 39, 23);
		contentPane.add(btnC);
		
		JButton btnD = new JButton("D");
		btnD.setBounds(10, 201, 39, 23);
		contentPane.add(btnD);
		
		JLabel lbAlternativaD = new JLabel();
		lbAlternativaD.setText(p.questionario[p.numeroR][p.numero]);
		lbAlternativaD.setBounds(59, 203, 327, 18);
		contentPane.add(lbAlternativaD);
		
		JLabel lbAlternativaC = new JLabel();
		lbAlternativaC.setText(p.questionario[p.numeroR][p.numero]);
		lbAlternativaC.setBounds(59, 169, 327, 18);
		contentPane.add(lbAlternativaC);
		
		JLabel lbAlternativaB = new JLabel();
		lbAlternativaB.setText(p.questionario[p.numeroR][p.numero]);
		lbAlternativaB.setBounds(59, 135, 327, 18);
		contentPane.add(lbAlternativaB);
		
		JLabel lbAlternativaA = new JLabel();
		lbAlternativaA.setText(p.questionario[p.numeroR][p.numero]);
		lbAlternativaA.setBounds(59, 101, 327, 18);
		contentPane.add(lbAlternativaA);
		
		JLabel lbNumeroQ = new JLabel("New label");
		lbNumeroQ.setBounds(1, 25, 48, 14);
		contentPane.add(lbNumeroQ);
	}
}

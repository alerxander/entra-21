package calculadora;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Estrutura {
	 String  n = "", n1 = "", n2 = "", n3 = "", n4 = "", n5 = "", n6 = "", n7 = "", n8 = "", n9 = "",n10="";
	 
	 double valor1=0,valor2=0;
	 double resultado = 0;
	String operacao="";
	 
	String num ="";
	String num2="";
	JTextField campo = new JTextField();

	public Estrutura() {

		JFrame frame = new JFrame();
		frame.setSize(300, 500);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(painel());
		frame.add(painel2());
		frame.setVisible(true);

	}

	private JPanel painel2() {
		JPanel p2 = new JPanel();
		p2.setBounds(1, 1, 270, 100);
		p2.setLayout(null);
		p2.setBorder(BorderFactory.createLineBorder(Color.GRAY));

		campo.setBounds(1, 1, 270, 100);

		p2.add(campo);
		p2.setVisible(true);

		return p2;
	}

	private JPanel painel() {

		painel2();
		JPanel p = new JPanel();
		p.setBounds(0, 100, 270, 360);
		p.setBorder(BorderFactory.createLineBorder(new Color(220, 230, 247)));
		p.setLayout(null);

		JButton bt1 = new JButton("0");
		bt1.setBackground(new Color(220, 230, 247));
		bt1.setBounds(90, 135, 90, 45);
		JButton bt2 = new JButton("1");
		bt2.setBackground(new Color(220, 230, 247));
		bt2.setBounds(1, 90, 90, 45);
		JButton bt3 = new JButton("2");
		bt3.setBackground(new Color(220, 230, 247));
		bt3.setBounds(90, 90, 90, 45);
		JButton bt4 = new JButton("3");
		bt4.setBackground(new Color(220, 230, 247));
		bt4.setBounds(180, 90, 90, 45);
		JButton bt5 = new JButton("4");
		bt5.setBackground(new Color(220, 230, 247));
		bt5.setBounds(1, 45, 90, 45);
		JButton bt6 = new JButton("5");
		bt6.setBackground(new Color(220, 230, 247));
		bt6.setBounds(90, 45, 90, 45);
		JButton bt7 = new JButton("6");
		bt7.setBackground(new Color(220, 230, 247));
		bt7.setBounds(180, 45, 90, 45);
		JButton bt8 = new JButton("7");
		bt8.setBackground(new Color(220, 230, 247));
		bt8.setBounds(1, 1, 90, 45);
		JButton bt9 = new JButton("8");
		bt9.setBackground(new Color(220, 230, 247));
		bt9.setBounds(90, 1, 90, 45);
		JButton bt10 = new JButton("9");
		bt10.setBackground(new Color(220, 230, 247));
		bt10.setBounds(180, 1, 90, 45);

		JButton functio11 = new JButton("³√");
		functio11.setBounds(90, 225, 90, 45);
		JButton functio1 = new JButton("√");
		functio1.setBounds(90, 180, 90, 45);
		JButton functio2 = new JButton("+");
		functio2.setBounds(180, 135, 90, 45);
		JButton functio3 = new JButton("-");
		functio3.setBounds(180, 180, 90, 45);
		JButton functio4 = new JButton("x");
		functio4.setBounds(180, 225, 90, 45);
		JButton functio5 = new JButton("÷");
		functio5.setBounds(180, 270, 90, 45);
		JButton functio6 = new JButton("Ce");
		functio6.setBounds(90, 270, 90, 45);
		JButton functio7 = new JButton("Sin");
		functio7.setBounds(1, 135, 90, 45);
		JButton functio8 = new JButton("cos");
		functio8.setBounds(1, 180, 90, 45);
		JButton functio9 = new JButton("tan");
		functio9.setBounds(1, 225, 90, 45);
		JButton functio10 = new JButton("log");
		functio10.setBounds(1, 270, 90, 45);

		functio2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				operacao= "+";
				campo.setText(valor1+operacao);

			}
		});
		functio3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				operacao= "-";

			}
		});
		functio4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				operacao= "x";

			}
		});

		functio5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				operacao= "/";

			}
		});

		functio6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				campo.setText("");
				

			}
		});

		functio7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if(!(valor1==0)) {
					operacao="sin";
				campo.setText(operacao+valor1+Math.sin(valor1)); ;
				
				}

			}
		});
		functio8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(!(valor1==0)) {
					operacao="cos";
					resultado = Math.cos(valor1);
				campo.setText( String.valueOf(resultado));
				
				}

			}
		});
		functio9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(!(valor1==0)) {
					operacao="tan";
					resultado = Math.tan(valor1);
				campo.setText( String.valueOf(resultado));
				}
			}
		});

		functio10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(!(valor1==0)) {
					operacao="log";
					resultado = Math.log(valor1);
				campo.setText( String.valueOf(resultado));
				}

			}
		});
		functio8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(!(valor1==0)) {
				resultado = Math.sqrt(valor1);
				campo.setText( String.valueOf(resultado));
				}
			}
		});

		functio11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(!(valor1==0)) {
				resultado = Math.cbrt(valor1);
				campo.setText( String.valueOf(resultado));
				}
			}
		});

		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(operacao.equals("")) {
					num+="0";
					valor1=Integer.parseInt(num);
					campo.setText(num);
				}else {
					num2+="0";
					valor2=Integer.parseInt(num2);
					campo.setText(num+num2);
				}
			}
		});

		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(operacao.equals("")) {
					num+="1";
					valor1=Integer.parseInt(num);
					campo.setText(num);
				}else {
					num2+=1;
					valor2=Integer.parseInt(num2);
					campo.setText(num2);
				}
				
			}
		});
		bt3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(operacao.equals("")) {
					num+="2";
					valor1=Integer.parseInt(num);
					campo.setText(num);
				}else {
					num2+="2";
					valor2=Integer.parseInt(num2);
					campo.setText(num2);
				}
			}
		});

		bt4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(operacao.equals("")) {
					num+="3";
					valor1=Integer.parseInt(num);
					campo.setText(num);
				}else {
					num2+="3";
					valor2=Integer.parseInt(num2);
					campo.setText(num2);
				}
			}
		});
		bt5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(operacao.equals("")) {
					num+="4";
					valor1=Integer.parseInt(num);
					campo.setText(num);
				}else {
					num2+="4";
					valor2=Integer.parseInt(num2);
					campo.setText(num2);
				}
			}
		});
		bt6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(operacao.equals("")) {
					num+="5";
					valor1=Integer.parseInt(num);
					campo.setText(num);
				}else {
					num2+="5";
					valor2=Integer.parseInt(num2);
					campo.setText(num2);
				}
			}
		});
		
		bt7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(operacao.equals("")) {
					num+="6";
					valor1=Integer.parseInt(num);
					campo.setText(num);
				}else {
					num2+="6";
					valor2=Integer.parseInt(num2);
					campo.setText(num2);
				}
			}
		});
		bt8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(operacao.equals("")) {
					num+="7";
					valor1=Integer.parseInt(num);
					campo.setText(num);
				}else {
					num2+="7";
					valor2=Integer.parseInt(num2);
					campo.setText(num2);
				}
			}
		});
		
		bt9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(operacao.equals("")) {
					num+="8";
					valor1=Integer.parseInt(num);
					campo.setText(num);
				}else {
					num2+="8";
					valor2=Integer.parseInt(num2);
					campo.setText(num2);
				}
			}
		});
		bt10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(operacao.equals("")) {
					num+="9";
					valor1=Integer.parseInt(num);
					campo.setText(num);
				}else {
					num2+="9";
					valor2=Integer.parseInt(num2);
					campo.setText(num2);
				}
			}
		});
		
		
		

		p.add(bt10);
		p.add(bt9);
		p.add(bt8);
		p.add(bt7);
		p.add(bt6);
		p.add(bt5);
		p.add(bt4);
		p.add(bt3);
		p.add(bt2);
		p.add(bt1);

		p.add(functio1);
		p.add(functio2);
		p.add(functio3);
		p.add(functio4);
		p.add(functio5);
		p.add(functio6);
		p.add(functio7);
		p.add(functio8);
		p.add(functio9);
		p.add(functio10);
		p.add(functio11);
		p.setVisible(true);

		return p;

	}

}

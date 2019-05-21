package formulario;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import modelo.Pessoa;

public class Formulario {

	//ArrayList de pessoas
	public static ArrayList<Pessoa> dadosPessoa =  new ArrayList<Pessoa>();
	
	//defauttablemodel
	DefaultTableModel dados =  new DefaultTableModel();
	
	
	
	
	//contrutor
	
	public Formulario() {
		
		JFrame f = new JFrame("Sistema Simples");
		f.setSize(335,500);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(ListarDados());
		f.add(CadastraDados());
		f.setVisible(true);
		
		
		
	}
	
	private JPanel CadastraDados() {
		JPanel p = new JPanel();
		p.setBounds(10,00,300,200);
		p.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		p.setLayout(null);
		
		JLabel lblnome = new JLabel("nome");
		lblnome.setBounds(10,10, 60,20);
		JLabel lblidade = new JLabel("idade");
		lblidade.setBounds(10, 90, 60, 20);
		JLabel lblcidade = new JLabel("cidade");
		lblcidade.setBounds(10, 50, 60, 20);
		
		
		JTextField txtnome = new JTextField();
		txtnome.setBounds(70, 10, 220, 20);
		JTextField txtidade = new JTextField();
		txtidade.setBounds(70, 50, 220, 20);
		JTextField txtcidade = new JTextField();
		txtcidade.setBounds(70, 90, 220, 20);
		
		JButton btncadastrar = new JButton("Cadastrar");
		btncadastrar.setBounds(80, 130, 150, 20);
		btncadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//obter os dados informados
				String nome = txtnome.getText();
				int idade =Integer.parseInt(txtidade.getText());
				String cidade = txtcidade.getText();
				
				Pessoa p = new Pessoa();
				p.setNome(nome);
				p.setIdade(idade);
				p.setCidade(cidade);
				
				//adicionar dados ao array
				dadosPessoa.add(p);
				
				//adicionar dados na tabela
				dados.addRow(new Object[] {nome,idade,cidade});
				
				
				//limpar os campos
				
				txtnome.setText("");
				txtidade.setText("");
				txtcidade.setText("");
				
				//cursor no campo nome selecionado
				txtnome.requestFocus();
				
				for (Pessoa pessoa : dadosPessoa) {
					System.out.println(p.getNome());
					
				}
			}
		});
		
		
		p.add(lblnome);
		p.add(lblcidade);
		p.add(lblidade);
		p.add(txtnome);
		p.add(txtcidade);
		p.add(txtidade);
		p.add(btncadastrar);
		
	
		return p;	
	}
	
	
	
	//listar dados
	private JPanel ListarDados() {
		
		 JPanel p = new JPanel();
			p.setBounds(10,240,300,200);
			p.setBorder(BorderFactory.createLineBorder(Color.GRAY));
			p.setLayout(null);
			JScrollPane barra = new JScrollPane(tabela());
			barra.setBounds(0,0,300,200);
			p.add(barra);
			return p;	
	}
	
	//tabela
	
	private JTable tabela () {
		
		//Dados
		
		dados.addColumn("nome");
		dados.addColumn("idade");
		dados.addColumn("cidade");
		dados.addRow(new Object[]{"carlos",46,"Blumenau"});
		dados.addRow(new Object[]{"Bianca",46,"Pomerode"});
		dados.addRow(new Object[]{"Leticia",46,"Joinvile"});
		
		
		JTable tabela = new JTable(dados);
		return  tabela;
		
	}
	
	
	
	
}

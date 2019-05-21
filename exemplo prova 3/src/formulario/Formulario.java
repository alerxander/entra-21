package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.Usuario;
import dados.Dados;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JTable table;

	static int numeroLinha = 0;

	public Formulario() {
		Acao a = new Acao();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 11, 48, 14);
		contentPane.add(lblNome);

		txtNome = new JTextField();
		txtNome.setBounds(73, 8, 121, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(10, 51, 48, 14);
		contentPane.add(lblIdade);

		txtIdade = new JTextField();
		txtIdade.setBounds(73, 48, 121, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);

		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(286, 11, 48, 14);
		contentPane.add(lblPeso);

		txtPeso = new JTextField();
		txtPeso.setBounds(356, 8, 96, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);

		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(298, 51, 48, 14);
		contentPane.add(lblAltura);

		txtAltura = new JTextField();
		txtAltura.setBounds(356, 48, 96, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(36, 100, 89, 23);
		contentPane.add(btnCadastrar);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(135, 100, 89, 23);
		contentPane.add(btnAlterar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(234, 100, 89, 23);
		contentPane.add(btnExcluir);

		JButton btnEstatistica = new JButton("Estatistica");
		btnEstatistica.setBounds(363, 100, 89, 23);
		contentPane.add(btnEstatistica);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 143, 466, 138);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {

				int i = table.getSelectedRow();

				numeroLinha = i;

				txtNome.setText(table.getValueAt(i, 0).toString());
				txtIdade.setText(table.getValueAt(i, 1).toString());
				txtAltura.setText(table.getValueAt(i, 2).toString());
				txtPeso.setText(table.getValueAt(i, 3).toString());
				txtPeso.setText(table.getValueAt(i, 4).toString());

				btnCadastrar.setEnabled(false);
				btnEstatistica.setEnabled(false);
				btnExcluir.setEnabled(true);

			}
		});
		table.setModel(a.Selecionar());
		scrollPane.setViewportView(table);
		
		
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				Usuario u = new Usuario();
				
				u.setNome(txtNome.getText());
				u.setIdade(Integer.parseInt(txtIdade.getText()));
				u.setAltura(Double.parseDouble(txtAltura.getText()));
				u.setPeso(Double.parseDouble(txtPeso.getText()));
				u.setIMC(a.CalculoImc(u.getPeso(), u.getAltura()));
				
				if(a.existe(u)==false) {
				Dados.listaUsuario.add(u);
				}else {
					JOptionPane.showMessageDialog(null, "Este usuario ja existe");
				}
				table.setModel(a.Selecionar());
				limparCampos();
			}
		});
		
		btnAlterar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				Usuario  u  = new Usuario();
				u.setNome(txtNome.getText());
				u.setIdade(Integer.parseInt(txtIdade.getText()));
				u.setAltura(Double.parseDouble(txtAltura.getText()));
				u.setPeso(Double.parseDouble(txtPeso.getText()));
				
				if(a.existe(u)==false) {
					a.alterar(numeroLinha, u);
					}else {
						JOptionPane.showMessageDialog(null, "este nome de usuario ja  existe tente alterar para outro");
					}
				table.setModel(a.Selecionar());
				limparCampos();
			}
		});
		
		btnExcluir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				a.excluir(numeroLinha);
				
				table.setModel(a.Selecionar());
				
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(false);
				btnEstatistica.setEnabled(false);
			}
		});
		
		
		
	}
	public void limparCampos() {
		txtAltura.setText("");
		txtNome.setText("");
		txtIdade.setText("");
		txtPeso.setText("");
	}
}

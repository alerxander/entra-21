package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.Curso;
import dados.Dados;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollBar;

public class formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtArea;
	private JTable table;
	private static int codigoCurso;

	private void limparCampos() {
		txtNome.setText("");
		txtArea.setText("");
	}

	public formulario() {

		Acao a = new Acao();
		Dados d = new Dados();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		lblNome.setBounds(32, 27, 48, 14);
		contentPane.add(lblNome);

		JLabel lblArea = new JLabel("Area");
		lblArea.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblArea.setBounds(32, 58, 48, 14);
		contentPane.add(lblArea);

		txtNome = new JTextField();
		txtNome.setBounds(75, 24, 175, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtArea = new JTextField();
		txtArea.setBounds(75, 55, 175, 20);
		contentPane.add(txtArea);
		txtArea.setColumns(10);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(10, 89, 89, 23);
		contentPane.add(btnCadastrar);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(109, 89, 89, 23);
		contentPane.add(btnAlterar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// remover curso
				a.excluir(codigoCurso);
				table.setModel(a.selecionar());

				limparCampos();
			}
		});
		btnExcluir.setEnabled(false);
		btnExcluir.setBounds(214, 89, 89, 23);
		contentPane.add(btnExcluir);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				limparCampos();

				btnCadastrar.setEnabled(true);
				btnCancelar.setEnabled(false);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
			}
		});
		btnCancelar.setEnabled(false);
		btnCancelar.setBounds(313, 89, 89, 23);
		contentPane.add(btnCancelar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 123, 386, 220);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {

				// obter indice da tabela
				int i = table.getSelectedRow();

				codigoCurso = i;

				txtNome.setText(table.getValueAt(i, 0).toString());
				txtArea.setText(table.getValueAt(i, 1).toString());

				btnCadastrar.setEnabled(false);
				btnCancelar.setEnabled(true);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(true);
			}
		});
		table.setModel(a.selecionar());
		scrollPane.setViewportView(table);

		JLabel lbl = new JLabel("New label");
		lbl.setBounds(10, 11, 48, 14);
		contentPane.add(lbl);

		btnCadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Curso c = new Curso();

				c.setAreaCurso(txtArea.getText());
				c.setNomeCurso(txtNome.getText());
				a.cadastrar(c);

				table.setModel(a.selecionar());

				limparCampos();

			}
		});

		btnAlterar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Curso c = new Curso();

				c.setAreaCurso(txtArea.getText());
				c.setNomeCurso(txtNome.getText());
				a.alterar(codigoCurso, c);

				table.setModel(a.selecionar());

				limparCampos();
				btnCadastrar.setEnabled(false);
				btnCancelar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(false);

			}
		});

	}
}

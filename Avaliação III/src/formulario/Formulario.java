package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dados.Dados;
import acao.Acao;
import beans.Beans;
import beans.Beans2;

import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtSalarioB;
	private JTextField txtNome;
	private JTextField txtVale;
	private JTextField txtImposto;
	private JTextField txtSlarioL;
	private JTable table;
	Beans2 o = new Beans2();
	Beans2 o2 = new Beans2();
	Beans2 o3 = new Beans2();
	Beans2 o4 = new Beans2();
	Beans2 o5 = new Beans2();
	Beans2 o6 = new Beans2();
	Beans2 o7 = new Beans2();
	Beans2 o8 = new Beans2();

	Acao a = new Acao();

	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblColaborador = new JLabel("Colaborador");
		lblColaborador.setBounds(10, 15, 67, 21);
		contentPane.add(lblColaborador);

		JLabel lblSalario = new JLabel("Salario Bruto");
		lblSalario.setBounds(2, 53, 75, 25);
		contentPane.add(lblSalario);

		JLabel lblValeTrasnporte = new JLabel("Vale Trasnporte");
		lblValeTrasnporte.setBounds(10, 115, 86, 14);
		contentPane.add(lblValeTrasnporte);

		JCheckBox simOUnao = new JCheckBox("n\u00E3o");
		simOUnao.setBounds(87, 111, 43, 23);
		contentPane.add(simOUnao);

		JSpinner faltas = new JSpinner();
		faltas.setBounds(106, 159, 50, 20);
		contentPane.add(faltas);

		JLabel lblFaltasNoMs = new JLabel("Faltas no m\u00EAs");
		lblFaltasNoMs.setBounds(10, 159, 86, 20);
		contentPane.add(lblFaltasNoMs);

		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setBounds(304, 18, 48, 14);
		contentPane.add(lblCargo);

		JCheckBox ClubeFidelidade = new JCheckBox("clube fidelidade");
		ClubeFidelidade.setBounds(304, 54, 112, 23);
		contentPane.add(ClubeFidelidade);

		JCheckBox PlanoDeSade = new JCheckBox("Plano de Sa\u00FAde");
		PlanoDeSade.setBounds(449, 54, 101, 23);
		contentPane.add(PlanoDeSade);

		JLabel lblNewLabel = new JLabel("Imposto de Renda");
		lblNewLabel.setBounds(304, 115, 95, 14);
		contentPane.add(lblNewLabel);

		JLabel lblSalarioLiquido = new JLabel("Salario liquido");
		lblSalarioLiquido.setBounds(315, 159, 77, 20);
		contentPane.add(lblSalarioLiquido);

		txtSalarioB = new JTextField();
		txtSalarioB.setEnabled(false);
		txtSalarioB.setBounds(87, 55, 188, 20);
		contentPane.add(txtSalarioB);
		txtSalarioB.setColumns(10);

		txtNome = new JTextField();
		txtNome.setBounds(87, 15, 188, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtVale = new JTextField();
		txtVale.setEnabled(false);
		txtVale.setBounds(136, 112, 139, 20);
		contentPane.add(txtVale);
		txtVale.setColumns(10);

		txtImposto = new JTextField();
		txtImposto.setEnabled(false);
		txtImposto.setBounds(409, 112, 141, 20);
		contentPane.add(txtImposto);
		txtImposto.setColumns(10);

		txtSlarioL = new JTextField();
		txtSlarioL.setEnabled(false);
		txtSlarioL.setBounds(409, 159, 141, 20);
		contentPane.add(txtSlarioL);
		txtSlarioL.setColumns(10);

		JButton btnCadastrar = new JButton("Cadastrar Colaborador");
		btnCadastrar.setBounds(10, 201, 146, 25);
		contentPane.add(btnCadastrar);

		JButton btnEstatistica = new JButton("Estatistica");
		btnEstatistica.setBounds(173, 201, 133, 25);
		contentPane.add(btnEstatistica);

		JComboBox comboBoxCargo = new JComboBox();

		comboBoxCargo.addItem("Estagiario");
		comboBoxCargo.addItem("Desenvolvedor Jr");
		comboBoxCargo.addItem("Desenvolvedor Pleno");
		comboBoxCargo.addItem("Desenvolvedor Senior");
		comboBoxCargo.addItem("Arquiteto de Software");
		comboBoxCargo.addItem("Analista de sistemas Jr");
		comboBoxCargo.addItem("Analista de sistemas Pleno");
		comboBoxCargo.addItem("Analista de sistemas Senior");

		comboBoxCargo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				if (comboBoxCargo.getSelectedItem().equals("Estagiario")) {
					txtSalarioB.setText("900");
				} else if (comboBoxCargo.getSelectedItem().equals("Desenvolvedor Jr")) {
					txtSalarioB.setText("1.300");
				} else if (comboBoxCargo.getSelectedItem().equals("Desenvolvedor Pleno")) {
					txtSalarioB.setText("1.800");
				} else if (comboBoxCargo.getSelectedItem().equals("Desenvolvedor Senior")) {
					txtSalarioB.setText("2.400");
				} else if (comboBoxCargo.getSelectedItem().equals("Analista de sistemas Jr")) {
					txtSalarioB.setText("2.700");
				} else if (comboBoxCargo.getSelectedItem().equals("Analista de sistemas Pleno")) {
					txtSalarioB.setText("3.200");
				} else if (comboBoxCargo.getSelectedItem().equals("Analista de sistemas Senior")) {
					txtSalarioB.setText("3.600");
				} else if (comboBoxCargo.getSelectedItem().equals("Arquiteto de Software")) {
					txtSalarioB.setText("4.400");
				}

			}
		});
		comboBoxCargo.setBounds(346, 14, 204, 22);
		contentPane.add(comboBoxCargo);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 237, 588, 185);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setModel(a.selecionar());
		scrollPane.setViewportView(table);

		btnCadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Beans b = new Beans();
				b.setColaborador(txtNome.getText());
				b.setCargo(comboBoxCargo.getName());
				b.setFidelidade(ClubeFidelidade.isSelected());
				b.setTransporte(simOUnao.isSelected());
				b.setSaude(PlanoDeSade.isSelected());
				b.setFaltas((int) faltas.getValue());
				b.setSalarioB(Double.parseDouble(txtSalarioB.getText()));
				System.out.println(b.getSalarioB());
				
				double liquido = a.calculoSl(b);
				b.setSalarioL(liquido);
				Dados.arrayColaboradores.add(b);
				table.setModel(a.selecionar());
				System.out.println(b.getSalarioB());
				System.out.println(liquido);
				System.out.println(b.isFidelidade());
				System.out.println(b.isSaude());
				System.out.println(b.getFaltas());
				

			}
		});

	}
}

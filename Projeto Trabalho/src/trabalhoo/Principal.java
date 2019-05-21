package trabalhoo;

import java.awt.Component;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Principal extends JFrame implements ActionListener {
	public JLabel horario = new JLabel();
	private javax.swing.Timer timer;

	public Principal() {

		super("horario");

		JLabel imagem = new JLabel();
		imagem.setSize(800, 500);
		ImageIcon caminho = new ImageIcon("C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
		Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(), Image.SCALE_SMOOTH);
		imagem.setIcon(new ImageIcon(img));
		imagem.setOpaque(true);
		add(imagem);
		add(horario);
		disparaRelogio();
		setVisible(true);
		setSize(500, 100);

		setLocationRelativeTo(null);

	}

	static String pegano = "";
	static int posicao = 0;
	static int posicao2 = 0;
	static int var1 = 29, var2 = 30, var3 = 31, var4 = 32, var5 = 33, var6 = 34, var7 = 35, var8 = 36, var9 = 37,
			var10 = 38, var11 = 39, var12 = 40, var13 = 41, var14 = 42, var15 = 43, var16 = 44, var17 = 45, var18 = 46,
			var19 = 47, var20 = 48, var21 = 49, var22 = 50, var23 = 51, var24 = 52, var25 = 53, var26 = 54, var27 = 55,
			var28 = 56, var29 = 57, var30 = 58, var31 = 59, posMes = 0, posLembrar = 0, posAno = 0;

	public static void main(String[] args) throws Exception {

		// vetores de cadastro
		String[] nomes = new String[100];
		String[] telefone = new String[100];
		String[] email = new String[100];
		String[] data_teste = new String[100];
		String[] Mes = { "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro",
				"outubro", "novembro", "Dezembro", "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho",
				"agosto", "setembro", "outubro", "novembro", "Dezembro", "janeiro", "fevereiro", "março", "abril",
				"maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "Dezembro" };
		String[] nome_lembrete = new String[1000];
		String[] lembrete = new String[1000];
		String[] data_lembrete = new String[1000];
		String[] ano = { "2019", "2020", "2021" };

		String[] dias = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
				"18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "1", "2", "3", "4",
				"5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22",
				"23", "24", "25", "26", "27", "28", "29", "30", "31", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27",
				"28", "29", "30", "31", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
				"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "1",
				"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
				"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "1", "2", "3", "4", "5", "6",
				"7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
				"25", "26", "27", "28", "29", "30", "31", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
				"13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29",
				"30", "31", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
				"18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "1", "2", "3", "4",
				"5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22",
				"23", "24", "25", "26", "27", "28", "29", "30", "31", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27",
				"28", "29", "30", "31", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
				"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "1",
				"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
				"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", // fim 2019
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
				"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "1", "2", "3", "4", "5", "6",
				"7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
				"25", "26", "27", "28", "29", "30", "31", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
				"13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29",
				"30", "31", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
				"18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "1", "2", "3", "4",
				"5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22",
				"23", "24", "25", "26", "27", "28", "29", "30", "31", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27",
				"28", "29", "30", "31", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
				"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "1",
				"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
				"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "1", "2", "3", "4", "5", "6",
				"7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
				"25", "26", "27", "28", "29", "30", "31", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
				"13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29",
				"30", "31", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
				"18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "1", "2", "3", "4",
				"5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22",
				"23", "24", "25", "26", "27", "28", "29", "30", "31", // fim 2020
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
				"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "1", "2", "3", "4", "5", "6",
				"7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
				"25", "26", "27", "28", "29", "30", "31", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
				"13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29",
				"30", "31", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
				"18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "1", "2", "3", "4",
				"5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22",
				"23", "24", "25", "26", "27", "28", "29", "30", "31", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27",
				"28", "29", "30", "31", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
				"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "1",
				"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
				"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "1", "2", "3", "4", "5", "6",
				"7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
				"25", "26", "27", "28", "29", "30", "31", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
				"13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29",
				"30", "31", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
				"18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "1", "2", "3", "4",
				"5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22",
				"23", "24", "25", "26", "27", "28", "29", "30", "31" };

		boolean verifica = false;
		// inicializando todas as posiçoes pra nao ser null
		for (int i = 0; i < 100; i++) {
			nomes[i] = "";
		}

		for (int i = 0; i < 1000; i++) {
			nome_lembrete[i] = "";
		}

		// criando primeira interação com usuario
		JFrame painel = new JFrame(" Bem vindo a Agenda");

		painel.setSize(800, 500);

		painel.setLayout(null);

		painel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		painel.setLocationRelativeTo(null);
		painel.setExtendedState(0);

		JMenu secundario = new JMenu("Configurações");
		JMenuItem hora = new JMenuItem("horas");
		secundario.add(hora);
		secundario.add(new JSeparator());
		JMenuItem hora2 = new JMenuItem("Ano");
		secundario.add(hora2);
		secundario.setAlignmentX(Component.RIGHT_ALIGNMENT);

		hora.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new Principal();

			}
		});

		JMenuBar bar = new JMenuBar();
		bar.add(secundario);
		painel.setJMenuBar(bar);

		JButton botao = new JButton("Pesquisar");
		botao.setBounds(225, 50, 300, 35);
		JButton botao2 = new JButton("Novo contado");
		botao2.setBounds(20, 110, 150, 30);
		JButton botao3 = new JButton("Lembretes");
		botao3.setBounds(20, 140, 150, 30);
		JButton botao4 = new JButton("Alterar contato");
		botao4.setBounds(20, 170, 150, 30);
		JButton botao5 = new JButton("Excluir contato");
		botao5.setBounds(20, 200, 150, 30);

		JButton proxAno = new JButton(">>");
		proxAno.setBounds(100, 70, 50, 30);
		JButton voltAno = new JButton("<<");
		voltAno.setBounds(50, 70, 50, 30);

		JLabel Ano = new JLabel();
		Ano.setText(ano[posAno]);
		Ano.setBounds(90, 30, 100, 45);
		pegano = ano[posAno];

		JLabel nowDate = new JLabel();
		LocalDateTime data = LocalDateTime.now();
		nowDate.setBounds(600, 140, 100, 30);
		DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("dd/MM/" + pegano);
		nowDate.setText(data.format(dataFormat));

		proxAno.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (posAno < 2) {
					posAno++;
					Ano.setText(ano[posAno]);
					pegano = ano[posAno];
				}

			}
		});

		voltAno.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (posAno > 0) {
					posAno--;
					Ano.setText(ano[posAno]);
				}
			}
		});

		// fazer painel

		// comando para cadastrar novo contato
		botao2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame cadastro = new JFrame("Cadastro");
				cadastro.setSize(300, 250);
				cadastro.setLayout(null);
				cadastro.setLocationRelativeTo(null);

				// campo
				JTextField campo = new JTextField();
				campo.setBounds(135, 10, 100, 30);
				campo.requestFocus();
				JTextField campo2 = new JTextField();
				campo2.setBounds(135, 40, 100, 30);
				JTextField campo3 = new JTextField();
				campo3.setBounds(135, 70, 100, 30);
				JTextField campo4 = new JTextField();
				campo4.setBounds(135, 100, 100, 30);
				LocalDateTime data = LocalDateTime.now();
				DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				campo4.setText(data.format(dataFormat));

				// rotulo
				JLabel rotulo = new JLabel("Nome :");
				rotulo.setBounds(10, 10, 130, 30);
				JLabel rotulo2 = new JLabel("Telefone :");
				rotulo2.setBounds(10, 40, 130, 30);
				JLabel rotulo3 = new JLabel("E-mail :");
				rotulo3.setBounds(10, 70, 130, 30);

				JLabel rotulo4 = new JLabel("Data de nascimento:");
				rotulo4.setBounds(10, 100, 130, 30);

				// botao
				JButton btao = new JButton("Salvar");
				btao.setBounds(95, 150, 100, 30);

				// botao salvar as informações
				btao.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String recebendo = campo.getText();

						nomes[posicao] = recebendo;
						telefone[posicao] = campo2.getText();
						email[posicao] = campo3.getText();
						String recebe = String.valueOf(campo4.getText());
						data_teste[posicao] = recebe;
						posicao++;

						cadastro.setVisible(false);

					}

				});

				cadastro.add(rotulo);
				cadastro.add(rotulo2);
				cadastro.add(rotulo3);
				cadastro.add(rotulo4);

				cadastro.add(campo);
				cadastro.add(campo2);
				cadastro.add(campo3);
				cadastro.add(campo4);
				cadastro.add(btao);

				JLabel imagem = new JLabel();
				imagem.setSize(800, 500);
				ImageIcon caminho = new ImageIcon("C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
				Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
						Image.SCALE_SMOOTH);
				imagem.setIcon(new ImageIcon(img));
				imagem.setOpaque(true);
				cadastro.add(imagem);

				cadastro.setVisible(true);

			}
		});

		// comando de pesquisa
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame pesquisa = new JFrame("pagina de Busca");
				pesquisa.setSize(250, 200);
				pesquisa.setLayout(null);
				pesquisa.setLocationRelativeTo(null);

				// campo2
				JTextField campesquisa = new JTextField();
				campesquisa.setBounds(70, 10, 130, 30);
				campesquisa.requestFocus();

				// rotulo2
				JLabel nomePesquisa = new JLabel("Nome :");
				nomePesquisa.setBounds(10, 10, 130, 30);

				JButton botaoPes = new JButton("encontra...");
				botaoPes.setBounds(50, 50, 130, 30);
				// metodo para pesquisar
				botaoPes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						String encontraNome = campesquisa.getText();
						String mensagem = "";
						boolean verifica = false;
						int i2 = 0;

						for (i2 = 0; i2 < 100; i2++) {

							if (encontraNome.equals(nomes[i2])) {

								mensagem = nomes[i2] + "\n" + telefone[i2] + "\n" + email[i2] + "\n" + data_teste[i2];
								verifica = true;
							}

						}
						if (verifica == true) {
							JOptionPane.showMessageDialog(null, mensagem);

						} else {
							JOptionPane.showMessageDialog(null, "nome nao encontrado");
						}
						pesquisa.setVisible(false);
					}
				});

				pesquisa.add(nomePesquisa);
				pesquisa.add(campesquisa);
				pesquisa.add(botaoPes);
				pesquisa.setVisible(true);

				JLabel imagem = new JLabel();
				imagem.setSize(800, 500);
				ImageIcon caminho = new ImageIcon("C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
				Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
						Image.SCALE_SMOOTH);
				imagem.setIcon(new ImageIcon(img));
				imagem.setOpaque(true);
				pesquisa.add(imagem);

			}
		});
		// criando interação de lembretes
		botao3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// painel lembretes
				JFrame lembretes = new JFrame("Eventos");
				lembretes.setSize(300, 200);
				lembretes.setLayout(null);
				lembretes.setLocationRelativeTo(null);

				// botões da pagina lembretes
				JButton botao = new JButton("pesquisar lembrete");
				botao.setBounds(10, 10, 150, 30);
				JButton botao2 = new JButton("alterar lembrete");
				botao2.setBounds(10, 50, 150, 30);
				JButton botao3 = new JButton("excluir lembrete");
				botao3.setBounds(10, 90, 150, 30);
				JButton botao4 = new JButton("mês");
				botao4.setBounds(200, 1, 60, 30);
				// ao clicar no "..." mostra em que dia da semana cai o dia do mes
				botao4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						JFrame calendario = new JFrame("calendario");
						calendario.setSize(375, 290);
						calendario.setLayout(null);
						calendario.setLocationRelativeTo(null);

						JButton proximo = new JButton(">>");
						proximo.setBounds(185, 200, 50, 30);
						JButton voltar = new JButton("<<");
						voltar.setBounds(140, 200, 50, 30);
						JLabel mess = new JLabel();
						mess.setText(Mes[posMes]);
						mess.setBounds(160, 180, 100, 30);

						JLabel segunda = new JLabel("dom");

						segunda.setBounds(1, 1, 30, 30);
						JLabel terca = new JLabel("seg");

						terca.setBounds(50, 1, 30, 30);
						JLabel quarta = new JLabel("ter");

						quarta.setBounds(100, 1, 30, 30);
						JLabel quinta = new JLabel("quar");

						quinta.setBounds(150, 1, 30, 30);
						JLabel sexta = new JLabel("quin");

						sexta.setBounds(200, 1, 30, 30);
						JLabel sabado = new JLabel("sex");

						sabado.setBounds(250, 1, 30, 30);
						JLabel domingo = new JLabel("sab");

						domingo.setBounds(300, 1, 30, 30);

						JButton dia1 = new JButton();
						dia1.setText(dias[var1]);
						dia1.setBounds(1, 25, 50, 30);

						JButton dia2 = new JButton("2");
						dia2.setText(dias[var2]);
						dia2.setBounds(50, 25, 50, 30);

						JButton dia3 = new JButton("3");
						dia3.setText(dias[var3]);
						dia3.setBounds(100, 25, 50, 30);
						JButton dia4 = new JButton("4");
						dia4.setText(dias[var4]);
						dia4.setBounds(150, 25, 50, 30);
						JButton dia5 = new JButton("5");
						dia5.setText(dias[var5]);
						dia5.setBounds(200, 25, 50, 30);
						JButton dia6 = new JButton("6");
						dia6.setText(dias[var6]);
						dia6.setBounds(250, 25, 50, 30);
						JButton dia7 = new JButton("7");
						dia7.setText(dias[var7]);
						dia7.setBounds(300, 25, 50, 30);

						JButton dia8 = new JButton("8");
						dia8.setText(dias[var8]);
						dia8.setBounds(1, 55, 50, 30);
						JButton dia9 = new JButton("9");
						dia9.setText(dias[var9]);
						dia9.setBounds(50, 55, 50, 30);
						JButton dia10 = new JButton("10");
						dia10.setText(dias[var10]);
						dia10.setBounds(100, 55, 50, 30);
						JButton dia11 = new JButton("11");
						dia11.setText(dias[var11]);
						dia11.setBounds(150, 55, 50, 30);
						JButton dia12 = new JButton("12");
						dia12.setText(dias[var12]);
						dia12.setBounds(200, 55, 50, 30);
						JButton dia13 = new JButton("13");
						dia13.setText(dias[var13]);
						dia13.setBounds(250, 55, 50, 30);
						JButton dia14 = new JButton("14");
						dia14.setText(dias[var14]);
						dia14.setBounds(300, 55, 50, 30);

						JButton dia15 = new JButton("15");
						dia15.setText(dias[var15]);
						dia15.setBounds(1, 85, 50, 30);
						JButton dia16 = new JButton("16");
						dia16.setText(dias[var16]);
						dia16.setBounds(50, 85, 50, 30);
						JButton dia17 = new JButton("17");
						dia17.setText(dias[var17]);
						dia17.setBounds(100, 85, 50, 30);
						JButton dia18 = new JButton("18");
						dia18.setText(dias[var18]);
						dia18.setBounds(150, 85, 50, 30);
						JButton dia19 = new JButton("19");
						dia19.setText(dias[var19]);
						dia19.setBounds(200, 85, 50, 30);
						JButton dia20 = new JButton("20");
						dia20.setText(dias[var20]);
						dia20.setBounds(250, 85, 50, 30);
						JButton dia21 = new JButton("21");
						dia21.setText(dias[var21]);
						dia21.setBounds(300, 85, 50, 30);

						JButton dia22 = new JButton("22");
						dia22.setText(dias[var22]);
						dia22.setBounds(1, 115, 50, 30);
						JButton dia23 = new JButton("23");
						dia23.setText(dias[var23]);
						dia23.setBounds(50, 115, 50, 30);
						JButton dia24 = new JButton("24");
						dia24.setText(dias[var24]);
						dia24.setBounds(100, 115, 50, 30);
						JButton dia25 = new JButton("25");
						dia25.setText(dias[var25]);
						dia25.setBounds(150, 115, 50, 30);
						JButton dia26 = new JButton("26");
						dia26.setText(dias[var26]);
						dia26.setBounds(200, 115, 50, 30);
						JButton dia27 = new JButton("27");
						dia27.setText(dias[var27]);
						dia27.setBounds(250, 115, 50, 30);
						JButton dia28 = new JButton("28");
						dia28.setText(dias[var28]);
						dia28.setBounds(300, 115, 50, 30);

						JButton dia29 = new JButton("29");
						dia29.setText(dias[var29]);
						dia29.setBounds(1, 145, 50, 30);
						JButton dia30 = new JButton("30");
						dia30.setText(dias[var30]);
						dia30.setBounds(50, 145, 50, 30);
						JButton dia31 = new JButton("31");
						dia31.setText(dias[var31]);
						dia31.setBounds(100, 145, 50, 30);

						dia1.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(new Rectangle(70, 40, 130, 80));
								rascunho1.setLineWrap(true);
								JScrollPane sc = new JScrollPane(rascunho1);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);

								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										String pega = texto.getText();
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(pega)) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});

						dia2.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(new Rectangle(70, 40, 130, 80));
								rascunho1.setLineWrap(true);
								new JScrollPane(rascunho1);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);

								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});

						dia3.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(new Rectangle(70, 40, 130, 80));
								rascunho1.setLineWrap(true);
								new JScrollPane(rascunho1);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);

								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});

						dia4.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);
								JScrollPane sc = new JScrollPane(rascunho1);
								rascunho1.add(sc);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);

								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});
						dia5.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);
								JScrollPane sc = new JScrollPane(rascunho1);
								rascunho1.add(sc);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);

								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});
						dia6.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);
								JScrollPane sc = new JScrollPane(rascunho1);
								rascunho1.add(sc);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);

								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});
						dia7.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);
								JScrollPane sc = new JScrollPane(rascunho1);
								rascunho1.add(sc);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);

								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});
						dia8.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);
								JScrollPane sc = new JScrollPane(rascunho1);
								rascunho1.add(sc);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);

								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});
						dia9.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);
								JScrollPane sc = new JScrollPane(rascunho1);
								rascunho1.add(sc);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);

								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});
						dia10.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);
								JScrollPane sc = new JScrollPane(rascunho1);
								rascunho1.add(sc);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);

								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});

						dia11.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);
								JScrollPane sc = new JScrollPane(rascunho1);
								rascunho1.add(sc);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);

								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});

						dia12.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);
								JScrollPane sc = new JScrollPane(rascunho1);
								rascunho1.add(sc);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);

								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});

						dia13.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);
								JScrollPane sc = new JScrollPane(rascunho1);
								rascunho1.add(sc);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);

								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});

						dia14.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);
								JScrollPane sc = new JScrollPane(rascunho1);
								rascunho1.add(sc);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);

								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});
						dia15.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);
								JScrollPane sc = new JScrollPane(rascunho1);
								rascunho1.add(sc);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);

								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});
						dia16.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);
								JScrollPane sc = new JScrollPane(rascunho1);
								rascunho1.add(sc);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);

								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});

						dia17.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);
								JScrollPane sc = new JScrollPane(rascunho1);
								rascunho1.add(sc);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);

								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});
						dia18.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);
								JScrollPane sc = new JScrollPane(rascunho1);
								rascunho1.add(sc);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);

								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});
						dia19.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);
								JScrollPane sc = new JScrollPane(rascunho1);
								rascunho1.add(sc);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);

								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);
								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});
						dia20.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);
								JScrollPane sc = new JScrollPane(rascunho1);
								rascunho1.add(sc);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);

								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});
						dia21.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);
								JScrollPane sc = new JScrollPane(rascunho1);
								rascunho1.add(sc);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);

								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);
								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});
						dia22.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);
								JScrollPane sc = new JScrollPane(rascunho1);
								rascunho1.add(sc);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);

								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});
						dia23.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);
								JScrollPane sc = new JScrollPane(rascunho1);
								rascunho1.add(sc);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);
								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});

						dia24.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);
								JScrollPane sc = new JScrollPane(rascunho1);
								rascunho1.add(sc);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);

								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});

						dia25.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);
								JScrollPane sc = new JScrollPane(rascunho1);
								rascunho1.add(sc);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);

								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});

						dia26.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);
								JScrollPane sc = new JScrollPane(rascunho1);
								rascunho1.add(sc);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);

								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});
						dia27.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);
								JScrollPane sc = new JScrollPane(rascunho1);
								rascunho1.add(sc);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);

								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});
						dia28.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);

								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});

						dia29.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);
								JScrollPane sc = new JScrollPane(rascunho1);
								rascunho1.add(sc);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);

								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});
						dia30.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);
								JScrollPane sc = new JScrollPane(rascunho1);
								rascunho1.add(sc);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);

								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);
								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});
						dia31.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame rascunho = new JFrame("lembrete");
								rascunho.setSize(250, 200);
								rascunho.setLayout(null);
								rascunho.setLocationRelativeTo(null);

								// campo2
								JTextField texto = new JTextField();
								texto.setBounds(70, 10, 130, 30);
								texto.requestFocus();

								// rotulo2
								JLabel texto1 = new JLabel("Nome :");
								texto1.setBounds(10, 10, 130, 30);

								// campo2
								JTextArea rascunho1 = new JTextArea("Assunto");
								rascunho1.setBounds(70, 40, 130, 80);
								JScrollPane sc = new JScrollPane(rascunho1);
								rascunho1.add(sc);

								// rotulo2
								JLabel rascunho2 = new JLabel("Evento:");
								rascunho2.setBounds(10, 50, 130, 30);

								JButton salve = new JButton("salvar");
								salve.setBounds(70, 120, 130, 30);

								rascunho.add(texto);
								rascunho.add(texto1);
								rascunho.add(rascunho1);
								rascunho.add(rascunho2);
								rascunho.add(salve);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								rascunho.add(imagem);

								rascunho.setVisible(true);
								salve.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										boolean existe = false;
										for (int i = 0; i < 1000; i++) {
											if (nome_lembrete[i].equals(texto.getText())) {
												existe = true;
												JOptionPane.showMessageDialog(null,
														"ja existe lembrete com esse nome,tente outro");
											}
										}

										if (existe == false) {
											lembrete[posLembrar] = rascunho1.getText();
											nome_lembrete[posLembrar] = texto.getText();
											posLembrar++;

											rascunho.setVisible(false);
										}
									}
								});

							}
						});
						proximo.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								if (posMes < 35) {
									var1 += 30;
									dia1.setText(dias[var1]);
									var2 += 30;
									dia2.setText(dias[var2]);
									var3 += 30;
									dia3.setText(dias[var3]);
									var4 += 30;
									dia4.setText(dias[var4]);
									var5 += 30;
									dia5.setText(dias[var5]);
									var6 += 30;
									dia6.setText(dias[var6]);
									var7 += 30;
									dia7.setText(dias[var7]);
									var8 += 30;
									dia8.setText(dias[var8]);
									var9 += 30;
									dia9.setText(dias[var9]);
									var10 += 30;
									dia10.setText(dias[var10]);
									var11 += 30;
									dia11.setText(dias[var11]);
									var12 += 30;
									dia12.setText(dias[var12]);
									var13 += 30;
									dia13.setText(dias[var13]);
									var14 += 30;
									dia14.setText(dias[var14]);
									var15 += 30;
									dia15.setText(dias[var15]);
									var16 += 30;
									dia16.setText(dias[var16]);
									var17 += 30;
									dia17.setText(dias[var17]);
									var18 += 30;
									dia18.setText(dias[var18]);
									var19 += 30;
									dia19.setText(dias[var19]);
									var20 += 30;
									dia20.setText(dias[var20]);
									var21 += 30;
									dia21.setText(dias[var21]);
									var22 += 30;
									dia22.setText(dias[var22]);
									var23 += 30;
									dia23.setText(dias[var23]);
									var24 += 30;
									dia24.setText(dias[var24]);
									var25 += 30;
									dia25.setText(dias[var25]);
									var26 += 30;
									dia26.setText(dias[var26]);
									var27 += 30;
									dia27.setText(dias[var27]);
									var28 += 30;
									dia28.setText(dias[var28]);
									var29 += 30;
									dia29.setText(dias[var29]);
									var30 += 30;
									dia30.setText(dias[var30]);
									var31 += 30;
									dia31.setText(dias[var31]);
									posMes++;
									mess.setText(Mes[posMes]);
									System.out.println(posMes);
								}

							}
						});
						voltar.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								if (posMes >= 1) {
									var1 -= 30;
									dia1.setText(dias[var1]);
									var2 -= 30;
									dia2.setText(dias[var2]);
									var3 -= 30;
									dia3.setText(dias[var3]);
									var4 -= 30;
									dia4.setText(dias[var4]);
									var5 -= 30;
									dia5.setText(dias[var5]);
									var6 -= 30;
									dia6.setText(dias[var6]);
									var7 -= 30;
									dia7.setText(dias[var7]);
									var8 -= 30;
									dia8.setText(dias[var8]);
									var9 -= 30;
									dia9.setText(dias[var9]);
									var10 -= 30;
									dia10.setText(dias[var10]);
									var11 -= 30;
									dia11.setText(dias[var11]);
									var12 -= 30;
									dia12.setText(dias[var12]);
									var13 -= 30;
									dia13.setText(dias[var13]);
									var14 -= 30;
									dia14.setText(dias[var14]);
									var15 -= 30;
									dia15.setText(dias[var15]);
									var16 -= 30;
									dia16.setText(dias[var16]);
									var17 -= 30;
									dia17.setText(dias[var17]);
									var18 -= 30;
									dia18.setText(dias[var18]);
									var19 -= 30;
									dia19.setText(dias[var19]);
									var20 -= 30;
									dia20.setText(dias[var20]);
									var21 -= 30;
									dia21.setText(dias[var21]);
									var22 -= 30;
									dia22.setText(dias[var22]);
									var23 -= 30;
									dia23.setText(dias[var23]);
									var24 -= 30;
									dia24.setText(dias[var24]);
									var25 -= 30;
									dia25.setText(dias[var25]);
									var26 -= 30;
									dia26.setText(dias[var26]);
									var27 -= 30;
									dia27.setText(dias[var27]);
									var28 -= 30;
									dia28.setText(dias[var28]);
									var29 -= 30;
									dia29.setText(dias[var29]);
									var30 -= 30;
									dia30.setText(dias[var30]);
									var31 -= 30;
									dia31.setText(dias[var31]);

									posMes--;
									mess.setText(Mes[posMes]);
									System.out.println("-" + posMes);

								}

							}
						});

						calendario.add(segunda);
						calendario.add(terca);
						calendario.add(quarta);
						calendario.add(quinta);
						calendario.add(sexta);
						calendario.add(sabado);
						calendario.add(domingo);
						calendario.add(dia1);
						calendario.add(dia2);
						calendario.add(dia3);
						calendario.add(dia4);
						calendario.add(dia5);
						calendario.add(dia6);
						calendario.add(dia7);
						calendario.add(dia8);
						calendario.add(dia9);
						calendario.add(dia10);
						calendario.add(dia11);
						calendario.add(dia12);
						calendario.add(dia13);
						calendario.add(dia14);
						calendario.add(dia15);
						calendario.add(dia16);
						calendario.add(dia17);
						calendario.add(dia18);
						calendario.add(dia19);
						calendario.add(dia20);
						calendario.add(dia21);
						calendario.add(dia22);
						calendario.add(dia23);
						calendario.add(dia24);
						calendario.add(dia25);
						calendario.add(dia26);
						calendario.add(dia27);
						calendario.add(dia28);
						calendario.add(dia29);
						calendario.add(dia30);
						calendario.add(dia31);
						calendario.add(proximo);
						calendario.add(voltar);
						calendario.add(mess);
						JLabel imagem = new JLabel();
						imagem.setSize(800, 500);
						ImageIcon caminho = new ImageIcon(
								"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
						Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
								Image.SCALE_SMOOTH);
						imagem.setIcon(new ImageIcon(img));
						imagem.setOpaque(true);
						calendario.add(imagem);

						calendario.setVisible(true);

					}
				});

				// painel com mais informaçoes

				botao.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						JFrame pesquisa = new JFrame("pagina de Busca");
						pesquisa.setSize(250, 200);
						pesquisa.setLayout(null);
						pesquisa.setLocationRelativeTo(null);

						// campo2
						JTextField campesquisa = new JTextField();
						campesquisa.setBounds(70, 10, 130, 30);
						campesquisa.requestFocus();

						// rotulo2
						JLabel nomePesquisa = new JLabel("Nome :");
						nomePesquisa.setBounds(10, 10, 130, 30);

						JButton botaoPes = new JButton("encontra...");
						botaoPes.setBounds(50, 50, 130, 30);
						// metodo para pesquisar
						botaoPes.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {

								String encontraNome = campesquisa.getText();
								String mensagem = "";
								boolean verifica = false;
								int i2 = 0;

								for (i2 = 0; i2 < 100; i2++) {

									if (nome_lembrete[i2].equals(encontraNome)) {

										mensagem = lembrete[i2];
										verifica = true;
									}

								}
								if (verifica == true) {
									JOptionPane.showMessageDialog(null, mensagem);

								} else {
									JOptionPane.showMessageDialog(null, "nome nao encontrado");
								}
								pesquisa.setVisible(false);
							}
						});

						pesquisa.add(nomePesquisa);
						pesquisa.add(campesquisa);
						pesquisa.add(botaoPes);
						JLabel imagem = new JLabel();
						imagem.setSize(800, 500);
						ImageIcon caminho = new ImageIcon(
								"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
						Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
								Image.SCALE_SMOOTH);
						imagem.setIcon(new ImageIcon(img));
						imagem.setOpaque(true);
						pesquisa.add(imagem);
						pesquisa.setVisible(true);

					}
				});
//						alterar lembrete
				botao2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						JFrame pesquisa = new JFrame("pagina de Busca");
						pesquisa.setSize(250, 200);
						pesquisa.setLayout(null);
						pesquisa.setLocationRelativeTo(null);

						// campo2
						JTextField campesquisa = new JTextField();
						campesquisa.setBounds(70, 10, 130, 30);
						campesquisa.requestFocus();

						// rotulo2
						JLabel nomePesquisa = new JLabel("Nome :");
						nomePesquisa.setBounds(10, 10, 130, 30);

						JButton botaoPes = new JButton("encontra...");
						botaoPes.setBounds(50, 50, 130, 30);
						// metodo para pesquisar
						botaoPes.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {

								String encontraNome = campesquisa.getText();
								String mensagem = "";
								boolean verifica = false;
								int i2 = 0;

								for (i2 = 0; i2 < 100; i2++) {

									if (nome_lembrete[i2].equals(encontraNome)) {

										mensagem = lembrete[i2] + "\n";
										verifica = true;
									}

								}
								if (verifica == true) {

									int confirma = JOptionPane.showConfirmDialog(null,
											mensagem + "deseja realmente alterar esse lembrete");

									if (confirma == 0) {

										JFrame rascunho = new JFrame("lembrete");
										rascunho.setSize(250, 200);
										rascunho.setLayout(null);
										rascunho.setLocationRelativeTo(null);

										// campo2
										JTextField texto = new JTextField();
										texto.setBounds(70, 10, 130, 30);
										texto.requestFocus();

										// rotulo2
										JLabel texto1 = new JLabel("Nome :");
										texto1.setBounds(10, 10, 130, 30);

										// campo2
										JTextArea rascunho1 = new JTextArea("Assunto");
										rascunho1.setBounds(70, 40, 130, 80);
										JScrollPane sc = new JScrollPane(rascunho1);

										// rotulo2
										JLabel rascunho2 = new JLabel("Evento:");
										rascunho2.setBounds(10, 50, 130, 30);

										JButton salve = new JButton("salvar");
										salve.setBounds(70, 120, 130, 30);

										rascunho.add(texto);
										rascunho.add(texto1);
										rascunho.add(rascunho1);
										rascunho.add(rascunho2);
										rascunho.add(salve);
										JLabel imagem = new JLabel();
										imagem.setSize(800, 500);
										ImageIcon caminho = new ImageIcon(
												"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
										Image img = caminho.getImage().getScaledInstance(imagem.getWidth(),
												imagem.getHeight(), Image.SCALE_SMOOTH);
										imagem.setIcon(new ImageIcon(img));
										imagem.setOpaque(true);
										rascunho.add(imagem);

										rascunho.setVisible(true);
										salve.addActionListener(new ActionListener() {

											@Override
											public void actionPerformed(ActionEvent e) {
												boolean existe = false;
												for (int i = 0; i < 1000; i++) {
													if (nome_lembrete[i].equals(texto.getText())) {
														existe = true;
														JOptionPane.showMessageDialog(null,
																"ja existe lembrete com esse nome,tente outro");
													}
												}

												if (existe == false) {
													lembrete[posLembrar] = rascunho1.getText();
													nome_lembrete[posLembrar] = texto.getText();
													posLembrar++;

													rascunho.setVisible(false);
												}
											}
										});

									}

								} else {
									JOptionPane.showMessageDialog(null, "nome nao encontrado");
								}
								pesquisa.setVisible(false);

							}
						});
						pesquisa.add(nomePesquisa);
						pesquisa.add(campesquisa);
						pesquisa.add(botaoPes);
						JLabel imagem = new JLabel();
						imagem.setSize(800, 500);
						ImageIcon caminho = new ImageIcon(
								"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
						Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
								Image.SCALE_SMOOTH);
						imagem.setIcon(new ImageIcon(img));
						imagem.setOpaque(true);
						pesquisa.add(imagem);
						pesquisa.setVisible(true);

					}
				});
				// excluir lembrete
				botao3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						JFrame pesquisaex = new JFrame("pagina de Busca");
						pesquisaex.setSize(250, 200);
						pesquisaex.setLayout(null);
						pesquisaex.setLocationRelativeTo(null);

						// campo2
						JTextField campesquisaex = new JTextField();
						campesquisaex.setBounds(70, 10, 130, 30);
						campesquisaex.requestFocus();

						// rotulo2
						JLabel nomePesquisaex = new JLabel("Nome :");
						nomePesquisaex.setBounds(10, 10, 130, 30);

						JButton botaoPesex = new JButton("encontra...");
						botaoPesex.setBounds(50, 50, 130, 30);
						// metodo para pesquisar
						botaoPesex.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {

								String encontraNome = campesquisaex.getText();
								String mensagem = "";
								boolean verifica = false;
								int i2 = 0;

								for (i2 = 0; i2 < 100; i2++) {

									if (encontraNome.equals(nomes[i2])) {

										mensagem = lembrete[i2] + "\n";
										verifica = true;
										int opcao = JOptionPane.showConfirmDialog(null,
												mensagem + " Deseja realmente excluir esse Lembrete?");
										if (opcao == 0) {
											lembrete[i2] = "";
										}
									} else {
										JOptionPane.showMessageDialog(null, "Lembrete  não encontrado");
									}

								}

							}
						});
						pesquisaex.add(campesquisaex);
						pesquisaex.add(nomePesquisaex);
						pesquisaex.add(botaoPesex);
						JLabel imagem = new JLabel();
						imagem.setSize(800, 500);
						ImageIcon caminho = new ImageIcon(
								"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
						Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
								Image.SCALE_SMOOTH);
						imagem.setIcon(new ImageIcon(img));
						imagem.setOpaque(true);
						pesquisaex.add(imagem);
						pesquisaex.setVisible(true);

					}
				});

				lembretes.add(botao);
				lembretes.add(botao2);
				lembretes.add(botao3);
				lembretes.add(botao4);

				JLabel imagem = new JLabel();
				imagem.setSize(800, 500);
				ImageIcon caminho = new ImageIcon("C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
				Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
						Image.SCALE_SMOOTH);
				imagem.setIcon(new ImageIcon(img));
				imagem.setOpaque(true);
				lembretes.add(imagem);

				lembretes.setVisible(true);

			}
		});
		if (verifica == true) {

		}

		// alterar contato
		botao4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JFrame alterar = new JFrame("pagina de Busca");
				alterar.setSize(250, 200);
				alterar.setLayout(null);
				alterar.setLocationRelativeTo(null);

				// campo2
				JTextField campesquisa1 = new JTextField();
				campesquisa1.setBounds(70, 10, 130, 30);
				campesquisa1.requestFocus();

				// rotulo2
				JLabel nomePesquisa1 = new JLabel("Nome :");
				nomePesquisa1.setBounds(10, 10, 130, 30);

				JButton bot = new JButton("encontra...");
				bot.setBounds(50, 50, 130, 30);

				bot.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String encontraNome1 = campesquisa1.getText();
						String mensagem = "";
						boolean verifica = false;

						for (int i2 = 0; i2 < 100; i2++) {
							if (encontraNome1.equals(nomes[i2])) {
								verifica = true;
								posicao2 = i2;
								JFrame dados = new JFrame("Dados");
								dados.setSize(300, 250);
								dados.setLayout(null);
								dados.setLocationRelativeTo(null);

								JButton save = new JButton("salvar");
								save.setBounds(175, 170, 100, 30);

								// campo
								JTextField campesquisa = new JTextField();
								campesquisa.setBounds(70, 1, 130, 30);
								campesquisa.requestFocus();
								JTextField campesquisa2 = new JTextField();
								campesquisa2.setBounds(70, 40, 130, 30);

								JTextField campesquisa3 = new JTextField();
								campesquisa3.setBounds(70, 80, 130, 30);

								JTextField campesquisa4 = new JTextField();
								campesquisa4.setBounds(70, 120, 130, 30);
								LocalDateTime data = LocalDateTime.now();
								DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
								campesquisa4.setText(data.format(dataFormat));

								// rotulo
								JLabel nomePesquisa = new JLabel("Nome :");
								nomePesquisa.setBounds(10, 10, 130, 30);
								JLabel nomePesquisa2 = new JLabel("Email :");
								nomePesquisa2.setBounds(10, 40, 130, 30);
								JLabel nomePesquisa3 = new JLabel("Telefone :");
								nomePesquisa3.setBounds(10, 80, 130, 30);
								JLabel nomePesquisa4 = new JLabel("data nascimento :");
								nomePesquisa4.setBounds(10, 120, 130, 30);

								dados.add(campesquisa);
								dados.add(campesquisa2);
								dados.add(campesquisa3);
								dados.add(campesquisa4);
								dados.add(nomePesquisa);
								dados.add(nomePesquisa2);
								dados.add(nomePesquisa3);
								dados.add(nomePesquisa4);
								dados.add(save);
								JLabel imagem = new JLabel();
								imagem.setSize(800, 500);
								ImageIcon caminho = new ImageIcon(
										"C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
								Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
										Image.SCALE_SMOOTH);
								imagem.setIcon(new ImageIcon(img));
								imagem.setOpaque(true);
								dados.add(imagem);
								dados.setVisible(true);

								save.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										System.out.println(posicao2);
										nomes[posicao2] = campesquisa.getText();
										email[posicao2] = campesquisa2.getText();
										telefone[posicao2] = campesquisa3.getText();
										data_teste[posicao2] = campesquisa4.getText();

										dados.setVisible(false);
										alterar.setVisible(false);
									}
								});

								break;
							}

						}
						if (verifica == true) {
						} else {
							JOptionPane.showMessageDialog(null, "nome nao encontrado");

							alterar.setVisible(false);
						}
					}
				});
				alterar.add(nomePesquisa1);
				alterar.add(campesquisa1);
				alterar.add(bot);
				JLabel imagem = new JLabel();
				imagem.setSize(800, 500);
				ImageIcon caminho = new ImageIcon("C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
				Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
						Image.SCALE_SMOOTH);
				imagem.setIcon(new ImageIcon(img));
				imagem.setOpaque(true);
				alterar.add(imagem);

				alterar.setVisible(true);

			}
		});
		// excluir contato
		botao5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame pesquisaex = new JFrame("pagina de Busca");
				pesquisaex.setSize(250, 200);
				pesquisaex.setLayout(null);
				pesquisaex.setLocationRelativeTo(null);

				// campo2
				JTextField campesquisaex = new JTextField();
				campesquisaex.setBounds(70, 10, 130, 30);
				campesquisaex.requestFocus();

				// rotulo2
				JLabel nomePesquisaex = new JLabel("Nome :");
				nomePesquisaex.setBounds(10, 10, 130, 30);

				JButton botaoPesex = new JButton("encontra...");
				botaoPesex.setBounds(50, 50, 130, 30);
				// metodo para pesquisar
				botaoPesex.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						String encontraNome = campesquisaex.getText();
						String mensagem = "";
						boolean verifica = false;
						int i2 = 0;

						for (i2 = 0; i2 < 100; i2++) {

							if (encontraNome.equals(nomes[i2])) {

								mensagem = nomes[i2] + "\n" + telefone[i2] + "\n" + email[i2] + "\n" + data_teste[i2]
										+ "\n";
								verifica = true;
								int opcao = JOptionPane.showConfirmDialog(null,
										mensagem + " Deseja realmente excluir esse contato?");
								if (opcao == 0) {
									nomes[i2] = "";
									telefone[i2] = "";
									email[i2] = "";
									data_teste[i2] = "";
								}
							} else {
								JOptionPane.showMessageDialog(null, "Contato não encontrado");
							}

						}

					}
				});
				pesquisaex.add(campesquisaex);
				pesquisaex.add(nomePesquisaex);
				pesquisaex.add(botaoPesex);
				JLabel imagem = new JLabel();
				imagem.setSize(800, 500);
				ImageIcon caminho = new ImageIcon("C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
				Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(),
						Image.SCALE_SMOOTH);
				imagem.setIcon(new ImageIcon(img));
				imagem.setOpaque(true);
				pesquisaex.add(imagem);
				pesquisaex.setVisible(true);
			}
		});

		painel.add(botao);
		painel.add(botao2);
		painel.add(botao3);
		painel.add(botao4);
		painel.add(botao5);
		painel.add(Ano);
		painel.add(proxAno);
		painel.add(voltAno);
		painel.add(nowDate);

		JLabel imagem = new JLabel();
		imagem.setSize(800, 500);
		ImageIcon caminho = new ImageIcon("C:\\eclipse-workspace\\trabalho\\src\\trabalhoo\\images.jpeg");
		Image img = caminho.getImage().getScaledInstance(imagem.getWidth(), imagem.getHeight(), Image.SCALE_SMOOTH);
		imagem.setIcon(new ImageIcon(img));
		imagem.setOpaque(true);

		painel.add(imagem);
		painel.setVisible(true);

	}

	public void disparaRelogio() {
		if (timer == null) {
			timer = new javax.swing.Timer(1000, this);
			timer.setInitialDelay(0);
			timer.start();
		} else if (!timer.isRunning()) {
			timer.restart();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Date hora = new Date();
		SimpleDateFormat hora_formato = new SimpleDateFormat("HH:mm:ss");
		horario.setText(hora_formato.format(hora));

	}
}

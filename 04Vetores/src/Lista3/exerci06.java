package Lista3;

import javax.swing.JOptionPane;

public class exerci06 {
	public static void main(String[] args) {
		boolean acho=true;
		boolean menu=false;
		boolean verifica = false;
		String[] nomes = new String[100];
		String[] data = new String[100];
		String[] estado = new String[100];
		String[] endereco = new String[100];
		String[] telefone = new String[100];
		String[] celular = new String[100];
		String[] email = new String[100];
		String receber = "";
		int position = 0;
		
		
		for(int i=0; i<100; i++) {
			nomes[i] = "";
		}
		
		
		while(menu==false) {
		Object[] agenda = { " Cadastrar Contato ", "Alterar Contato ", " Excluir Contato ", "Pesquisar ", "Sair" };
		int opcao = JOptionPane.showOptionDialog(null, "Agenda", "menu", JOptionPane.PLAIN_MESSAGE,
				JOptionPane.QUESTION_MESSAGE, null, agenda, 0);
		switch (opcao) {
		case 0:
			verifica=false;
			while (verifica == false) {
				receber = JOptionPane.showInputDialog("informe um nome");
				for (int i = 0; i < 100; i++) {
					if (nomes[i].equals(receber)) {
						JOptionPane.showMessageDialog(null, "o nome informado ja foi cadastrado,informe outro nome");
					}
				}
				nomes[position] = receber;
				verifica = true;

			}

			data[position] = JOptionPane.showInputDialog("informe sua data de nascimento");
			estado[position] = JOptionPane.showInputDialog("informe um Estado");
			endereco[position] = JOptionPane.showInputDialog("informe um endereço");
			telefone[position] = JOptionPane.showInputDialog("informe um telefone");
			celular[position] = JOptionPane.showInputDialog("informe um celeluar");
			email[position] = JOptionPane.showInputDialog("informe um e-mail");
			position++;
			break;
		case 1:
			verifica = false;
			while (verifica == false) {
				String pesquisa = JOptionPane.showInputDialog("Informe o nome pelo qual deseja alterar");
				for (int i = 0; i < 100; i++) {
					if (nomes[i].equals(pesquisa)) {
						nomes[i] = JOptionPane.showInputDialog("informe um novo nome");
						data[i] = JOptionPane.showInputDialog("informe uma nova data");
						estado[i] = JOptionPane.showInputDialog("informe um novo estado");
						endereco[i] = JOptionPane.showInputDialog("informe um novo endereco");
						telefone[i] = JOptionPane.showInputDialog("informe um novo telefone");
						celular[i] = JOptionPane.showInputDialog("informe um novo clular");
						email[i] = JOptionPane.showInputDialog("informe um novo e-mail");
						verifica = true;
						acho=false;
					}
				}
				if(acho==true) {
					JOptionPane.showMessageDialog(null, "nome nao encontrado");
				}
			}
			break;
		case 2:
			verifica = false;
			
			while (verifica == false) {
				String pesquisa = JOptionPane.showInputDialog("Informe o nome do contato que você deseja excluir");
				for (int i = 0; i < 100; i++) {
					if (nomes[i].equals(pesquisa)) {
						nomes[i] = "";
						data[i] = "";
						estado[i] = "";
						endereco[i] = "";
						telefone[i] = "";
						celular[i] = "";
						email[i] = "";
						verifica = true;
						acho=false;
					}
				}
				if(acho==true) {
					JOptionPane.showMessageDialog(null, "nome nao encontrado");
				}
			}
			break;
		case 3:
			String pesquisa = JOptionPane.showInputDialog("Informe o nome que deseja pesquisar");
			 acho=true;
			for (int i = 0; i < 100; i++) {
				if (nomes[i].equals(pesquisa)) {
					String mensagem = "nome:" + nomes[i] + "\ndata de nascimento: " + data[i] + "/nEstado: " + estado[i]
							+ "\nEndereço: " + endereco[i] + "\nTelefone: " + telefone[i] + "\nCelular: " + celular[i]
							+ "\nE-mail: " + email[i];
					JOptionPane.showMessageDialog(null, mensagem);
					acho=false;
				}
			}
			if(acho==true) {
				JOptionPane.showMessageDialog(null, "nome nao encontrado");
			}
			
			break;
		case 4:
			menu=true;
		}
	}
	}
}

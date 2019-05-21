package Lista02;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class exprova {

	public static void main(String[] args) {
		boolean valida = false;
		int funcionarios = 0, masculino = 0, feminino = 0;
		int qtdi1 = 0, qtdi2 = 0, qtdi3 = 0, qtdi4 = 0;
		int deveJr = 0, devePl = 0, deveSr = 0, admD = 0, AnaJr = 0, AnaPl = 0, AnaSr = 0, arquiSoft = 0,
				GerenteProjeto = 0;
		double Maiorsalario = 0;
		int clubeFidelidade = 0;
		String nomeMaiorS = "";
		while (valida == false) {
			String nome = JOptionPane.showInputDialog("informe seu nome");
			int cargo = Integer.parseInt(JOptionPane.showInputDialog(
					"informe seu cargo!\n1-Develop Jr.\n2-Develop Pl.\n3-Develop Sr.\n4-Adm DataBase\n5-Analista Jr.\n6-Analista Pl.n7-Analista Sr.\n8-arquiteto Software\n9-Gerente de projetos"));
			int horasN = Integer.parseInt(JOptionPane.showInputDialog("quantidade de horas trabalhadas normais "));
			int horasEN = Integer.parseInt(JOptionPane.showInputDialog("quantidade de horas Extras 50% trabalhadas "));
			int horasEC = Integer.parseInt(JOptionPane.showInputDialog("quantidade de horas Extras 100% trabalhadas "));
			double horasph = Double.parseDouble(JOptionPane.showInputDialog("quanto recebe por hora"));
			String sexo = JOptionPane.showInputDialog("informe seu sexo");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("qual sua idade"));
			if (idade > 18 && idade <= 26) {
				qtdi1++;
			} else if (idade > 26 && idade <= 40) {
				qtdi2++;
			} else if (idade > 40 && idade <= 50) {
				qtdi3++;
			} else if (idade > 50) {
				qtdi4++;
			}
			int qtdfaltas = Integer.parseInt(JOptionPane.showInputDialog("Quantas vezes faltou"));
			int qtdfilhos = Integer.parseInt(JOptionPane.showInputDialog("quantidade de fihos que você tem"));
			int socio = Integer
					.parseInt(JOptionPane.showInputDialog("É associado ao clube fidelidade?\n1- Sim\n2- Nâo"));
			switch (socio) {
			case 1:
				clubeFidelidade++;
				break;
			default:
				break;
			}
			double SalarioB = 0;
			double SalarioL = 0;
			double pf = 0;
			double salario = 0;
			double bonuspf = 0;
			double desc = 0;
			double descsoci = 0;
			if (sexo.equals("masculino")) {
				masculino++;
				funcionarios++;
			} else if (sexo.equals("feminino")) {
				feminino++;
				funcionarios++;
			} else if (socio == 1) {
				descsoci = 110;
			} else if (qtdfaltas == 0) {
				pf = 200;

			} else if (qtdfilhos > 0) {
				bonuspf = qtdfilhos * 50;
			}
			salario = horasN * horasph;
			double valorE = (horasph * horasEN)*1.5;
			double valorEX = (horasph* horasEC)*2;
			SalarioB =  salario + valorE + valorEX;
			if (SalarioB <= 2000) {
				desc = SalarioB * 0.05;
			} else if (SalarioB > 2000 && SalarioB <= 3.500) {
				desc = SalarioB * 0.07;
			} else if (SalarioB > 3.500 && SalarioB <= 5.600) {
				desc = SalarioB * 0.08;
			} else if (SalarioB > 5.600) {
				desc = SalarioB * 0.10;
			}
			double INSS = desc;
			double VT = SalarioB * 0.06;
			

			SalarioL = SalarioB + pf + bonuspf - (VT + INSS + descsoci);

			if (SalarioL > Maiorsalario) {
				Maiorsalario = SalarioL;
				nomeMaiorS = nome;
			}

			switch (cargo) {
			case 1:
				deveJr++;
				break;
			case 2:
				devePl++;
				break;
			case 3:
				deveSr++;
				break;
			case 4:
				admD++;
				break;
			case 5:
				AnaJr++;
				break;
			case 6:
				AnaPl++;
				break;
			case 7:
				AnaSr++;
				break;
			case 8:
				arquiSoft++;
				break;
			case 9:
				GerenteProjeto++;
				break;

			default:
				break;
			}
			DecimalFormat df = new DecimalFormat("#.00");
			JOptionPane.showMessageDialog(null,"Seu salario liquido é de " + df.format(SalarioL));
			int continuar = Integer.parseInt(JOptionPane.showInputDialog("deseja continuar?\n1-Sim\n2-Não"));
			if (continuar == 1) {
				valida = false;
			} else {
				valida = true;
			}
		}

		JOptionPane.showMessageDialog(null, "O número de funcionários que foram cadastrados foi de " + funcionarios);
		JOptionPane.showMessageDialog(null,
				" Quantidade e percentual de homens e mulheres\n " + masculino + " homens\n" + feminino + " mulheres");
		JOptionPane.showMessageDialog(null,
				"O número de funcionários com idade entre 18 a 26 é de " + qtdi1
						+ "\nO número de funcionários com idade entre 26 a 40 é de " + qtdi2
						+ "\nO número de funcionários com idade entre 40 a 50 é de " + qtdi3
						+ "\nO número de funcionários com idade acima de 50 é de " + qtdi4);
		double percentual1 = 0, percentual2 = 0, percentual3 = 0, percentual4 = 0, percentual5 = 0, percentual6 = 0,
				percentual7 = 0, percentual8 = 0, percentual9 = 0;
		percentual1 = (100 / funcionarios) * deveJr;
		percentual2 = (100 / funcionarios) * devePl;
		percentual3 = (100 / funcionarios) * deveSr;
		percentual4 = (100 / funcionarios) * admD;
		percentual5 = (100 / funcionarios) * AnaJr;
		percentual6 = (100 / funcionarios) * AnaPl;
		percentual7 = (100 / funcionarios) * AnaSr;
		percentual8 = (100 / funcionarios) * arquiSoft;
		percentual9 = (100 / funcionarios) * GerenteProjeto;
		DecimalFormat du = new DecimalFormat("#.00");
		JOptionPane.showMessageDialog(null,
				"Quantidade de funcionários e percentual de cada cargo foi de :\nNome do cargo | Quantidade de cada cargo |  percentual de cada cargo\nDesenvolvedor Java Júnior |"
						+ deveJr + "|" + percentual1 + "%\nDesenvolvedor Java Pleno |" + devePl + "|" + percentual2
						+ "%\nDesenvolvedor Java Sênior |" + deveSr + "|" + percentual3
						+ "%\nAdministrador de Banco de Dados |" + admD + "|" + percentual4 + "\nAnalista Júnior |"
						+ AnaJr + "|" + percentual5 + "%\nAnalista Pleno |" + AnaPl + "|" + percentual6
						+ "%\nAnalista Sênior  |" + AnaSr + "|" + percentual7 + "\nArquiteto de Software |" + arquiSoft
						+ "|" + percentual8 + "Gerente de Projetos |" + GerenteProjeto + "|" + percentual9);
		JOptionPane.showMessageDialog(null, "O funcionário com maior salário líquido é o " + nomeMaiorS
				+ " com o salario liquido de " + du.format(Maiorsalario));
		double percentClube = (100 / funcionarios) * clubeFidelidade;
		JOptionPane.showMessageDialog(null, "Numero de funcionários que aderem ao clube fidelidade é de "
				+ clubeFidelidade + " e o percentual é de " + percentClube + "%");
	}
}

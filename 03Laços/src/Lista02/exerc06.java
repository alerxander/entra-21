package Lista02;

import javax.swing.JOptionPane;

public class exerc06 {

	public static void main(String[] args) {
		boolean valida = false;
		int masculino = 0, feminino = 0;
		int nota1=0, nota2=0, nota3=0, nota4=0;
		String nome="";
		while (valida == false) {
			 nome= JOptionPane.showInputDialog("informe seu nome!");
			if (nome.equals("sair")) {
				valida = true;

			}else {

			String sexo = JOptionPane.showInputDialog("informe seu sexo!");
			 nota1 = Integer.parseInt(JOptionPane.showInputDialog("informe sua primeira nota!"));
			 nota2 = Integer.parseInt(JOptionPane.showInputDialog("informe sua segunda nota!"));
			 nota3 = Integer.parseInt(JOptionPane.showInputDialog("informe sua terceira nota!"));
			 nota4 = Integer.parseInt(JOptionPane.showInputDialog("informe sua quarta nota!"));
			
			if (sexo.equals("masculino")) {
				masculino++;
			} else if (sexo.equals("feminino"))
				feminino++;
			{

			}
			double media = (nota1 + nota2 + nota3 + nota4) / 4;
			if (media == 10) {
				JOptionPane.showMessageDialog(null, "parabens,sua media é " + media);
			} else if (media < 9.9 && media > 9) {
				JOptionPane.showMessageDialog(null, "Otimo,sua media é " + media);
			} else if (media > 8 && media <= 8.9) {
				JOptionPane.showMessageDialog(null, "Bom,sua media é " + media);
			} else if (media > 7 && media <= 7.9) {
				JOptionPane.showMessageDialog(null, "Satisfatoria,sua media é " + media);
			} else if (media > 5 && media <= 6.9) {
				JOptionPane.showMessageDialog(null, "Recuperação,sua media é " + media);
			} else if (media < 5) {
				JOptionPane.showMessageDialog(null, "Reprovado,sua media é " + media);
			}

			}

		}
		if(nome.equals("sair")&&nota1>=1) {
			JOptionPane.showMessageDialog(null,
					"Quantidade percentual de:\nMulheres = " + feminino + "\nHomens =" + masculino);
			JOptionPane.showMessageDialog(null,
					"quantidade percentual de notas:\nalunos que tiraram 10-parabens\nalunos que tiraram entre 9 e 9,9-Otimo\nalunos que tiraram entre 8 e 8.9-Bom\nalunos que tiraram entre 7 e 7.9-Satisfatório\nalunos que tiraram entre 5 e 6.9-Recuperação\nalunos que tiraram abaixo de 5-Reprovado");
		}
	}
}

package listao01;

import javax.swing.JOptionPane;

public class Exer03 {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "informe suas quatro nota");
	int nota1=Integer.parseInt(JOptionPane.showInputDialog("1° nota"));
	int nota2=Integer.parseInt(JOptionPane.showInputDialog("2° nota"));
	int nota3=Integer.parseInt(JOptionPane.showInputDialog("3° nota"));
	int nota4=Integer.parseInt(JOptionPane.showInputDialog("4° nota"));
		
		int media =(nota1+nota2+nota3+nota4)/4;

		if(media >=7 ) {
			JOptionPane.showMessageDialog(null, "parabéns,você foi aprovado,sua média foi "+media);
		}
		
		else if(media >=5 ) {
			JOptionPane.showMessageDialog(null, "você esta em exame ,sua média foi "+media);
	}
		else if(media <= 4.9) {
			JOptionPane.showMessageDialog(null, "infelzmente você esta Reprovado com a médeia de "+media);
		}
}
}

	

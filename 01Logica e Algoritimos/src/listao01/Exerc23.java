package listao01;

import javax.swing.JOptionPane;

public class Exerc23 {

	public static void main(String[] args) {
		double peso=Integer.parseInt(JOptionPane.showInputDialog("informe seu peso"));
		double altura=Integer.parseInt(JOptionPane.showInputDialog("informe sua altura"));
		double IMC = peso/(Math.pow(altura, 2));

		if(IMC < 17) {
			JOptionPane.showMessageDialog(null, "Muito abaixo do peso" );
		}
		else if(IMC >=17 && IMC <= 18.49) {
			JOptionPane.showMessageDialog(null, "Abaixo do peso ");
		}else if(IMC>=18.5 && IMC <=24.99) {
			JOptionPane.showMessageDialog(null, "Peso normal ");
		}
		else if(IMC>=25 && IMC<=29.9) {
			JOptionPane.showMessageDialog(null, "Acima do peso ");
		}else if(IMC>=30&& IMC <=34.99) {
			JOptionPane.showMessageDialog(null, "Obesidade I ");
		}else if(IMC>=35 && IMC <= 39.99) {
			JOptionPane.showMessageDialog(null, "Obesidade II (severa) ");
		}
		else if(IMC>40) {
			JOptionPane.showMessageDialog(null, "Obesidade III (mórbida) ");
		}
	}

}

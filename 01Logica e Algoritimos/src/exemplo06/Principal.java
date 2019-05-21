package exemplo06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		//condicional simples
		int idade = Integer.parseInt(JOptionPane.showInputDialog("informe sua idade"));
		
		if (idade>=18) {
			JOptionPane.showMessageDialog(null, "Maior de idade");
	
		
	}
	else {
		JOptionPane.showMessageDialog(null, "menor de idade");
	}
}
}

package exemplo05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		try {
			int idade =Integer.parseInt( JOptionPane.showInputDialog("informe sua idade"));
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "falha ao obter idade: "+erro.getMessage());
		}finally {
			JOptionPane.showMessageDialog(null, "finalizando o exemplo");
			
		}
	}
}

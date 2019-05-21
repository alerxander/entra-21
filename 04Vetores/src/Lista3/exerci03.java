package Lista3;

import javax.swing.JOptionPane;

public class exerci03 {

	public static void main(String[] args) {
		
	String mensagem="";
	String mensagem2="";
	int []numeros = new int [10];
	
	 for(int i =0;i<10;i++) {
		 numeros[i]= Integer.parseInt(JOptionPane.showInputDialog("informe 10 numeros aleatorios"));
		 mensagem+= "\n"+numeros[i];
	 }
	 JOptionPane.showMessageDialog(null, mensagem);
	 for(int i =9;i>=0;i--) {
		mensagem2 += "\n"+numeros[i];
	 }
	 JOptionPane.showMessageDialog(null, mensagem2);
	 }
}

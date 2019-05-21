package Lista02;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class exerc05 {

	public static void main(String[] args) {
		
	String nome =	JOptionPane.showInputDialog("informe o nome do produto");
	double valor = Double.parseDouble(JOptionPane.showInputDialog("informe o valor do pruduto"));
	double resultado=0;
	double p = 0;
	double d = 0.95;
	DecimalFormat df =new DecimalFormat("#.00");
	
		for(int i=1;i<=10;i++){
			
			resultado = valor* d;
			System.out.println(i+"x R$"+df.format(resultado)+"= R$"+df.format(resultado*i) );
			d -= 0.05;
		}
		
	}
}

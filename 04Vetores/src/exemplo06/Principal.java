package exemplo06;

import javax.swing.JOptionPane;

public class Principal {
public static void main(String[] args) {
	
	
	//Matriz ou Array Bidimensional
	
	
	String[][] cursos=new String [2][2];
	
	
	//obter informaçoes dos cursos
	for(int i = 0;i<2;i++) {
		cursos[i][0]= JOptionPane.showInputDialog("nome do curso");
		cursos[i][1]= JOptionPane.showInputDialog("Area de atuação");
	}
	
	//exibir informçoes
	System.out.println("curso: "+cursos[0][0]+" Area: "+cursos[0][1]);
	System.out.println("curso: "+cursos[1][0]+" Area: "+cursos[1][1]);
}
}

package Lista02;

import javax.swing.JOptionPane;

public class exerc07 {

	public static void main(String[] args) {
		boolean letra = false;
		boolean val = false;
		int e = 1, s = 1, t = 1, u = 1, d = 1, a = 1, r = 1;
		int vida = 6;
		int palavra =0;
		JOptionPane.showMessageDialog(null, "Bem vindo ao jogo da Forca.");
		while (val == false) {
			String nome = JOptionPane.showInputDialog("informe  uma letra");
			if (nome.equalsIgnoreCase("E") && e == 1) {	
				e--;
				JOptionPane.showMessageDialog(null, "parabens,você acertou uma letra,continue tentando");
				letra = true;
				palavra++;
			} else if (nome.equalsIgnoreCase("S") && s == 1) {		
				s--;
				JOptionPane.showMessageDialog(null, "parabens,você acertou uma letra,continue tentando");
				letra = true;
				palavra++;
			} else if (nome.equalsIgnoreCase("T") && t == 1) {			
				t--;
				JOptionPane.showMessageDialog(null, "parabens,você acertou uma letra,continue tentando");
				letra = true;
				palavra++;
			} else if (nome.equalsIgnoreCase("U") && u == 1) {			
				u--;
				JOptionPane.showMessageDialog(null, "parabens,você acertou uma letra,continue tentando");
				letra = true;
				palavra++;
			} else if (nome.equalsIgnoreCase("D") && d == 1) {			
				d--;
				JOptionPane.showMessageDialog(null, "parabens,você acertou uma letra,continue tentando");
				letra = true;
				palavra++;
			} else if (nome.equalsIgnoreCase("A") & a == 1) {			
				a--;
				JOptionPane.showMessageDialog(null, "parabens,você acertou uma letra,continue tentando");
				letra = true;
				palavra++;
			} else if (nome.equalsIgnoreCase("R") && r == 1) {			
				r--;
				JOptionPane.showMessageDialog(null, "parabens,você acertou uma letra,continue tentando");
				letra = true;
				palavra++;
			} else if (letra == false) {
				JOptionPane.showMessageDialog(null, "você errou,tente novamente");
				vida--;
			} else {
				JOptionPane.showMessageDialog(null, "Você ja informou essa letra");
			}
			if (vida <= 0||palavra==7) {
				val = true;
			}
		}
		if (e == 0 && s == 0 && t == 0 && u == 0 && d == 0 && a == 0 && r == 0) {
			JOptionPane.showMessageDialog(null, "Parabens,você acertou a palavra 'Estudar'");
		} else {
			JOptionPane.showMessageDialog(null, "Você zerou suas vidas,Game ower");
		}
	}

}

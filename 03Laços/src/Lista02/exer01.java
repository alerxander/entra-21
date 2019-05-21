package Lista02;

import javax.swing.JOptionPane;

public class exer01 {
	public static void main(String[] args) {

		boolean valida = false;

		while(valida==false) {
			
		String nome = JOptionPane.showInputDialog("informe seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("informe sua idade"));
		String sexo = JOptionPane.showInputDialog("informe seu sexo");
		String cargo = JOptionPane.showInputDialog("informe seu Cargo atual");
		int maiorIdade = 0;
		int menorIdade = 0;
		int masculino = 0;
		int feminino = 0;
		int gerente = 0;
		int atendente = 0;
		int acoguero = 0;
		int secretario = 0;
		int almoxerife = 0;
		int padeiro = 0;
		int estagiario = 0;

		if (idade >= 18) {
			maiorIdade++;
		} else {
			menorIdade--;
		}

		if (sexo.equals("masculino")) {
			masculino++;
		} else {
			feminino++;
		}
if(cargo.equals("gerente")){
	gerente++;
}else if(cargo.equals("atendente")) {
	atendente++;
}else if(cargo.equals("açogueiro")) {
	acoguero++;
}else if(cargo.equals("secretario")) {
	secretario++;
}else if(cargo.equals("almoxerife")) {
	almoxerife++;
}else if(cargo.equals("padeiro")) {
	padeiro++;
}else if(cargo.equals("estagiario")) {
	estagiario++;
}
		
		JOptionPane.showMessageDialog(null,
				"a quantidade de pessoas do sexo masculinas são " + masculino + " e do sexo feminino são " + feminino);
		JOptionPane.showMessageDialog(null,
				"Quantidade de pessoas dos seguintes cargos; gerente, atendente, açougueiro,  secretária, almoxarife, padeiro e estagiário são :\ngerente= "
						+ gerente + "\natendente= " + atendente + "\naçogueiro = " + acoguero + "\nsecretária= "
						+ secretario + "\namoxerife= " + almoxerife + "\npadeiro= " + padeiro + "\nestagiario= "
						+ estagiario);
		JOptionPane.showMessageDialog(null,"A quantidade de pessoas maior de idade são " + maiorIdade + " e menores de idade " + menorIdade);

		

		int confirme= JOptionPane.showConfirmDialog(null, "deseja fazer mais algum cadastro?");
		
		if(confirme == 0) {
			valida = false;
		}else {
			valida=true;
		}
		}
		
}
}

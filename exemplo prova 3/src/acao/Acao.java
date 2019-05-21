package acao;

import javax.swing.table.DefaultTableModel;

import beans.Usuario;
import dados.Dados;

public class Acao {

	public void Cadastrar(Usuario d) {
		Dados.listaUsuario.add(d);
	}

	public DefaultTableModel Selecionar() {

		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Nome");
		modelo.addColumn("Idade");
		modelo.addColumn("Peso");
		modelo.addColumn("Altura");
		modelo.addColumn("IMC");

		for (int i = 0; i < Dados.listaUsuario.size(); i++) {

			modelo.addRow(new Object[] {

					Dados.listaUsuario.get(i).getNome(), 
					Dados.listaUsuario.get(i).getIdade(), 
					Dados.listaUsuario.get(i).getPeso(), 
					Dados.listaUsuario.get(i).getAltura(), 
					Dados.listaUsuario.get(i).getIMC(), 
					
			});
		}

		return modelo;
	}
	
	public void alterar (int i,Usuario u) {
		Dados.listaUsuario.set(i, u);
		
	}
	
	public void excluir(int i ) {
		Dados.listaUsuario.remove(i);
		
	}
	
	public boolean existe(Usuario u) {
		boolean verificando = false;
		for(int i=0;i<Dados.listaUsuario.size();i++) {
			if(Dados.listaUsuario.get(i).getNome().equalsIgnoreCase(u.getNome())){
				verificando = true;
				break;
			}
			
		}
		
		
		return verificando;
	}
	
	public String CalculoImc(double peso,double altura) {
	String	situacao="";
		if(peso/Math.pow(altura, 2)<17) {
			situacao="Muito abaixo do peso";
		}else if(peso/Math.pow(altura, 2)>17&&peso/Math.pow(altura, 2)<18.49) {
		situacao="abaixo do peso";
		}else if(peso/Math.pow(altura, 2)>18.5&&peso/Math.pow(altura, 2)<24.99) {
			situacao="Peso normal";
		}else if(peso/Math.pow(altura, 2)>25&&peso/Math.pow(altura, 2)<29.99) {
			situacao="Acima do peso";
		}else if(peso/Math.pow(altura, 2)>30&&peso/Math.pow(altura, 2)<34.99) {
			situacao="obesidade I";
		}else if(peso/Math.pow(altura, 2)>35&&peso/Math.pow(altura, 2)<39.99) {
			situacao="obesidade II";
		}else if(peso/Math.pow(altura, 2)>40) {
			situacao="obesidade III";
		}
		
		return "";
	}
	
}

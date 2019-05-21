package acao;


import javax.swing.table.DefaultTableModel;

import beans.Curso;
import dados.Dados;

public class Acao {

	
	//CRUD - create,read,update and delete/criar , ler ,atualizar e excluir
	
	//cadastro
	public void cadastrar(Curso c) {
		
		Dados.arrayCursos.add(c);
	}
	//sele��o
	public DefaultTableModel selecionar() {
		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Curso");
		modelo.addColumn("�rea");
		
		for(int i = 0;i <Dados.arrayCursos.size();i++) {
		
			modelo.addRow(new Object[] {
			Dados.arrayCursos.get(i).getNomeCurso(),
			Dados.arrayCursos.get(i).getAreaCurso(),
			
			
			});
			}
			
		 return modelo;
	}
	
	//altera��o
	
	public void alterar(int indice,Curso c) {
		
		Dados.arrayCursos.set(indice, c);
		
	}
	
	//exclus�o
	public void excluir (int indice) {
		Dados.arrayCursos.remove(indice);
	}
	
}

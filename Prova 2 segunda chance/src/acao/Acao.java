package acao;

import javax.swing.JOptionPane;

import beans.Produto;
import dados.Dados;

public class Acao {

	public void somar(Produto p) {
		p.setQuantidade(p.getQuantidade() + 1);
		;
	}

	public void subtrair(Produto p) {
		if(p.getQuantidade()>0) {
			p.setQuantidade(p.getQuantidade() - 1);
		}
		
	}

	public int somarQuantidade(Produto p1, Produto p2, Produto p3, Produto p4, Produto p5, Produto p6, Produto p7,
			Produto p8) {

		int resultado = p1.getQuantidade() + p2.getQuantidade() + p3.getQuantidade() + p4.getQuantidade()
				+ p5.getQuantidade() + p6.getQuantidade() + p7.getQuantidade() + p8.getQuantidade();

		return resultado;

	}
	
	public String  exibir(Produto p1, Produto p2, Produto p3, Produto p4, Produto p5, Produto p6, Produto p7,
			Produto p8) {
		
	String mensagem = p1.getNome()+" -quantidade "+p1.getQuantidade()+"\n"+p2.getNome()+"-quantidade "+p2.getQuantidade()+"\n"+p3.getNome()+"-quantidade "+p3.getQuantidade()+"\n"+p4.getNome()+"-quantidade "+p4.getQuantidade()+"\n"+p5.getNome()+"-quantidade "+p5.getQuantidade()+"\n"+p6.getNome()+"-quantidade "+p6.getQuantidade()+"\n"+p7.getNome()+"-quantidade "+p7.getQuantidade()+"\n"+p8.getNome()+"-quantidade "+p8.getQuantidade()+"\n";
		
	return mensagem;
	}
}

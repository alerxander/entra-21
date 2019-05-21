package exemplo02;

import java.util.ArrayList;

public class Principal {
public static void main(String[] args) {
	
	//objeto 01
	Curso c1 = new Curso();
	c1.setNomeCurso("java");
	c1.setAreaCurso("Desenvolvimebnto");
	c1.setValorCurso(2300);
	//objeto2
	Curso c2 = new Curso();
	c2.setNomeCurso("Photoshop");
	c2.setAreaCurso("Grafica");
	c2.setValorCurso(600);
	//objeto3
	Curso c3 = new Curso();
	c3.setNomeCurso("C#");
	c3.setAreaCurso("Desenvolvimebnto");
	c3.setValorCurso(1800);
	
	//Arraylist
	ArrayList<Curso> cursos = new ArrayList<Curso>();
	cursos.add(c1);
	cursos.add(c2);
	cursos.add(c3);
	
	//laço
	for(int i =0;i<cursos.size();i++) {
		System.out.println(cursos.get(i).getNomeCurso());
	}
	
}
}

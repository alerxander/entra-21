package exemplo01;

import java.util.ArrayList;

public class Principal {
public static void main(String[] args) {
	
	
	//criar arrrayList
	
	ArrayList<String> cursos = new ArrayList<String>();
	
	
	//cadastrar cursos
	
	cursos.add("java");
	cursos.add("html");
	cursos.add("CSS");
	cursos.add("JavaScript");
	
	
	//alterar um curso
	cursos.set(3,"Jquery");
	//listar os cursos
	
	//remover um curso
	cursos.remove(1);
	
	//remover todos os cursos
	cursos.clear();
	
	for (String curso: cursos) {
		System.out.println(curso);
	}
	
}
}

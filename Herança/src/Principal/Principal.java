package Principal;

import Cargos.Analista;
import Cargos.Desenvolvedor;
import Cargos.Estagiario;


public class Principal {

	public static void main(String[] args) {
		
		//instanciar objetos
		
		
		Estagiario e = new Estagiario();
		Analista a = new Analista(5000,2);
		Desenvolvedor d =new Desenvolvedor(3000,3);
		
		//chamando metodos de identificação
		e.indetificacao();
		a.indetificacao();
		d.indetificacao();
		
		//chamando metodos de vale trasporte
		a.vt();
		e.vt();
		d.vt();
		
		//chamando os metodos de ir
		e.ir();
		a.ir();
		d.ir();
		
	}
	
	
	
}

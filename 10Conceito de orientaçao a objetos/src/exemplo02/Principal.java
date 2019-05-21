package exemplo02;

public class Principal {

	public static void main(String[] args) {
		// instancia
		
		Calculadora c = new Calculadora();
		c.somar(50, 50);
		c.subtracao(50, 45);
		
		int resultadoSubtracao =c.subtracao(20, 5);
		System.out.println(resultadoSubtracao);
		
	}
	
}

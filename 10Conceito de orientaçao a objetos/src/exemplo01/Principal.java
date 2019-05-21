package exemplo01;

public class Principal {

	
	// objeto -> resultado do molde
	public static void main(String[] args) {
		
		//chamando a outra classe com os atributos
		Carro c1 = new Carro();
		c1.ano=2019;
		c1.cor="Azul";
		c1.fabricante="hyundai";
		c1.modelo = "HB20";
		
		c1.exibirDados();
		
		//segunda instancia
		
		Carro c2 = new Carro();
		
		c2.ano = 2010;
		c2.cor= "verde";
		c2.fabricante="toyota";
		c2.modelo = "corolla";
		c2.exibirDados();
		
		
		
	}

}

package Banco;

public class Cheque extends ChequeEspecial {

	//metodo de juros
	public void juros(double valor) {
		System.out.println("taxa do cheque : "+valor*0.05);
	}
	
}

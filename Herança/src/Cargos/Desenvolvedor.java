package Cargos;

public class Desenvolvedor extends cargo {

	
	public Desenvolvedor(double salario,int nivel) {
		this.salario= salario;
		this.nivel=nivel;
		Cargo = "Desenvolvedor";
	}
	
	public void ir()
	{
		if(nivel == 1) {
			System.out.println("Imposto de renda:  "+salario*0.04);
		}else if(nivel == 2) {
		System.out.println("Imposto de renda:  "+salario*0.05);
		}else {
			System.out.println("Imposto de renda:  "+salario*0.10);
		}
	}
}

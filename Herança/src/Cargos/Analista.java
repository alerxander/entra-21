package Cargos;

public class Analista extends cargo{
	
	public Analista(double salario,int nivel) {
		this.salario = salario;
		this.nivel = nivel;
		Cargo = "Analista";
	}
	
	public void ir()
	{
		if(nivel ==1) {
			System.out.println("Imposto de renda:  "+salario*0.15);
		}else {
			System.out.println("Imposto de renda:  "+salario*0.20);
		}
	}
}

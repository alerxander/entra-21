package Cargos;

public class cargo {

	protected String Cargo;
	protected double salario;
	protected int nivel;
	
	
	//vale trasporte
	
	public void vt() {
		System.out.println("desconto do vale transporte � "+salario*0.06);
	}
	
	//identifica��o
	public void indetificacao() {
		System.out.println("Ocargo selecionado � "+Cargo);
	}
	
}

package Cargos;

public class cargo {

	protected String Cargo;
	protected double salario;
	protected int nivel;
	
	
	//vale trasporte
	
	public void vt() {
		System.out.println("desconto do vale transporte é "+salario*0.06);
	}
	
	//identificação
	public void indetificacao() {
		System.out.println("Ocargo selecionado é "+Cargo);
	}
	
}

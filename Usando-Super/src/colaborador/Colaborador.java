package colaborador;

public class Colaborador extends Pessoa {

	private String cargoColaborador;
	private double salarioColaborador;
	
	//construtor
	public Colaborador(String nomePessoa,String emailPessoa,String enderecoPessoa,int idadePessoa,String cargoColaborador,double salarioColaborador) {
		super(nomePessoa,emailPessoa,enderecoPessoa,idadePessoa);
		this.cargoColaborador=cargoColaborador;
		this.salarioColaborador=salarioColaborador;
		
		exibirDadosColaborador();
	}
	
	
	//metodo para exibir dados do colaborador
	private void exibirDadosColaborador() {
		System.out.println("Cargo: "+cargoColaborador);
		System.out.println("salario: "+salarioColaborador);
	}
}

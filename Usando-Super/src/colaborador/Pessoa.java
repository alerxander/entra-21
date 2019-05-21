package colaborador;

public class Pessoa {

	private String nomePessoa,emailPessoa,enderecoPessoa;
	private int idadePessoa;
	
	
	public Pessoa(String nomeP,String emailP,String enderecoP,int idadeP) {
		
		this.nomePessoa=nomeP;
		this.emailPessoa=emailP;
		this.enderecoPessoa=enderecoP;
		this.idadePessoa=idadeP;
		
		
		exibirDadosPessoa();
	}
	
	
	//método para exibir os dados da pessoa
	
	private void exibirDadosPessoa() {
		System.out.println("Nome: "+nomePessoa);
		System.out.println("email: "+emailPessoa);
		System.out.println("endereço: "+enderecoPessoa);
		System.out.println("idade: "+idadePessoa);
	}
}

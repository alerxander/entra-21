package exemplo03;

public class Pessoa {

	
	private String nome;
	private int idade;
	
	//construtor
	public Pessoa(String nome , int idade) {
		this.nome = nome;
		this.idade = idade;
		exibirDados();
		situacaoIdade();
	}
	
	
	
	//metodo exibir dados
	private void exibirDados() {
		System.out.println(nome+"\n"+idade);
	}
	
	//metodo para retornar a situação da idade.
	
	private void  situacaoIdade() {
		
		System.out.println(idade>= 18? "Maior de idade" : "Menor de idade");
	}
	
}

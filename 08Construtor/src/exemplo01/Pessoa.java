package exemplo01;

public class Pessoa {
// conceito de construtor 
	//é uma classe que executa automaticamente quando instanciado o objeto
	
	Pessoa(){
		System.out.println("olá");
		
	}
	
	//segundo construtor
	Pessoa(String nome){
		System.out.println("olá "+nome);
	}

	//terceiro construtor 
	Pessoa(String nome, int idade){
		System.out.println("olá "+nome+",você tem "+idade+" anos");
	}
	
}

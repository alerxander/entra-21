package exemplo01;

public class Pessoa {
// conceito de construtor 
	//� uma classe que executa automaticamente quando instanciado o objeto
	
	Pessoa(){
		System.out.println("ol�");
		
	}
	
	//segundo construtor
	Pessoa(String nome){
		System.out.println("ol� "+nome);
	}

	//terceiro construtor 
	Pessoa(String nome, int idade){
		System.out.println("ol� "+nome+",voc� tem "+idade+" anos");
	}
	
}

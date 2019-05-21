package exemplo02;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		p.setNome("Ângela");
		p.setIdade(37);
		
		
		System.out.println(p.getNome()+"\n"+p.getIdade());
		
	}
}

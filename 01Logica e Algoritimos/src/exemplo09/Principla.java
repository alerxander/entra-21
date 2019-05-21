package exemplo09;

public class Principla {

	public static void main(String[] args) {
		// idade
		int idade = 16;

		/*
		 * String condicao;
		 * 
		 * if(idade >= 18) { condicao="maior de idade"; }else {
		 * condicao="menor de idade"; }
		 */

		// Operador ternario

		String condicao = idade >= 18 ? "maior de idade" : "menor de idade";

		System.out.println(condicao);

	}
}

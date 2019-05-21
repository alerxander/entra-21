package Pacote;

public class Texto {
private String palavra;

public Texto(String palavra) {
	this.palavra = palavra;
}

public void contarLetras() {
	System.out.println("A palvra "+palavra.toLowerCase()+"Possui"+palavra.length()+"letras.");
}
}

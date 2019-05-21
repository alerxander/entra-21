package beans;

public class Usuario {

	private String nome,IMC;
	private int idade;
	private Double altura,peso;
	
	//gets and sets
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	 public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIMC() {
		return IMC;
	}
	public void setIMC(String iMC) {
		IMC = iMC;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}

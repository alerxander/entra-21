package beans;

public class Jogos {

	private String nome,genero,plataforma;
	private String Classificacao,valor;
	int quantidade;
	
	//gets and sets
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getPlataforma() {
		return plataforma;
		
		
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public String getClassificacao() {
		return Classificacao;
	}
	public void setClassificacao(String classificacao) {
		Classificacao = classificacao;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	
	
}

package modelo;

public abstract class Pessoa extends Object {
	private String nome;
	private String genero;
	private int idade;
	
	public Pessoa(String nome, String genero, int idade) {
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
	}
		
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public String getGenero() {
		return genero;
	}

	public int getIdade() {
		return idade;
	}

	public String getInfo() {
		return "\nNome: " + nome + "\ngenero: " + genero + "\nIdade: " + idade;
	}

	@Override
	public String toString() {
		return ":[nome=" + nome + ", genero=" + genero + ", idade=" + idade + "]";
	}
	
}

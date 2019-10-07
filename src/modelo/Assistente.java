package modelo;

public class Assistente extends Pessoa {
	private String tipo;
	// Contrutor da classe assistente
	public Assistente(String nome, String genero, int idade, String tipo) {
		super(nome, genero, idade);
		this.tipo = tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// Sobrescreve o metedo getInfo da classe Palestrante 
	public String toString() {
		return "Assistente de " + tipo + super.toString();													
	}
	
	
}

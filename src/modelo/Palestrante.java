package modelo;

public class Palestrante extends Pessoa {
	private String descricao;
	private int anosExp;
	// Contrutor com o super de pessoa 
	public Palestrante(String nome, String genero, int idade, String descricao, int anosExp) {
		super(nome, genero, idade);
		this.descricao = descricao;
		this.anosExp = anosExp;
	}
	// Faz uma sobrecarga no construtor da classe Palestrante 
	public Palestrante(String nome, String genero, int idade) {
		super(nome, genero, idade);
	}	
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setAnosExp(int anosExp) {
		this.anosExp = anosExp;
	}
	// Faz uma sobrescrita no metodo getInfo da classe Pessoa 
	public String getInfo() {
		return "\nPalestrante" + super.getInfo() 
									+ "\nDescrição: " + descricao 
										+ "\nAnos de experiência: " + anosExp + "\n";
	}
	@Override
	public String toString() {
		return "Palestrante" + super.toString()+"descricao=" + descricao + ", anosExp=" + anosExp + "]";
	}
	
	
}

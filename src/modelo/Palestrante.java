package modelo;

public class Palestrante extends Pessoa {
	private String descricao;
	private int anosExperiencia;
	// Contrutor com o super de pessoa 
	public Palestrante(String nome, String genero, int idade, String descricao, int anosExperiencia) {
		super(nome, genero, idade);
		this.descricao = descricao;
		this.anosExperiencia = anosExperiencia;
	}
	// Faz uma sobrecarga no construtor da classe Palestrante 
	public Palestrante(String nome, String genero, int idade) {
		super(nome, genero, idade);
	}	
	
	public void setarDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setarAnosExperiencia(int anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	}
	// Faz uma sobrescrita no metodo getInfo da classe Pessoa 
	public String getInfo() {
		return "\nPalestrante" + super.getInfo() 
									+ "\nDescrição: " + descricao 
										+ "\nAnos de experiência: " + anosExperiencia + "\n";
	}
	@Override
	public String toString() {
		return "Palestrante" + super.toString()+"Descrição=" + descricao + ", Anos de experiência=" + anosExperiencia + "]";
	}
	
}

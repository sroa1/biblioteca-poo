package modelo;

import java.util.ArrayList;
import java.util.List;

public class BancoAssistentes {
	private List<Assistente> listaAssistentes; 
	
	public BancoAssistentes() {
		listaAssistentes = new ArrayList<>();
	}
	
	public void adicionar(Assistente assistente) {		
		listaAssistentes.add(assistente);			
	}
	
	public void listar() {
		int i = 0;
		for (Assistente bancoAssistentes : listaAssistentes) {
			System.out.println("Posi��o " + (i++) + " : " + bancoAssistentes.getNome());					
		}	
	}
	
	public void editar(int posicao, Assistente assistente) {
		listaAssistentes.set(posicao, assistente);
	}
	
	public void remover(int posicao) {
		listaAssistentes.remove(posicao);
	}
	
	public void consultar(int posicao) { 	
		System.out.println("Consulta de " + listaAssistentes.get(posicao));
	}

	public boolean verificarLista() {
		return listaAssistentes.isEmpty();
	}
	
	public void mostrarTamanho(Assistente Assistente) {
		System.out.println("Tamanho: " + listaAssistentes.size());
	}
}
package modelo;

import java.util.ArrayList;
import java.util.List;

public class BancoAssistentes {
	private List<Assistente> listaAssistentes; 
	
	public BancoAssistentes() {
		listaAssistentes = new ArrayList<>();
	}
	
	public void add(Assistente assistente) {		
			listaAssistentes.add(assistente);			
	}
	
	public void listAssistentes() {
		int i = 0;
		for (Assistente bancoAssistentes : listaAssistentes) {
				System.out.println("Posição " + (i++) + " : " + bancoAssistentes.getNome());					
		}	
	}
	
	public void editar(Assistente assistente, int x) {
		listaAssistentes.set(x, assistente);
	}
	
	public void remover(Assistente assistente, int x) {
		listaAssistentes.remove(x);
	}
	
	public void consultar(int z) { 	
		System.out.println("Consulta de " + listaAssistentes.get(z));
	}
	public boolean isEmpty() {
		return listaAssistentes.isEmpty();
		}
	
	public void size(Assistente Assistente) {
		System.out.println("Tamanho: " + listaAssistentes.size());
	}
}
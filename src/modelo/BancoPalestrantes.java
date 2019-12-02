package modelo;

import java.util.ArrayList;
import java.util.List;

public class BancoPalestrantes {
	private List<Palestrante> listaPalestrantes; 
	
	public BancoPalestrantes() {
		listaPalestrantes = new ArrayList<>();
	}
	
	public void adicionar(Palestrante palestrante) {		
		listaPalestrantes.add(palestrante);			
	}
	
	public void listarPalestrantes() {
		int i = 0;
		for (Palestrante bancoPalestrantes : listaPalestrantes) {
				System.out.println("Posi��o " + (i++) + " : " + bancoPalestrantes.getNome());					
		}	
	}
	
	public void editar(int posicao, Palestrante palestrante) {
		listaPalestrantes.set(posicao, palestrante);
	}
	
	public void remover(int posicao) {
		listaPalestrantes.remove(posicao);
	}
	
	public void consultar(int posicao) { 	
		System.out.println("Consulta de " + listaPalestrantes.get(posicao));
	}
	
	public boolean verificarLista() {
		return listaPalestrantes.isEmpty();
	}
	
	public void mostrarTamanho(Palestrante palestrante) {
		System.out.println("Tamanho: " + listaPalestrantes.size());
	}
	
}
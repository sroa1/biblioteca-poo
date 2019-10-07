package modelo;

import java.util.ArrayList;
import java.util.List;

public class BancoPalestrantes {
	private List<Palestrante> listaPalestrantes; 
	
	public BancoPalestrantes() {
		listaPalestrantes = new ArrayList<>();
	}
	
	public void add(Palestrante palestrante) {		
		listaPalestrantes.add(palestrante);			
	}
	
	public void listaPalestrantes() {
		int i = 0;
		for (Palestrante bancoPalestrantes : listaPalestrantes) {
				System.out.println("Posição " + (i++) + " : " + bancoPalestrantes.getNome());					
		}	
	}
	
	public void editar(int x, Palestrante palestrante) {
		listaPalestrantes.set(x, palestrante);
	}
	
	public void remover(Palestrante palestrante, int y) {
		listaPalestrantes.remove(y);
	}
	
	public void consultar(int z) { 	
		System.out.println("Consulta de " + listaPalestrantes.get(z));
	}
	
	public boolean isEmpty() {
		return listaPalestrantes.isEmpty();
	}
	
	public void size(Palestrante palestrante) {
		System.out.println("Tamanho: " + listaPalestrantes.size());
	}
	
}
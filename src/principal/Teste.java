package principal;


import modelo.Assistente;
import modelo.BancoAssistentes;
import modelo.BancoPalestrantes;
import modelo.Palestrante;

public class Teste {

	public static void main(String[] args) {
		Palestrante palestrante = new Palestrante("Junior", "Masculino", 22, "Interativo, e disposto", 5);
		Palestrante palestrante1 = new Palestrante("Shey", "F", 19, "Interativo, e disposto", 6);
		Palestrante palestrante2 = new Palestrante("Campa", "F", 18, "Interativo, e disposto", 3);
		Assistente assistente = new Assistente("Pamonha", "M", 26, "som");
		Assistente assistente1 = new Assistente("nsei", "f", 14, "som");
		
		BancoPalestrantes banco = new BancoPalestrantes();
		BancoAssistentes banco2 = new BancoAssistentes();
		
		banco.add(palestrante);
		banco.add(palestrante1);
		banco.editar(1, palestrante2);		
		banco.size(palestrante);
		banco.listaPalestrantes();
		banco.consultar(0);
		
		
		
		
		/*banco.remover(palestrante, 0);
		banco2.add(assistente);
		banco2.add(assistente1);		
		banco2.size(assistente);
		banco2.mostrarAssistentes();
		*/
		

	}

}

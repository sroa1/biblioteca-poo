package teste;
import principal.Aplicacao;
import java.util.Scanner;
import modelo.Assistente;
import modelo.BancoAssistentes;

public class MenuPrincipal extends Aplicacao{
    
		Scanner sc = new Scanner(System.in);	
		Assistente assistente = null;
		BancoAssistentes banco2 = new BancoAssistentes();
		int opcao = 0;
		int subOpcao = 0;
		int opcao2 = 0;
		int op = 0;
        
        do{
        System.out.println("-------------------------------------");
        System.out.println("Escolha um sub-opc�o a seguir!");
        System.out.println("-------------------------------------");
        System.out.println("(1)-- Criar um Assistente");
        System.out.println("(2)-- Consultar dados de um Assistente");
        System.out.println("(3)-- Atualizar um Assistente");
        System.out.println("(4)-- Remover um Assistente");
        System.out.println("(0)-- Voltar");
        System.out.println("-------------------------------------");
        subOpcao = sc.nextInt();
        while (subOpcao != 0) {

            if (subOpcao == 1) {
                // Cria um objeto assistente
                assistente = new Assistente(null, null, 0, null);
                // Set os atributos do obj assistente
                System.out.println("---------------------");
                System.out.println("Nome: ");
                assistente.setNome(sc.next());
                System.out.println("---------------------");
                System.out.println("Genero: ");
                assistente.setGenero(sc.next());
                System.out.println("---------------------");
                System.out.println("Idade: ");
                assistente.setIdade(sc.nextInt());
                System.out.println("---------------------");
                System.out.println("Tipo de assistente: ");
                assistente.setTipo(sc.next());
                System.out.println("---------------------");

                // Guarda o obj assistente para que n�o seja rescrito
                banco2.adicionar(assistente);
                System.out.println("Assistente criado!");
                System.out.println("---------------------");
                subOpcao = 0;
            }

            else if (subOpcao == 2) {
                if (banco2.verificarLista()) {
                    System.out.println("-------------------------------------");
                    System.out.println("N�o tem assistentes ainda!");
                    System.out.println("-------------------------------------");
                    subOpcao = 0;
                } else {
                    System.out.println("-------------------------------------");
                    System.out.println("Lista de assistentes:");
                    System.out.println("-------------------------------------");
                    banco2.listar();
                    System.out.println("Consulte os dados do assistente desejado:");
                    banco2.consultar(sc.nextInt());
                    System.out.println("-------------------------------------");
                    subOpcao = 0;
                }
            }

            else if (subOpcao == 3) {
                if (banco2.verificarLista()) {
                    System.out.println(
                            "A lista de Assistentes est� vazia, adicione um antes de usar essa op��o.");
                    subOpcao = 0;
                } else {
                    banco2.listar();
                    System.out.println("--------------------------------");
                    System.out.println("Editando assistente: ");
                    assistente = new Assistente(null, null, 0, null);
                    System.out.println("Nome: ");
                    assistente.setNome(sc.next());
                    System.out.println("Genero: ");
                    assistente.setGenero(sc.next());
                    System.out.println("Idade: ");
                    assistente.setIdade(sc.nextInt());
                    System.out.println("Tipo de assistente: ");
                    assistente.setTipo(sc.next());
                    System.out.println("Agora escolha a posicao que ele vai substituir");
                    banco2.editar(sc.nextInt(), assistente);
                    System.out.println("Assistente editado");
                    System.out.println("---------------------");
                    subOpcao = 0;
                }
            }

            else if (subOpcao == 4) {
                if (banco2.verificarLista()) {
                    System.out.println("-------------------------------------");
                    System.out.println("N�o h� assistentes para remover!");
                    System.out.println("-------------------------------------");
                    subOpcao = 0;
                } else {
                    System.out.println("Digite a posi��o que deseja remover o assistente.");
                    banco2.listar();
                    System.out.println("-------------------------------------");
                    banco2.remover(sc.nextInt());
                    System.out.println("Para saber se o assistente foi removido, veja a lista de assistentes.");
                    subOpcao = 0;
                }
            }
        }
    } else if (opcao == 4) {

        if (banco2.verificarLista()) {
            System.out.println("-------------------------------------");
            System.out.println("A lista de assistentes est� vazia");
            System.out.println("-------------------------------------");
            subOpcao = 0;
        } else {
            System.out.println("-------------------------------------");
            System.out.println("Lista de assistentes:");
            System.out.println();
            banco2.listar();
            System.out.println("-------------------------------------");
            subOpcao = 0;
        }
    }
} while (opcao != 0);
sc.close();
}
}
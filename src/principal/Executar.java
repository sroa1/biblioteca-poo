package principal;

import java.util.Scanner;

import modelo.Assistente;
import modelo.BancoAssistentes;
import modelo.BancoPalestrantes;
import modelo.Palestrante;

public class Executar {

	public static void main(String[] args) {
		Menu();
	}

	public static void Menu() {

		Scanner sc = new Scanner(System.in);
		Palestrante palestrante = null;
		Assistente assistente = null;
		BancoPalestrantes banco = new BancoPalestrantes();
		BancoAssistentes banco2 = new BancoAssistentes();
		int opcao = 0;
		int subOpcao = 0;
		int opcao2 = 0 ; 
		int op = 0;
		do {
			System.out.println("-------------------------------------");
			System.out.println("Escolha uma das opções abaixo!");
			System.out.println("-------------------------------------");
			System.out.println("(1)-- Palestrantes");
			System.out.println("(2)-- Lista de Palestrantes");
			System.out.println("(3)-- Assistentes");
			System.out.println("(4)-- Lista de Assistentes");
			System.out.println("(0)-- Sair");
			System.out.println("-------------------------------------");
			opcao = sc.nextInt();

			if (opcao == 1) {
				System.out.println("---------------------------------------");
				System.out.println("Escolha um sub-opcão a seguir!");
				System.out.println("---------------------------------------");
				System.out.println("(1)-- Criar um palestrante");
				System.out.println("(2)-- Consultar dados de um Palestrante");
				System.out.println("(3)-- Editar um Palestrante");
				System.out.println("(4)-- Remover um palestrante");
				System.out.println("(0)-- Voltar");
				System.out.println("---------------------------------------");
				subOpcao = sc.nextInt();

				while (subOpcao != 0) {

					if (subOpcao == 1) {
						System.out.println("-------------------------------------------------------------");
						System.out.println("Escolha o tipo de criação de palestrante");
						System.out.println("(1)-- Nome/Genero/Idade/Descrição/Anos no mercado de trabalho");
						System.out.println("(2)-- Nome/Genero/Idade");
						System.out.println("-------------------------------------------------------------");
						opcao2 = sc.nextInt();
						
						if(opcao2 == 1) {
							palestrante = new Palestrante(null, null, 0, null, 0);
							System.out.println("---------------------");
							System.out.println("Nome: ");
							palestrante.setNome(sc.next());
							System.out.println("---------------------");
							System.out.println("Genero: ");
							palestrante.setGenero(sc.next());
							System.out.println("---------------------");
							System.out.println("Idade: ");
							palestrante.setIdade(sc.nextInt());
							System.out.println("---------------------");
							System.out.println("Descriçao: ");
							palestrante.setDescricao(sc.next());
							System.out.println("---------------------");
							System.out.println("Anos de experiência no mercado de trabalho: ");
							palestrante.setAnosExp(sc.nextInt());
						
							//banco 
							banco.add(palestrante);
							System.out.println("Palestrante criado");
							System.out.println("---------------------");
							subOpcao = 0;
							}
						else if(opcao2 == 2) {
							palestrante = new Palestrante (null,null, 0);				
							System.out.println("---------------------");
							System.out.println("Nome: ");
							palestrante.setNome(sc.next());
							System.out.println("---------------------");
							System.out.println("Genero: ");
							palestrante.setGenero(sc.next());
							System.out.println("---------------------");
							System.out.println("Idade: ");
							palestrante.setIdade(sc.nextInt());
							System.out.println("---------------------");				
							banco.add(palestrante); 
							System.out.println("Palestrante criado");
							System.out.println("---------------------");
							subOpcao = 0;
						}
					}	
						

					else if (subOpcao == 2) {
						if(banco.isEmpty()) {
							System.out.println("-------------------------------------");
							System.out.println("Não tem Palestrantes ainda!");
							System.out.println("-------------------------------------");
							subOpcao = 0;
						}else {
							System.out.println("-------------------------------------");
							System.out.println("Lista de Palestrantes:");
							System.out.println("-------------------------------------");
							banco.listaPalestrantes();
							System.out.println("Consulte os dados do palestrante desejado:");
							banco.consultar(sc.nextInt());
							System.out.println("-------------------------------------");
							System.out.println("(0)-- Voltar ao menu");
							subOpcao = sc.nextInt();
							
						}
					}

					else if (subOpcao == 3) {										
						if (banco.isEmpty()) {
							System.out.println("Não há palestrantes para editar");
						} 				
						else {
							System.out.println("-------------------------------------------------------------");
							System.out.println("Escolha o novo tipo de edição de palestrante");
							System.out.println("(1)-- Nome/Genero/Idade/Descrição/Anos no mercado de trabalho");
							System.out.println("(2)-- Nome/Genero/Idade");
							System.out.println("-------------------------------------------------------------");
							op = sc.nextInt();
							if(op == 1) {
								palestrante = new Palestrante(null, null, 0, null, 0);
								System.out.println("---------------------");
								System.out.println("Nome: ");
								palestrante.setNome(sc.next());
								System.out.println("---------------------");
								System.out.println("Genero: ");
								palestrante.setGenero(sc.next());
								System.out.println("---------------------");
								System.out.println("Idade: ");
								palestrante.setIdade(sc.nextInt());
								System.out.println("---------------------");
								System.out.println("Descriçao: ");
								palestrante.setDescricao(sc.next());
								System.out.println("---------------------");
								System.out.println("Anos de experiência no mercado de trabalho: ");
								palestrante.setAnosExp(sc.nextInt());
								System.out.println("Agora escolha a posicao que ele vai substituir");
								banco.editar(sc.nextInt(), palestrante);
								System.out.println("Palestrante editado");
								System.out.println("---------------------");
								subOpcao = 0;							
							}
							else if(op == 2){
							banco.listaPalestrantes();
							System.out.println("--------------------------------");
							palestrante = new Palestrante(null, null, 0);
							System.out.println("Nome: ");
							palestrante.setNome(sc.next());
							System.out.println("Genero: ");
							palestrante.setGenero(sc.next());
							System.out.println("Idade: ");
							palestrante.setIdade(sc.nextInt());
							System.out.println("Agora escolha a posicao que ele vai substituir");
							banco.editar(sc.nextInt(), palestrante);
							System.out.println("Palestrante editado");
							System.out.println("---------------------");
							subOpcao = 0;
							}
							
						}
					}

					else if (subOpcao == 4) {
						if (banco.isEmpty()) {
							System.out.println("---------------------------------");
							System.out.println("Não há palestrantes para remover!");
							System.out.println("---------------------------------");
							subOpcao = 0;
						} else {
							System.out.println("--------------------------------------------------");
							System.out.println("Digite a posição que deseja remover o palestrante.");
							banco.listaPalestrantes();
							System.out.println("--------------------------------------------------");
							banco.remover(palestrante, sc.nextInt());
							System.out.println("-------------------------------------------------------------------------");
							System.out.println("*Para saber se o palestrante foi removido, veja a lista de Palestrantes.*");
							System.out.println("-------------------------------------------------------------------------");
							subOpcao = 0;
						}
					}
				}
			} else if (opcao == 2) {

				if (banco.isEmpty()) {
					System.out.println("--------------------------------");
					System.out.println("Não há palestrantes nessa lista!");
					System.out.println("--------------------------------");
					System.out.println();
					subOpcao = 0;
				} else {
					System.out.println();
					System.out.println("--------------------------------");
					System.out.println("Lista de palestrantes: ");
					System.out.println("--------------------------------");
					banco.listaPalestrantes();
					System.out.println("--------------------------------");
					subOpcao = 0;
				}
			} else if (opcao == 3) {
				System.out.println("-------------------------------------");
				System.out.println("Escolha um sub-opcão a seguir!");
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
						
						// Guarda o obj assistente para que não seja rescrito
						banco2.add(assistente);
						System.out.println("Assistente criado!S");
						System.out.println("---------------------");
						subOpcao = 0;
					}

					else if (subOpcao == 2) {
						if(banco2.isEmpty()) {
							System.out.println("-------------------------------------");
							System.out.println("Não tem assistentes ainda!");
							System.out.println("-------------------------------------");
							subOpcao = 0;
						}else {
							System.out.println("-------------------------------------");
							System.out.println("Lista de assistentes:");
							System.out.println("-------------------------------------");
							banco2.listAssistentes();
							System.out.println("Consulte os dados do assistente desejado:");
							banco2.consultar(sc.nextInt());
							System.out.println("-------------------------------------");
							subOpcao = 0;
						}
						
					}

					else if (subOpcao == 3) {

						if (banco2.isEmpty()) {
							System.out.println("A lista de Assistentes está vazia, adicione um antes de usar essa opção.");
							subOpcao = 0;
						} else {														
							banco2.listAssistentes();
							System.out.println("--------------------------------");
							System.out.println("Editando assisntente: ");
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
							banco2.editar(assistente, sc.nextInt());
							System.out.println("Assistente editado");
							System.out.println("---------------------");
							subOpcao = 0;
						}
					}

					else if (subOpcao == 4) {
						if (banco2.isEmpty()) {
							System.out.println("-------------------------------------");
							System.out.println("Não há assistentes para remover!");
							System.out.println("-------------------------------------");
							subOpcao = 0;
						} else {
							System.out.println("Digite a posição que deseja remover o assistente.");
							banco2.listAssistentes();
							System.out.println("-------------------------------------");
							banco2.remover(assistente, sc.nextInt());
							System.out.println("Para saber se o assistente foi removido, veja a lista de assistentes.");
							subOpcao = 0;
						}
					}
				}
			}
			else if(opcao == 4) {
				
				if (banco2.isEmpty()) {
					System.out.println("-------------------------------------");
					System.out.println("A lista de assistentes está vazia");
					System.out.println("-------------------------------------");
					subOpcao =0;
				} else {
					System.out.println("-------------------------------------");
					System.out.println("Lista de assistentes:");
					System.out.println();
					banco2.listAssistentes();
					System.out.println("-------------------------------------");
					subOpcao = 0;
				}
			}
		} while (opcao != 0);
		sc.close();
	}
}
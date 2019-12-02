package teste;

import java.util.Scanner;

import modelo.Assistente;
import modelo.BancoAssistentes;
import modelo.BancoPalestrantes;
import modelo.Palestrante;

public class Teste2 {

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
		do {
			System.out.println("-------------------------------------");
			System.out.println("Escolha uma das op��es abaixo!");
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
				System.out.println("Escolha um sub-opc�o a seguir!");
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
						System.out.println("Escolha o tipo de cria��o de palestrante");
						System.out.println("(1)-- Nome/Genero/Idade/Descri��o/Anos no mercado de trabalho");
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
							System.out.println("Descri�ao: ");
							palestrante.setDescricao(sc.next());
							System.out.println("---------------------");
							System.out.println("Anos de experi�ncia no mercado de trabalho: ");
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
							System.out.println("N�o tem Palestrantes ainda!");
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
							System.out.println("N�o h� palestrantes para editar");
						} else {
							System.out.println("Editando..");
							banco.listaPalestrantes();
							subOpcao = 0;
						}
					}

					else if (subOpcao == 4) {
						if (banco2.isEmpty()) {
							System.out.println("N�o h� palestrantes para remover!");
						} else {
							System.out.println("Digite a posi��o que deseja remover o palestrante.");
							banco2.listAssistentes();
							banco2.remover(assistente, sc.nextInt());
							System.out.println("*Para saber se o palestrante foi removido, veja a lista.*");

							System.out.println();
						}
					}
				}
			} else if (opcao == 2) {

				if (banco2.isEmpty()) {
					System.out.println("--------------------------------");
					System.out.println("N�o h� palestrantes nessa lista!");
					System.out.println("--------------------------------");
					System.out.println();
				} else {
					System.out.println();
					System.out.println("--------------------------------");
					System.out.println("Lista de palestrantes: ");
					System.out.println("--------------------------------");
					banco2.listAssistentes();
					System.out.println("--------------------------------");
					subOpcao = 0;
				}
			} else if (opcao == 3) {
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
						banco2.add(assistente);
						System.out.println("Assistente criado!S");
						System.out.println("---------------------");
						subOpcao = 0;
					}

					else if (subOpcao == 2) {
						if(banco2.isEmpty()) {
							System.out.println("-------------------------------------");
							System.out.println("N�o tem assistentes ainda!");
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
							System.out.println("(0)-- Voltar ao menu");
							subOpcao = sc.nextInt();
							
						}
						
					}

					else if (subOpcao == 3) {

						if (banco2.isEmpty()) {
							System.out.println("A lista de Assistentes est� vazia");
						} else {
							System.out.println("Atualizar um assistente:");
							banco2.editar(assistente, sc.nextInt());
							subOpcao = 0;
						}
					}

					else if (subOpcao == 4) {
						if (banco2.isEmpty()) {
							System.out.println("-------------------------------------");
							System.out.println("N�o h� assistentes para remover!");
							System.out.println("-------------------------------------");
						} else {
							System.out.println("Digite a posi��o que deseja remover o assistente.");
							banco2.listAssistentes();
							System.out.println("-------------------------------------");
							banco2.remover(assistente, sc.nextInt());
							System.out.println("Para saber se o assistente foi removido, veja a lista de assistentes.");
							System.out.println();
						}
					}
				}
			}
			else if(opcao == 4) {
				
				if (banco2.isEmpty()) {
					System.out.println("-------------------------------------");
					System.out.println("A lista de assistentes est� vazia");
					System.out.println("-------------------------------------");
				
				} else {
					System.out.println("-------------------------------------");
					System.out.println("Lista de assistentes");
					System.out.println("-------------------------------------");
					banco2.listAssistentes();
					System.out.println("-------------------------------------");
					subOpcao = 0;
				}
			}
		} while (opcao != 0);
		sc.close();
	}
}
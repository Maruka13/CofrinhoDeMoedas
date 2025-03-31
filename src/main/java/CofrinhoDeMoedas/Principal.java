package main.java.CofrinhoDeMoedas;

//bibliotecas
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);  // instância de scanner
		Cofrinho cofrinho = new Cofrinho();        // instância de cofrinho
		System.out.printf("Cofrinho de moedas%n%n");
		
		while(true) {
		
			try {
				System.out.printf("Selecione a operação desejada! %n"
						+ "1 - Adicionar moedas %n"
						+ "2 - Remover moedas %n"
						+ "3 - Listar moedas %n"
						+ "4 - Converter tudo para reais %n"
						+ "5 - Sair %n");
				
				int acao = scanner.nextInt();
				
				// adicionar moedas
				
				if(acao == 1) {         
					System.out.printf("%nQual a moeda a ser adicionada? %n"
							+ "1 - Dolar %n"
							+ "2 - Euro %n"
							+ "3 - Real %n");
					int tipoMoeda = scanner.nextInt();
					
					System.out.printf("%nQuanto você deseja adicionar?%n"
							+ "Separar casas decimais com vírgula!%n");
					double adicionarMoeda = scanner.nextDouble();
					
					cofrinho.adicionarMoedas(tipoMoeda, adicionarMoeda);
					
				// remover moedas	
					
				} else if(acao == 2) {    
					System.out.printf("%nQual moeda a ser removida? %n"
							+ "1 - Dolar %n"
							+ "2 - Euro %n"
							+ "3 - Real %n");
					int tipoMoeda = scanner.nextInt();
					
					System.out.printf("%nQuanto você deseja remover?%n"
							+ "Separar casas decimais com vírgula!%n");
					double removerMoeda = scanner.nextDouble();
					
					cofrinho.removerMoedas(tipoMoeda, removerMoeda);
					
				} else if(acao == 3) {       // listar moedas
					System.out.println();    // quebra de linha
					cofrinho.listagemMoedas();
				} else if(acao == 4) {       // converter dinheiro para reais
					System.out.println();    // quebra de linha
					cofrinho.totalConvertido();
				} else if(acao == 5) {       // encerrar programa
					break;
				} else {
					System.out.println("Opção inválida");
				}
				
				System.out.println();        // quebra de linha
				
				} catch(InputMismatchException e) {    //exceção 
				
				System.out.printf("%nSeparar casas decimais com vírgula!%n"); 
				break; // se user separar decimais com "." ao invés de "," e encerra o programa
			}
		}
		
		scanner.close();
		
		System.out.println();
		
		System.out.println("Fim do processo!");
	}

}
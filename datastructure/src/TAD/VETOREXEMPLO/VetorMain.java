package TAD.VETOREXEMPLO;

import java.util.Random;
import java.util.Scanner;

public class VetorMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int tamanho, minimo, maximo, vaga, repete;
		
		while (true) {
			System.out.println("================================================");
            System.out.println("      CONFIGURAÇÕES INICIAIS DO VETOR");
            System.out.println("================================================");
            
            //* TAMANHO DO VETOR
            System.out.print("\nTamanho do vetor: ");
            tamanho = scn.nextInt();
            if (tamanho <= 0) {
            	System.out.println("ERRO: Vetor deve ter tamanho maior que zero!!");
            	continue;
            }
            
            //* VALORES MÍNIMO E MÁXIMO
            System.out.print("\nValor mínimo no vevtor: ");
            minimo = scn.nextInt();
            System.out.print("\nValor máximo no vetor: ");
            maximo = scn.nextInt();
            if(minimo > maximo) {
            	System.out.println("ERRO: Valor máximo deve ser maior qo valor mínimo");
            	continue;
            }
            
            //* VALOR INDICATIVO DE POSIÇÃO VAGA
            System.out.println("\nValor indicativo de posição vaga:");
            vaga = scn.nextInt():
            	if(vaga >= minimo && vaga <= maximo) {
            		System.out.println("ERRO: Valor indicativo de posição vaga não pode estar no intervalo de valores válidos!!");
            		continue;
            	}
            
            //* POSSIBILIDADE OU NÃO DE REPETIÇÃO
            System.out.print("\nPode haver repetição de valores (1) ou não (2)? ");
            repete = scn.nextInt();
            if (repete < 1 || repete > 2) {
            	System.out.println("ERRO: Valor inválido. Informe 1 ou 2.");
            	continue;
            }
            
            break;
            
            }
		
			VetorTAD vetor = new VetorTAD(tamanho, minimo, maximo, vaga, repete);
			
			while(true) {
				System.out.println("===================================================");
	            System.out.println("            Estudo do TAD Vetor");
	            System.out.println("===================================================");
	            System.out.println("0 - Encerrar");
	            System.out.println("1 - Atribuir um valor a determinada posição.");
	            System.out.println("2 - Alterar o valor de determinada posição.");
	            System.out.println("3 - Remover o valor de determinada posição (atribui o valor indicativo de posição vaga).");
	            System.out.println("4 - Ler o conteúdo de uma posição.");
	            System.out.println("5 - Localizar um valor e retornar sua posição (se permitir repetição tem que retornar todos).");
	            System.out.println("6 - Inserir na primeira posição vaga (busca no sentido 0 → N).");
	            System.out.println("7 - Remover da última posição ocupada (busca no sentido 0 → N).");
	            System.out.println("8 - Imprimir o conteúdo do vetor.");
	            
				System.out.println("\n Sua opção:");
				int opc = scn.nextInt();
				
				if(opc == 0) {
					break;
				} else if(opc == 1) {
					System.out.println("=== A T R I B U I Ç Ã O ===");
					System.out.print("Valor: ");
					int valor = scn.nextInt();
					System.out.print("Posição: ");
					int posicao = scn.nextInt();
					Utils.printRet(vetor.armazenar(valor,  posicao));
				} else if(opc == 2) {
					System.out.println("=== A L T E R A Ç Ã O ===");
					System.out.println("Valor: ");
					int vvalor = scn.nextInt();
					System.out.print("Posição: ");
					int posicao = scn.nextInt();
					Utils.printRet(vetor.alterar(valor,posicao));
				} else if(opc == 3) {
					System.out.println("=== R E M O Ç Ã O ===");
					System.out.print("Posição a remover: ");
					int posicao = scn.nextInt();
					Utils.printRet(vetor.excluir(posicao));
				} else if(opc == 4) {
					System.out.println("=== C O N T E Ú D O ===");
					System.out.println("Posição a ler: ");
					int posicao = scn.nextInt();
					System.out.println("Posição " + posicao + "contém " + vetor.ler(posicao));
				} else if(opc == 5) {
					System.out.println("===   L O C A L I Z A N D O UM V A L O R   ===");
					System.out.print("Valor a localizar: ");
					int valor = scn.nextInt();
					int[] valores == vetor.localizar(valor,0);
					if (valores[0] == 0) {
						System.out.println("\n\nVALOR NÃO LOCALIZADO.\n\n");
					} else {
						System.out.println("\n\n===   VALORES ENCONTRADOS NOS ÍNDICES ABAIXO   ===");
						for (int i = 1; i < valores.length; i++) {
							if (valores[i] == 0) {
								break;
							}
							System.out.print(valores[i] + " ");
						}
						System.out.println("\n" + valores[0] + " valor(es) encontrado(s).");
					}
				} else if (opc == 6) {
					System.out.println("===   INSERINDO NA PRIMEIRA POSIÇÃO VAGA   ===");
					System.out.println("Valor a inserir: ");
					int valor = scn.nextInt();
					Utils.printRet(vetor.armazenar1Vaga(valor));
				} else if (opc == 7) {
					System.out.println("===   REMOVENDO DA ÚLTIMA POSIÇÃO OCUPADA   ===");
					Utils.printRet(vetor.removerUltima());
				} else if (opc == 8) {
					for (int i = 0; i < tamanho; i++) {
						System.out.println(i + " = " + vetor.ler(i));
					}
				} else if(opc == 99) {
					vetor.limparVetor();
					Random seed = new Random();
					for (int i = 0; i < tamanho; i++) {
						vetor.armazenar(minimo + seed.nextInt(maximo + 1 - minimo), i);
					}
				}
			}
			
			System.out.println("\n\n---   F I M   ---");
	        System.out.println("Obrigado e até a próxima.\n\n");
		}
	}

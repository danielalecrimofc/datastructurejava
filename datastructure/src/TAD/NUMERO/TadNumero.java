package TAD.NUMERO;
import java.util.Scanner;
public class TadNumero {
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		
		Numero numero = new Numero();
		
		boolean rodando = true;
		
		while (rodando) {
			System.out.println("==============================================");
			System.out.println("           Estudo do TAD Numero");
			System.out.println("==============================================");
			System.out.println("0 - encerrar");
			System.out.println("1 - ler valor");
			System.out.println("2 - atribuir valor");
			
			System.out.println("Qual sua opção? ");
			
			int opc = entry.nextInt();
			
			switch (opc) {
				case 0:
					entry.close();
					rodando = false; // Dá fim ao laço while
					break; // Dá fim a estrutura Switch
				case 1:
					System.out.println("\n\n" + numero.getValor() + "\n\n");
					break;
				case 2:
					System.out.print("Forneça o novo valor: ");
					float v = entry.nextFloat();
					numero.setValor(v);
					break;
				default:
					System.out.println("Opção Inválida!");
					break;
			}
		}
		
		System.out.println("--- FIM ---");
		System.out.println("Até a próxima");
	}
}

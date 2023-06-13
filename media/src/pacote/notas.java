package pacote;
import java.util.Scanner;

public class notas {

	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);
				
		String nomeAluno, disciplina;
		int media;
		int nota1 = 8;
		int nota2 = 9;
		int nota3 = 8;
		int nota4 = 7;
				
				
				
			media = (nota1 + nota2 + nota3 + nota4) / 4;
				
			System.out.println( " MÉDIA: " + media);
				
			if (media > 7) {
				System.out.println("ALUNO APROVADO");
					
			}else if (media >=5 && media <=7) {
			System.out.println("ALUNO DE RECUPERAÇÃO");
			}
				
			else if (media <5) {
			System.out.println("ALUNO REPROVADO");
			}
				
		
			}
			
	}
		

package pacote;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner objScanner = new Scanner(System.in);
		String planos;
		
		System.out.println("DIGITE SEU PLANO");
				
		planos = objScanner.next();
		
		if(planos.equalsIgnoreCase("basico")) {
			System.out.println("VALOR 150,00");
		}
		
		else if(planos.equalsIgnoreCase("bronze")) {
			System.out.println("VALOR 220,00");	
		}
		
		else if(planos.equalsIgnoreCase("prata")) {
			System.out.println("VALOR 310,00");	
		}
		
		else if(planos.equalsIgnoreCase("ouro")) {
			System.out.println("VALOR 450,00");	
		}
		
		else {
			System.out.println("PLANO INVALIDO");
		}	

	}

}

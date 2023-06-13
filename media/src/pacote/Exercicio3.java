package pacote;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner objScanner =  new Scanner(System.in);
		String codigo;
		
		double salario = 0, total = 0, x, y;
		
		codigo =  JOptionPane.showInputDialog("DIGITE O CODIGO:");
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("DIGITE SEU SALARIO:"));
		
		switch (codigo) {
		case "1":
			y = salario;
			x = y / 100;
			total = salario + (x * 50);
			JOptionPane.showInputDialog(null,"SEU CARGO É : Escrituario  " + "SEU SALARIO ATUAL: " + total + "AUMENTO DE 50%");
			
			break;
			
		case "2":
			y = salario;
			x = y / 100;
			total = salario + (x * 35);
			JOptionPane.showInputDialog(null,"SEU CARGO É: Secretário" + "SEU SALARIO ATUAL: " + total + "  AUMENTO DE 35%");
			
			break;
			
			
		case "3":
			y = salario;
			x = y / 100;
			total = salario + (x * 20);
			JOptionPane.showInputDialog(null,"SEU CARGO É: Caixa" + "SEU SALARIO ATUAL" + total + "AUMENTO DE 20%");
			
			break;
			
			
		case "4":
			y = salario;
			x = y / 100;
			total = salario + (x * 10);
			JOptionPane.showInputDialog(null,"SEU CARGO É: Gerente" + "SEU SALARIO ATUAL" + total + "AUMENTO DE 10%");
			
			break;
			
			
		case "5":
			y = salario;
			x = y / 100;
			total = salario + (x * 0);
			JOptionPane.showInputDialog(null,"SEU CARGO É: Diretor" + "SEU SALARIO ATUAL" + total + "AUMENTO DE 0%");
			
			break;
			
			
		
			
		}
	

	}

}

package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o dia da Semana: ");
		String Dia = entrada.next();
		
		if(Dia.toLowerCase().equals("domingo")) {
			System.out.println("� o primeiro dia.");
		}else if(Dia.equalsIgnoreCase("Segunda")) {
			System.out.println("� o dia 2.");
		}else if(Dia.equalsIgnoreCase("Ter�a") || Dia.equalsIgnoreCase("Terca")) {
			System.out.println("� o dia 3.");
		}else if(Dia.equalsIgnoreCase("Quarta")) {
			System.out.println("� o dia 4.");
		}else if(Dia.equalsIgnoreCase("Quinta")) {
			System.out.println("� o dia 5.");
		}else if(Dia.equalsIgnoreCase("Sexta")) {
			System.out.println("� o dia 6.");
		}else if(Dia.equalsIgnoreCase("S�bado") || Dia.equalsIgnoreCase("Sabado")) {
			System.out.println("� o dia 7.");
		}else {
			System.out.println("� um dia inv�lido.");
		}
			
		System.out.println("Obrigado pro mencionar o dia");	
		entrada.close();
	}
}

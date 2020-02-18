package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o dia da Semana: ");
		String Dia = entrada.next();
		
		if(Dia.toLowerCase().equals("domingo")) {
			System.out.println("É o primeiro dia.");
		}else if(Dia.equalsIgnoreCase("Segunda")) {
			System.out.println("É o dia 2.");
		}else if(Dia.equalsIgnoreCase("Terça") || Dia.equalsIgnoreCase("Terca")) {
			System.out.println("É o dia 3.");
		}else if(Dia.equalsIgnoreCase("Quarta")) {
			System.out.println("É o dia 4.");
		}else if(Dia.equalsIgnoreCase("Quinta")) {
			System.out.println("É o dia 5.");
		}else if(Dia.equalsIgnoreCase("Sexta")) {
			System.out.println("É o dia 6.");
		}else if(Dia.equalsIgnoreCase("Sábado") || Dia.equalsIgnoreCase("Sabado")) {
			System.out.println("É o dia 7.");
		}else {
			System.out.println("É um dia inválido.");
		}
			
		System.out.println("Obrigado pro mencionar o dia");	
		entrada.close();
	}
}

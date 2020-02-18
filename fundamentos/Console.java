package fundamentos;

import java.util.Scanner;

public class Console 
{
	public static void main(String[] args) 
	{
		System.out.print("Bom");
		System.out.print(" dia\n\n ");
		
		System.out.println("Bom");
		System.out.println("dia!");
		//%n quebra linha
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3,4, 5, 6);
		System.out.printf("\nSalário: %.1f %n", 1234.567);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite o seu idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%n %s  %d", nome, idade);
		
		entrada.close();
	}
}

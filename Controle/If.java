package Controle;

import java.util.Scanner;

public class If 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a m�dia: ");
		double media = entrada.nextDouble();
				
		if (media <= 10 && media >= 7.0) 
		{
			System.out.println("Aprovado!");
			System.out.println("Parab�ns!");
		}
		
		boolean criterioReprovacaoAtingida = media < 7.0 && media >= 4.5;
		if(criterioReprovacaoAtingida)
		{
			System.out.println("Recupera��o!");			
		}
		
		if(media < 4.5 && media >= 0.0)
		{
			System.out.println("Reprovado!");
		}
		entrada.close();
			
	}
}

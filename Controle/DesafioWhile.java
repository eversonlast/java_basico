package Controle;

import java.util.Scanner;

public class DesafioWhile
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		double total = 0;
		double nota = 0;
		double contador = 0;
		
		while (!(nota == -1)) {
			System.out.print("Por favor digite a nota: ");
			nota = entrada.nextDouble();
			if (nota <=10 && nota >= 0) { 
			total = total + nota;				
			contador ++;
			}else if(nota != -1 ) {
				System.out.println("Nota inválida!!!");
			}
		}
		
		double media = total / contador;		
		System.out.println("A média das notas é: " + media);		
		System.out.println("Saiu do programa!!");
		
		entrada.close();

	}
}

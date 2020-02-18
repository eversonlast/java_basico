package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora 
{
	//ler numero 1
	//ler numero 2
	//saber qual operação ele vai escolher
	
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		String num1 = entrada.next();
		System.out.println("Digite o segundo número: ");
		String num2 = entrada.next();
		System.out.println("Por favor digite a operação desejada: ");
		String operacao = entrada.next();
		
		boolean mais  = operacao.equals("+");
		boolean menos = operacao.equals("-");
		boolean vezes = operacao.equals("*");
		boolean dividi = operacao.equals("/");
		boolean mod = operacao.equals("%");
				
		int numero1 = Integer.parseInt(num1);
		int numero2 = Integer.parseInt(num2);
		
		
		String resutaldoOperacaoModulo = mod ? Integer.toString(numero1 % numero2) : "Você escolheu nenhuma operação válida" ;
		String resutaldoOperacaoDividir = dividi ? Integer.toString(numero1 / numero2) :resutaldoOperacaoModulo ;
		String resutaldoOperacaoVezes = vezes ? Integer.toString(numero1 * numero2) : resutaldoOperacaoDividir ;
		String resultadoOperacaoMenos = menos ? Integer.toString(numero1 - numero2) : resutaldoOperacaoVezes;
		String resultadoOperacaoMais = mais ? Integer.toString(numero1 + numero2) : resultadoOperacaoMenos;
		
		System.out.println(resultadoOperacaoMais);		
		
		 entrada.close();
		 /*
		  Scanner entrada = new Scanner(System.in);
		  System.out.print("Informe o primeiro número: ");
		  double num1 = entrada.nextDouble();
		  System.out.print("Informe o segundo número: ");
		  double num2 = entrada.nextDouble();
		  System.out.print("Informe a opeção: ");
		  String op = entrada.next();
		  
		 //Lógica 
		  * double resultado = "+".equals(op) ? num1 + num2 : 0;
		  * resultado = "-".equals(op) ? num1 - num2 : resultado;
		  * resultado = "*".equals(op) ? num1 * num2 : resultado;
		  * resultado = "/".equals(op) ? num1 / num2 : resultado;
		  * resultado = "%".equals(op) ? num1 % num2 : resultado;
		  * 
		  System.out.printf( "%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		  entrada.close();		   */
		
	}
}

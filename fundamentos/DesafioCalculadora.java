package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora 
{
	//ler numero 1
	//ler numero 2
	//saber qual opera��o ele vai escolher
	
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		String num1 = entrada.next();
		System.out.println("Digite o segundo n�mero: ");
		String num2 = entrada.next();
		System.out.println("Por favor digite a opera��o desejada: ");
		String operacao = entrada.next();
		
		boolean mais  = operacao.equals("+");
		boolean menos = operacao.equals("-");
		boolean vezes = operacao.equals("*");
		boolean dividi = operacao.equals("/");
		boolean mod = operacao.equals("%");
				
		int numero1 = Integer.parseInt(num1);
		int numero2 = Integer.parseInt(num2);
		
		
		String resutaldoOperacaoModulo = mod ? Integer.toString(numero1 % numero2) : "Voc� escolheu nenhuma opera��o v�lida" ;
		String resutaldoOperacaoDividir = dividi ? Integer.toString(numero1 / numero2) :resutaldoOperacaoModulo ;
		String resutaldoOperacaoVezes = vezes ? Integer.toString(numero1 * numero2) : resutaldoOperacaoDividir ;
		String resultadoOperacaoMenos = menos ? Integer.toString(numero1 - numero2) : resutaldoOperacaoVezes;
		String resultadoOperacaoMais = mais ? Integer.toString(numero1 + numero2) : resultadoOperacaoMenos;
		
		System.out.println(resultadoOperacaoMais);		
		
		 entrada.close();
		 /*
		  Scanner entrada = new Scanner(System.in);
		  System.out.print("Informe o primeiro n�mero: ");
		  double num1 = entrada.nextDouble();
		  System.out.print("Informe o segundo n�mero: ");
		  double num2 = entrada.nextDouble();
		  System.out.print("Informe a ope��o: ");
		  String op = entrada.next();
		  
		 //L�gica 
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

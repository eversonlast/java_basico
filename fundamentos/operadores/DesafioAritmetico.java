package fundamentos.operadores;

public class DesafioAritmetico 
{
	public static void main(String[] args) 
	{
		var a = 2;
		var b = 3;
		var c = 5;
		var d = 6;
		var f = 7;
		var g = 10;
		var h = 1;
		
		double soma  = b+a;
		double multiplicacao = soma *d;
		double potencia1 = Math.pow(multiplicacao, a);
		double divisao1 = potencia1 / (a*b);
		System.out.println(divisao1);
		
		double subtração1 = h -c;
		double subtração2 = a - f;
		double multiplicacao2 = subtração1 * subtração2;
		double divisao = multiplicacao2 /a;
		double potencia4 = Math.pow(divisao, a);
		System.out.println(potencia4);
		
		double resultado1 = divisao1 - potencia4;
		double potencia2 = Math.pow(resultado1, b);
		
		double potencia3 = Math.pow(g, b);
		
		double divisao3 = potencia2 / potencia3;
		System.out.println(divisao3);
		
		double resultado3 = (Math.pow((Math.pow((d*(a+b)), a)/(a*b))- Math.pow((((h-c)*(a-f))/a), 2), 3))/Math.pow(g, b);
		System.out.println(resultado3);
		
	}
}

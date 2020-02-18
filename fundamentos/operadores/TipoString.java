package fundamentos.operadores;

import java.util.Scanner;

public class TipoString 
{
	public static void main(String[] args) 
	{
		System.out.println("2" == "2");
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner(System.in);
			String s2 = entrada.next();//Tira os espaços 
			System.out.println("2" == s2);
			System.out.println("2".equals(s2));
		/*	
			String s3 = entrada.nextLine();//Não tira os espaços
			System.out.println("2" == s3);
			System.out.println("2".equals(s3.trim())); é uma notação ponto que retira os espaços
		*/
		entrada .close();
	}
}

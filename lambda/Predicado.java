package lambda;

import java.util.function.Predicate;

public class Predicado 
{
	public static void main(String[] args) 
	{
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto))>=700;
		
		Produto produto1 = new Produto("Notebook", 3893.89, 0.95);
		System.out.println(isCaro.test(produto1));
	}
	
	
}
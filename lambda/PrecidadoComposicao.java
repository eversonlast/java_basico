package lambda;

import java.util.function.Predicate;

public class PrecidadoComposicao 
{
	public static void main(String[] args) 
	{
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer>  isTresDigitos = num -> num >=100 && num <= 999;
		
		System.out.println(isPar.test(22));
		System.out.println(isPar.and(isTresDigitos).test(22));
		System.out.println(isPar.and(isTresDigitos).negate().test(124));
		System.out.println(isPar.or(isTresDigitos).test(124));
	}
}

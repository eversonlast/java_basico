package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MapDesafio 
{
	public static void main(String[] args) 
	{
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		/*
		 * 1. Numero para string bin�ria ... 6=>"110"
		 * 2. Reverter a string.. "110"=>"011"
		 * 3. Converte de volta para inteiro => "011"=> 3
		 Integer.
		 */
		UnaryOperator<String> inverte = 
				s -> new StringBuilder(s).reverse().toString();
		
		Function<String, Integer> binarioParaInt = 
				s->Integer.parseInt(s, 2);
				
		nums.stream()
			.map(Integer::toBinaryString)
			.map(inverte)
			.map(binarioParaInt)
			.forEach(System.out::println);
	}
}

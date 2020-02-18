package lambda;

import java.util.function.Function;

public class Funcao
{
	public static void main(String[] args) 
	{
		Function<Integer, String> parOUImpar = 
				numero -> numero % 2 == 0 ? "Par" : "Ímpar";
		
		System.out.println(parOUImpar.apply(32));
		
		Function<String, String> oResultadoE = 
				valor -> "O valor do Resultado é " + valor;
		
		Function<String, String> empolgado = 
				valor -> valor + "!!!";
		
		Function<String, String> duvida = 
				valor -> valor + "???";
		String resutaldoFinal = parOUImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(32);
		
		String resutaldoFinal2 = parOUImpar
				.andThen(oResultadoE)
				.andThen(duvida)
				.apply(33);
		System.out.println(resutaldoFinal2);
		System.out.println(resutaldoFinal);
	}
}

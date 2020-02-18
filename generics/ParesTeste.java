package generics;

public class ParesTeste 
{
	public static void main(String[] args) {
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Maria");
		resultadoConcurso.adicionar(2, "Pedro");
		resultadoConcurso.adicionar(3, "João");
		resultadoConcurso.adicionar(4, "Jean");
		resultadoConcurso.adicionar(2, "Ana");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(2));
	}
}

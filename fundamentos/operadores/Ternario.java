package fundamentos.operadores;

public class Ternario
{
	public static void main(String[] args)
	{
		double media = 4.6;
		String resultadoParcial = media >= 5.0 ? "Recupera��o" : "Reprovado";
		
		String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial;
		System.out.println("O aluno est� " + resultadoFinal);
		
		double nota = 4.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim" : "N�o";
		
		System.out.printf("Tem Desconto? %s", resultado);
		
		
	}
}

package fundamentos;

public class AreaCircunferencia 	
{
	public static void main(String[] args) 
	{
		double raio = 3.4;
		final double PI = 3.14159; //Definir uma constante em Java coloca antes da declaração final e por convenção constante colocar em Letras maiusculas
		
		double area = PI*raio*raio;
		System.out.println(area);
		
		raio = 10;
		area = PI*raio*raio;
		System.out.println("A área da circunferência é = " + area+"m2"); //Concatenação
	}
}

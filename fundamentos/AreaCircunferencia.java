package fundamentos;

public class AreaCircunferencia 	
{
	public static void main(String[] args) 
	{
		double raio = 3.4;
		final double PI = 3.14159; //Definir uma constante em Java coloca antes da declara��o final e por conven��o constante colocar em Letras maiusculas
		
		double area = PI*raio*raio;
		System.out.println(area);
		
		raio = 10;
		area = PI*raio*raio;
		System.out.println("A �rea da circunfer�ncia � = " + area+"m2"); //Concatena��o
	}
}

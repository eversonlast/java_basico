package fundamentos;

public class Inferencia 
{
	public static void main(String[] args) 
	{
		double a =4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		c = "Outro Texto";
		System.out.println(c);
		
		//As variaveis não mundam o tipo.
		
		double d;//Variavel foi declarada
		d = 123.456; //Variavel foi inicializada
		System.out.println(d);
		
		//var e; Isso o Java não deixa por causa da inferência 
		//e = 100;
	}
}

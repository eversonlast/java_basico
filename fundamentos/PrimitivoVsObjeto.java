package fundamentos;

public class PrimitivoVsObjeto 
{
	public static void main(String[] args)
	{
		String s = new String("texto");
		s.toUpperCase();
		
		//Wrappers s�o a ves�o dos objeto dos tipos primitivos! Tudo em java � objeto mesmo os oito tipos primitivos.
		int a = 123;
		System.out.println(a);
	}
}
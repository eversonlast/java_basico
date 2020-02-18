package fundamentos;

public class PrimitivoVsObjeto 
{
	public static void main(String[] args)
	{
		String s = new String("texto");
		s.toUpperCase();
		
		//Wrappers são a vesão dos objeto dos tipos primitivos! Tudo em java é objeto mesmo os oito tipos primitivos.
		int a = 123;
		System.out.println(a);
	}
}

package fundamentos;

public class ConversaoTiposPrimitivosNumericos 
{
	public static void main(String[] args) 
	{
		double a =1; //implícita 
		System.out.println(a);
		
		float b = 1.0F;
		float c = (float) 3.0;
		System.out.println(b + c);
		
		int d = 4;
		byte e = (byte) d;
		System.out.println(e);
		
		double f = 1.99999;
		int g = (int) f; //conversão explícita
		System.out.println(g);
		
	}
}

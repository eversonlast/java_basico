package fundamentos;

public class Wrappers
{
	public static void main(String[] args)
	{
		
		//byte
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("10000") ;
		Long l = 100000L;
		
		b.byteValue();
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i*2);
		System.out.println(l/2);
		
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		System.out.println((""+bo).toUpperCase());
		
	}
}

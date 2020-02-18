package Controle;

public class DesafioFor 
{
	public static void main(String[] args) 
	{
		String valor = "#";
		for(valor.length(); valor.length() <=5; ) {
			System.out.println(valor);
			valor+="#";
		}
		
		
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}
}

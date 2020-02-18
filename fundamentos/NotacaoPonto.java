package fundamentos;

public class NotacaoPonto 
{
	public static void main(String[] args) 
	{
		//double a = 2.3; //Pode-se notar que a palavra reserva fica em negrito
		
		String s = "Bom dia X.";//Pode notar que a palavra String não é uma palavra reservada
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase());
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
	}
}

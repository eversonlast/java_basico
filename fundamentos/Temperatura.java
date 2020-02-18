package fundamentos;

public class Temperatura
{
	public static void main(String[] args) 
	{
		//(F-32)X 5/9 = C
		
		double f = 86;
		final double ConstanteSubtrai = 32;
		final double ConstanteDivisao = 5.0/9.0;
		
		
		double c;
		c = (f - ConstanteSubtrai) * (ConstanteDivisao);
		
		System.out.println("O valor em fahrenheit é = " + f);
		System.out.println("A conversão de fahrenheit em celsius é = "+ c+"º");
	}

}

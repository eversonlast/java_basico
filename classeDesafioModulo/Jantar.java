package classeDesafioModulo;

public class Jantar {
	public static void main(String[] args) 
	{
	
		Comida c1 = new Comida("Feijão", 0.300);
		
		Comida c2 = new Comida("Arroz", 0.500);
			
		Pessoa p1 = new Pessoa("Ana", 80.0);
				
		double pesoincial = p1.peso;
		p1.Comer(c1);
		p1.Comer(c2);
		System.out.println("O peso incial é "+ pesoincial);
		System.out.println(p1.apresentar());
		
	}
}

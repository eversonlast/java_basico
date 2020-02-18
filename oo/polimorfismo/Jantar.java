package oo.polimorfismo;

public class Jantar 
{
	public static void main(String[] args) 
	{
		
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz ingrediente1 = new Arroz(0.200);		
		Feijao ingrediente2 = new Feijao(0.100);		
		Sorvete sobremesa1 = new Sorvete (0.500);
		//Comida ingrediente3 = new Comida(0.3); -> Por comida ser uma classe abstrata, com isso não pode instanciá-la
		Comida ingredientes3 = new Arroz(0.25);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		convidado.comer(ingredientes3);

		System.out.println(convidado.getPeso());
		
		convidado.comer(sobremesa1);
		System.out.println(convidado.getPeso());
	}
}

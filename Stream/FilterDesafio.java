package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterDesafio 
{
	public static void main(String[] args) 
	{
		Produto p1 = new Produto("Lapis", 1.2, 0.3, false);
		Produto p2 = new Produto("Caneta", 1.5, 0.2, true);
		Produto p3 = new Produto("Lapiseira", 12.0, 0.4, false);
		Produto p4 = new Produto("Borracha", 6.4, 0.5, true);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
		
		Predicate<Produto> oQuePrecisa = p-> p.nome == "Lapis" || p.nome == "Borracha";
		Predicate<Produto> precoBom = p -> p.preco <= 10.0;
		Predicate<Produto> temDesconto = p-> p.desconto >= 0.3;
		Predicate<Produto> temFrete = p->p.frete == false;
		Function<Produto, String> materialEscolar = a ->"Este vai ser o seu material Escolar: " + a.nome;
		
		produtos.stream()
			.filter(oQuePrecisa)
			.filter(precoBom)
			.filter(temDesconto)
			.filter(temFrete)
			.map(materialEscolar)			
			.forEach(System.out::println);
			
	}
}

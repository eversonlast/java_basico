package lambda;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio 
{
	public static void main(String[] args) 
	{
		Produto p = new Produto("Ipad", 3235.88, 0.13);
		DecimalFormat df  = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.HALF_UP);
		
		BinaryOperator<Double> valorComDesconto = (vDP, desconto) -> vDP * (1 - desconto);
		UnaryOperator<Double> impostoMunicipal = vDCompra -> vDCompra >= 2500 ? vDCompra * (1 + 0.085) : vDCompra;
		UnaryOperator<Double> valorFrete = vDCompra -> vDCompra >= 3000 ? vDCompra + 100 : vDCompra + 50;
		Function<String, String> valorFormatado = valor -> ("O valor total da compra R$"+valor).replace(".", ",");
		Function<Double,String> arrendondar = valor -> df.format(valor);
		
		double valorVerdadeiro = (valorComDesconto
				.andThen(impostoMunicipal)
				.andThen(valorFrete)
				.apply(p.preco, p.desconto));		
		System.out.println(arrendondar.andThen(valorFormatado).apply(valorVerdadeiro));
		
		
		//A implementação do professor
		
		/*
		Function<Produto, Double> precoFinal = 
				produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> impostoMunicipal = 
				preco -> preco >= 2500 ? preco * (1 + 0.085) : preco;
		UnaryOperator<Double> frete = 
				preco -> preco >= 3000 ? preco + 100 : preco + 50;;
		UnaryOperator<Double> arrendondar = 
				preco -> Double.parseDouble(String.format("%.2f", preco));
		Function<Double, String> formatar = 
				preco -> ("R$" + preco);
		
		
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arrendondar)
				.andThen(formatar)
				.apply(p);
		
		System.out.println(preco);
		*/
	}
}

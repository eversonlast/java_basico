package lambda;

public class Produto
{
	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	@Override
	public String toString() {
		double precoFinal = preco * (1 - desconto);
		return "Nome: "+ nome + " o pre�o do produto em R$" + precoFinal;
	}
	
	
	
}

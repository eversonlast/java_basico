package oo.composicao.desafio;

public class Sistema 
{
	public static void main(String[] args) 
	{
		
	Cliente c1 = new Cliente("Maria Julia Moraes");
	
	Compra compra1 = new Compra();
	compra1.adicionarItem("Caneta", 9.75, 100);
	compra1.adicionarItem(new Produto("Notebbok", 1000.00),2);
	
	Compra compra2 = new Compra();
	compra2.adicionarItem("Caneta", 10, 10);
	compra2.adicionarItem(new Produto("Impressora", 1000.10),3);
	
	c1.adicionarCompra(compra1);
	c1.compras.add(compra2);
	
	System.out.println(c1.obterValorTotal());
		
	}
}

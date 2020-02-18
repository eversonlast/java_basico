package oo.abstrato;

public class Cachorro extends Mamifero
{
	public String mover() {
		return "Usando as patas";
	}
	@Override
	public String mamar() {
		// TODO Auto-generated method stub
		return "Usando Leite.";
	}
	
	//Se o método Pai não implemetar o método abstrato, o seu filho ou o último de sua hierarquia tem que implementá-lo
	//Neste caso acima, se o Mameifero não tivesse implementado o método mover, o cachorro tinha que faze-lo.
	//Contudo, ainda tem o conceito de "final", que é ao contrário do abstrato, no momento que tem um método final, este método
	//Não pode ser reescrito nas classes filhas.
}

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
	
	//Se o m�todo Pai n�o implemetar o m�todo abstrato, o seu filho ou o �ltimo de sua hierarquia tem que implement�-lo
	//Neste caso acima, se o Mameifero n�o tivesse implementado o m�todo mover, o cachorro tinha que faze-lo.
	//Contudo, ainda tem o conceito de "final", que � ao contr�rio do abstrato, no momento que tem um m�todo final, este m�todo
	//N�o pode ser reescrito nas classes filhas.
}

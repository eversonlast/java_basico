package oo.heranca.desafio;

public class Lamborguini extends Carro
{
	@Override
	public void acelerarCarro() {
		super.acelerarCarro();
		super.acelerarCarro();
	}
	
	public Lamborguini() {
		this(350);
	}
	
	public Lamborguini(int velMax){
		super(velMax);
	}
}

package oo.heranca.desafio;

public class Carro 
{
	final int VELOCIDADE_MAXIMA;
	private int velocidadeAtual = 0;
	private int delta = 5;
	
	public void acelerarCarro() {
		if(velocidadeAtual +getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
		velocidadeAtual += getDelta();
		}
	}
	
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void frearCarro() {
		if(velocidadeAtual >= delta) {
			velocidadeAtual -= delta;
		}else {
			velocidadeAtual = 0;
		}
	}
	@Override
	public String toString() {
		return "A velocidade que você está é: "+ velocidadeAtual +" km/h";
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
}

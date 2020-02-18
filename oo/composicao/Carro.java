package oo.composicao;

public class Carro 
{
	Motor motor = new Motor();
	
	void acelerar() {
		if(motor.fatorinjecao < 2.6) {
		motor.fatorinjecao+= 0.4;
		}
	}
	
	void frear() {
		if(motor.fatorinjecao > 0.5) {
		motor.fatorinjecao -=0.4;
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estarLigado() {
		return motor.ligado;
	}
}

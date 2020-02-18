package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Lamborguini;

public class CarroTeste 
{
	public static void main(String[] args) 
	{
		Carro c1 = new Civic();
		c1.acelerarCarro();
		c1.acelerarCarro();
		c1.frearCarro();
		c1.frearCarro();
		c1.frearCarro();
		System.out.println(c1);
		
		Ferrari c2 = new Ferrari(350);
		
		c2.ligarTurbo();
		c2.acelerarCarro();
		c2.frearCarro();
		c2.frearCarro();
		c2.frearCarro();
		c2.frearCarro();
		c2.acelerarCarro();
		System.out.println(c2);
		System.out.println(c2.velocidadeDoAr());
		
		Lamborguini c3 = new Lamborguini();
		c3.acelerarCarro();
		System.out.println(c3 );
		
		
	}
}


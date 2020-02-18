package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{

	
	 
	void testeAcessos() {
		//System.out.println(esposa.segredo); Não consigo acessar porque este atributo é privado
		//System.out.println(mae.facoDentroDeCasa);
		System.out.println(formaDeFalar);// não precisa instanciar, por via herança
		System.out.println(todosSabem);
		System.out.println(new Ana().todosSabem);
		
	}
}

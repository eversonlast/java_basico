package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{

	
	 
	void testeAcessos() {
		//System.out.println(esposa.segredo); N�o consigo acessar porque este atributo � privado
		//System.out.println(mae.facoDentroDeCasa);
		System.out.println(formaDeFalar);// n�o precisa instanciar, por via heran�a
		System.out.println(todosSabem);
		System.out.println(new Ana().todosSabem);
		
	}
}

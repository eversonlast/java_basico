package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia 
{

Ana sogra =new Ana();
	
	void testeAcessos() {
		//System.out.println(sogra.segredo); N�o consigo acessar porque este atributo � privado
		//System.out.println(sogra.facoDentroDeCasa); Porque � package(default)
		//System.out.println(sogra.formaDeFalar); Porque � protected
		System.out.println(sogra.todosSabem);
	}
}

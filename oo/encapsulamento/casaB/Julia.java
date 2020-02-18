package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia 
{

Ana sogra =new Ana();
	
	void testeAcessos() {
		//System.out.println(sogra.segredo); Não consigo acessar porque este atributo é privado
		//System.out.println(sogra.facoDentroDeCasa); Porque é package(default)
		//System.out.println(sogra.formaDeFalar); Porque é protected
		System.out.println(sogra.todosSabem);
	}
}

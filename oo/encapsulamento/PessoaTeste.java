package oo.encapsulamento;

public class PessoaTeste 
{

	public static void main(String[] args) 
	{
		Pessoa p1 = new Pessoa("Adriana","Magalh�es Soares",-30);
		p1.setIdade(160);
		
		//p1.idade = -30; n�o � poss�vel porque o atributo � privado

		System.out.println(p1.getIdade());
		System.out.println(p1);
		System.out.println(p1.getNomeCompleto());
	}
}

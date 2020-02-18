package oo.encapsulamento;

public class PessoaTeste 
{

	public static void main(String[] args) 
	{
		Pessoa p1 = new Pessoa("Adriana","Magalhães Soares",-30);
		p1.setIdade(160);
		
		//p1.idade = -30; não é possível porque o atributo é privado

		System.out.println(p1.getIdade());
		System.out.println(p1);
		System.out.println(p1.getNomeCompleto());
	}
}

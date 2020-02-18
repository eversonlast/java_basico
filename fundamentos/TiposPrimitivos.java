package fundamentos;

public class TiposPrimitivos 
{
	public static void main(String[] args) 
	{
		//Tipos primitivos inteiros 
		
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_345_456_456L;
		
		//Tipos Númericos reais
		float salario = 11_564.44F;
		double vendasAcumuladas = 2_935_987_987.01;
		
		//Tipo boolean
		boolean estaDeFerias = false;
		
		//tipo Caraterer
		char status = 'A';
		
		//Dias da empresa
		System.out.println(anosDeEmpresa *365);
		
		//Numeros de Viagens 
		System.out.println(numerosDeVoos/2);
		
		//pontos Acumulados
		
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id +" ganha-->" +salario);
		System.out.println("Status de Férias: "+ estaDeFerias);
		System.out.println("Situação do Funcionário: "+ status);
		
	}
}

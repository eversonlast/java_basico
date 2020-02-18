package classe;

public class Data 
{
	int dia;
	int mes;
	int ano;
	
	Data()
	{
	//	dia = 01;
	//	mes = 01;
	//	ano = 1970;
		this(1, 1, 1970);
	// byte, short, int, long -> 0
	// float, double -> 0.0
	// char -> '\u0000'
	//String, Objetos -> null 
	// Vari�veis locais n�o � inicializada por padr�o, obrigatoriamente tem que inicializ�-la.
	// Constante tem que ser inicializada, podendo ser no momento da cria��o ou no construtor.
	}
	
	Data (int dia, int mes, int anoAtual)
	{
		this.dia = dia;
		this.mes = mes;
		this.ano = anoAtual;
	}
	
	String obterDataFormatada()
	{
		//return  dia + "/" + mes + "/" + ano;
		String formato = "%d/%d/%d";//Vari�veis locais, que est�o nos m�todos o seu valor s� fica no m�todo, assim quando o m�todo para de funcionar o seu valor tamb�m � destru�do
		return String.format(formato, this.dia, mes, ano);
	}
	
	void imprimirDataFormatada() 
	{
		System.out.println(obterDataFormatada());
	}
}

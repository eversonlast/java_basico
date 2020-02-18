package excecao.personalizaB;

@SuppressWarnings("serial")
public class NumeroForaIntervalo extends Exception
{
	private String nomeDoAtributo;
	public NumeroForaIntervalo(String nomeDoAtributo) 
	{
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	@Override
	public String getMessage() {
		return  String.format("O atributo '%s' est� fora do intervalo", nomeDoAtributo);
	}
	
}

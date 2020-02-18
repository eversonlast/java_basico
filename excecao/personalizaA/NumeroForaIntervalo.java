package excecao.personalizaA;

@SuppressWarnings("serial")
public class NumeroForaIntervalo extends RuntimeException
{
	private String nomeDoAtributo;
	public NumeroForaIntervalo(String nomeDoAtributo) 
	{
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	@Override
	public String getMessage() {
		return  String.format("O atributo '%s' está fora do intervalo", nomeDoAtributo);
	}
	
}

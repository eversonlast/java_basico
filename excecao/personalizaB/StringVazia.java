package excecao.personalizaB;

@SuppressWarnings("serial")
public class StringVazia extends Exception
{
	private String nomeDoAtributo;
	public StringVazia(String nomeDoAtributo) 
	{
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	@Override
	public String getMessage() {
		return  String.format("O atributo '%s' est� vazio.", nomeDoAtributo);
	}
	
}

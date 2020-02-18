package oo.encapsulamento;

public class Pessoa 
{
	private int idade;
	private String nome;
	private String sobrenome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa(String nome, String sobrenome , int idade) {
		setIdade(idade);
		setNome(nome);
		setSobrenome(sobrenome);
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getNomeCompleto() {
		return getNome()+ " "+getSobrenome();
	}

	//Getters
	public int getIdade() {
		return idade;
	}
	//Setters
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade<= 150) {
			this.idade = novaIdade;
		}
	}
	 @Override
	public String toString() {
		return "O meu nome é "+ getNome()+ " e tenho " + getIdade()+" anos";
	}
}

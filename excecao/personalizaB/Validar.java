package excecao.personalizaB;

import excecao.Aluno;

public class Validar 
{
	private Validar() {}
	
	public static void aluno (Aluno aluno) throws StringVazia, NumeroForaIntervalo {
		if(aluno == null) {
			throw new IllegalArgumentException("Aluno está nulo!");
		}
		
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVazia("nome");
		}
		if(aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervalo("nota");
		}
	}
}

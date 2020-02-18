package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha 
{
	public static void main(String[] args) 
	{
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno príncipe");
		livros.push("Don Quixote");//Se estiver cheia a pilha gera uma excessão
		livros.push("Hobbit");
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		System.out.println(livros.pop());//gera também uma excessão
		
		//livros.size();
		//livros.clear();
		//livros.contains();
		//livros.isEmpty();
	}
}

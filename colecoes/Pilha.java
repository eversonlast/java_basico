package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha 
{
	public static void main(String[] args) 
	{
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno pr�ncipe");
		livros.push("Don Quixote");//Se estiver cheia a pilha gera uma excess�o
		livros.push("Hobbit");
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		System.out.println(livros.pop());//gera tamb�m uma excess�o
		
		//livros.size();
		//livros.clear();
		//livros.contains();
		//livros.isEmpty();
	}
}

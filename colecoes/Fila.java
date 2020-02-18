package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila
{
	public static void main(String[] args) 
	{
		Queue<String> fila = new LinkedList<String>();
		
		//Estas são as duas maneiras de acrescentar em uma fila, contudo a diferença existente entre elas e o comportamento quanto
		//a fila estiver cheia
		fila.add("Ana");//Não dá erro, simplesmente ignora e não adiciona 
		fila.offer("Bia");//Aqui dá uma excessão, e tão não adiciona
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//O peek quando a fila está vazia tem um comportamento, mostrando o valor de null
		//Já o element tem um comportamento diferente mostra um erro de excessão
		System.out.println(fila.peek());// retorna o primeiro da fila 
		System.out.println(fila.peek());//e não remove da fila
		System.out.println(fila.element());//Também retorna o primeiro da fila
		
		//fila.size();
		//fila.clear();
		
		//System.out.println(fila.isEmpty());
		//fila.contains("Ana");
		
		//Poll e remove -> ve o primeiro da fila e o remove 
		//Diferença dois dois está quando a fila está vazia 
		System.out.println(fila.poll());//retorna false
		System.out.println(fila.remove());//retorna uma excessão
	}
}

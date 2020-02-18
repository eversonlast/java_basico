package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila
{
	public static void main(String[] args) 
	{
		Queue<String> fila = new LinkedList<String>();
		
		//Estas s�o as duas maneiras de acrescentar em uma fila, contudo a diferen�a existente entre elas e o comportamento quanto
		//a fila estiver cheia
		fila.add("Ana");//N�o d� erro, simplesmente ignora e n�o adiciona 
		fila.offer("Bia");//Aqui d� uma excess�o, e t�o n�o adiciona
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//O peek quando a fila est� vazia tem um comportamento, mostrando o valor de null
		//J� o element tem um comportamento diferente mostra um erro de excess�o
		System.out.println(fila.peek());// retorna o primeiro da fila 
		System.out.println(fila.peek());//e n�o remove da fila
		System.out.println(fila.element());//Tamb�m retorna o primeiro da fila
		
		//fila.size();
		//fila.clear();
		
		//System.out.println(fila.isEmpty());
		//fila.contains("Ana");
		
		//Poll e remove -> ve o primeiro da fila e o remove 
		//Diferen�a dois dois est� quando a fila est� vazia 
		System.out.println(fila.poll());//retorna false
		System.out.println(fila.remove());//retorna uma excess�o
	}
}

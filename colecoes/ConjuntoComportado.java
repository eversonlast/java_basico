package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado 
{
	public static void main(String[] args) 
	{
		//Set<String> listaAprovados = new HashSet<String>(); //lista não ordenada
		SortedSet<String> listaAprovados = new TreeSet<>(); //Lista ordenada 
		
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato : listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<Integer>(); //lista não ordenada
		
		nums.add(3);
		nums.add(4);
		nums.add(11);
		nums.add(10);
		
		for(int n : nums) {
			System.out.println(n);
		}
	}
}

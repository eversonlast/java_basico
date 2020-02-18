package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		HashSet conjunto = new HashSet();
		conjunto.add(1.2); //double->DOuble
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho é " + conjunto.size());
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println("O tamanho agora é " + conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(3);
		nums.add(2);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums);//União;
		conjunto.retainAll(nums);//Intercecsão
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);

	}
}

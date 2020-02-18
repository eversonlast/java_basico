package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams 
{
	public static void main(String[] args) 
	{
		Consumer<String> print = System.out::print;
		Consumer<Object> printInt = System.out::println;
		
		Stream<String> langs = Stream.of("Java ", "Lua ", "Js\n");
		langs.forEach(print);
		
		String[] maislangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
		Stream.of(maislangs).forEach(print);
		Arrays.stream(maislangs).forEach(print);
		Arrays.stream(maislangs, 1 , 4).forEach(print);
		List<String> outraslangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outraslangs.stream().forEach(print);
		outraslangs.parallelStream().forEach(print);
		
		//Stream.generate(()-> "a").forEach(print);
		Stream.iterate(0, n -> n+1).forEach(printInt);
	}
}

package ex5;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;




public class MethodRef4 {

	public static void main(String[] args) {
		
		Consumer<String> c = s -> System.out.println(s);
		
		c.accept("java");
		
		Consumer<String> c2 = System.out::println;
		
		c.accept("Spring");
		
		

	}

}

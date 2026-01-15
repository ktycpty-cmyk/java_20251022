package ex5;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;




public class MethodRef3 {

	public static void main(String[] args) {
		
		Predicate<String> p = s -> s.isEmpty();
		
		System.out.println(p.test(""));
		System.out.println(p.test("kor")); 
		
		
		Predicate<String> p2 = String::isEmpty;
		
		System.out.println(p2.test(""));
		System.out.println(p2.test("kor")); 
		
		Function<String, Integer> f1 = (String f) -> f.length();
		System.out.println(f1.apply("korea"));
		
		Function<String, Integer> f2 = String::length;
		System.out.println(f2.apply("korea"));
		
		

	}

}

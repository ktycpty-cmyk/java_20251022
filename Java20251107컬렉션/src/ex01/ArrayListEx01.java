package ex01;


import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx01 {

	public static void main(String[] args) {
		
		ArrayList<Integer> ls = new ArrayList();
		
		ls.add(50); // new Integer(5)   5 --> new Integer(5) -> wapper
		ls.add(new Integer(40));
		ls.add(20);
		ls.add(new Integer(0));
		ls.add(10);
		ls.add(new Integer(30));
		
		System.out.println(ls);
		System.out.println(ls.subList(1, 4));
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(ls.subList(1, 4));
		System.out.println(list2);
		
		Collections.sort(ls);
		System.out.println(ls);
		
		System.out.println(ls.get(3));
		System.out.println(ls.get(2));
		
		
		
		

	}

}

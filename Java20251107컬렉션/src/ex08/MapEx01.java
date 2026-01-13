package ex08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx01 {

	public static void main(String[] args) {
		
	Map<String, Integer> map = new HashMap<>();
	map.put("영자바", 100);
	map.put("일자바", 100);
	map.put("이자바", 80);
	map.put("삼자바", 90);
	
	System.out.println(map.get("영자바"));
	System.out.println(map.get("일자바"));
	System.out.println(map.get("이자바"));
	System.out.println(map.get("삼자바"));
	
	Set set =map.entrySet();

	Iterator it = set.iterator();
	
	while(it.hasNext()) {
		Map.Entry e =(Map.Entry)it.next();
		System.out.printf("이름 : %s , 점수 : %d\n" , e.getKey(), e.getValue());
	}
	}

}

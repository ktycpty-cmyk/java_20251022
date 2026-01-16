package ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


class ToPriceInfo{
	private String model;
	private int price;
	
	public ToPriceInfo(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
}
public class Stream04 {

	public static void main(String[] args) {
		
		List<ToPriceInfo> ls = new ArrayList<ToPriceInfo>();
		ls.add(new ToPriceInfo("GUN_LR 45", 200));
		ls.add(new ToPriceInfo("TEDDY_BEAR_S 104",300));
		ls.add(new ToPriceInfo("CAR_TRANSFORM_VER_7719", 550));
		
		
		int sum = ls.stream()
				.filter(p->p.getPrice()<500)
				.mapToInt(t->t.getPrice())
				.sum();
		
		System.out.println(sum);
	
	}

}

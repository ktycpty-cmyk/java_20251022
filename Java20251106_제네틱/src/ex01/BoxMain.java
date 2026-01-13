package ex01;

public class BoxMain {

	public static void main(String[] args) {
		
		Box box = new Box();
		
		box.setItem(new Car());
		
		Object ob = box.getItem();
		Car car = (Car)box.getItem();

	}

}


class Car{
	
}

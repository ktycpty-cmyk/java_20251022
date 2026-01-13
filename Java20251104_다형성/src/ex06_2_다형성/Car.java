package ex06_2_다형성;

public class Car {
	public void move() {
		System.out.println("차를 이동합니다.");
	}
	
	//car 클래스를 상속하느 클래스는 fillUp메소드를
	//반드시 재정의 하세요!!!!
	public void fillUp() {
		System.out.println("물을 충전합니다.");
	}

}

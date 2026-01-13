package ex02;

public class Singleton {
	
	
	private static Singleton singleton = new Singleton();
	
	private Singleton() { //외부에서 객체 생성불가
		
	}
	//생성된 Singleton 객체를 사용(창조)할 수 있는 유일한 통로 역할이다.
	public static Singleton getInstace() {
		
		return singleton;
	}

}
class Sample{
	public Sample() {
		
	}
}

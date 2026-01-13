package ex03;

public class Main {

	public static void main(String[] args) {
		//상위 클래스는 하위 클래스 참조 가능
		//참조는 가능하지만, 접근 할 수 있는 영역은 상위클래스 꺼만 가능
		
				
		A a = new A();
		a = new B();
		a = new C();
		
		//메소드 오버라이딩이 된 경우는, 참조변수 타입(자료형)이 있는 메소드 호출
		//가르키는 클래스 메소드가 호출
		
		a = new A();
		a.test();
		
		a = new B();
		a.test();
		
		a = new C();
		a.test();
		
		System.out.println("----------------------");
		
		a = new B();
		
		B b = (B)a;
		b.test();
		
		System.out.println("----------------------");
		
		a = new C();
		C c = (C)a;
		
		c.test();
		
		
		System.out.println("----------------------");
		
		A aa = null;
		
		C cc = new C();
		
		aa = (A)cc;
		
		C cc1 = (C)aa;
		
		aa = (B)cc;
		
	}

}

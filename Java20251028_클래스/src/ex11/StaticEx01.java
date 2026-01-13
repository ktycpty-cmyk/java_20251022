package ex11;

public class StaticEx01 {
	
	
	int number; // 인스턴트 멤버
	static int ban;  // 정적 멤버
	
	void func() {  //인스턴트 메소드
		System.out.println("number : " + number);
	}
	
	static void test() {  //정적 메소드
		System.out.println("ban : " + ban);
	}
 }

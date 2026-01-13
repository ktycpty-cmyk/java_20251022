package ex02;

public class ExceptionEx01 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작...");
		
		
		int a = 5;
		int b = 2;
		
		/*
		if(b != 0) {
		int c =a/b;
		
		System.out.println(c);
		}
		*/
		
		try { //try 블럭에는 예외가 발생할 개연성이 있는 코드를 넣어준다
			
			int c =a/b; //에러가 발생하는 경우는 b가 0인 경우 예외발생
			System.out.println(c);
			
			int[] num = new int[5];
			System.out.println(num[3]);
			
			String str = null;
			System.out.println(str.length());
			
			
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누면 에러 발생");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("베일 크기를 벗어났네!!");
			
		}catch(NullPointerException e) {
			System.out.println("null 값은 구할수 없다");
		};

		System.out.println("프로그램 종료...");
	}

}

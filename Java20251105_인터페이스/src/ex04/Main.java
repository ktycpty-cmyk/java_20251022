package ex04;

public class Main {

	public static void main(String[] args) {
		
		Printer pt = new LaserPrinter(); 
		pt.print("테스트 페이지 출력");
		
		System.out.println("-----------------------------");
		
		pt  = new InkjetPrinter();
		pt.print("테스트 페이지 출력");
		

	}

}

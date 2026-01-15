package ex4;

import java.util.function.Consumer;

interface Printable{
	void print();
}

class Perers{
	private String msg;
	public Perers(String msg) {this.msg = msg;}
	
	public Printable getPrinter() {
		
	//람다	
	 return () -> System.out.println(msg);
	}			
		
}
	




public class L6_Rambda {

	public static void main(String[] args) {
		
		Perers p1 = new Perers("이 문장을 출력하고 싶어!");
		Printable prn = p1.getPrinter();
		prn.print();
		
		Consumer<String> msg = t -> System.out.println(t);
		
		msg.accept("메시지 출력 요망!!!");
	}

}

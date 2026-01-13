package ex01;

public class Main {

	public static void main(String[] args) {
		
		Shape sh = new Shape(0,0);
		sh.draw();
		
		Shape ci = new Circle(10,20);
		ci.draw();
		
		Shape re = new Rectangle(30,40);
		re.draw();
		

	}

}

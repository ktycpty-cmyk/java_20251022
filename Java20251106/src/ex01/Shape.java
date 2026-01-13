package ex01;

public class Shape {
	
	
	
	private int x;//x 좌표
	private int y;//y 좌표
	
	public Shape() {}
	public Shape(int x , int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	
	public void draw() {
		System.out.printf("도형을(%d,%d)에 그립니다.\n" , x,y);
	}

	
	
	
	

}

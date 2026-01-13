package ex03;

public class Cat implements Animal {

	private String name;
	private int age;
	
	public Cat(String name , int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public void makeSound() {
		System.out.println(" 야옹!!");
		
	}

	@Override
	public void showinfo() {
		System.out.printf("이름 : %s , 나이 : %d\n " , name , age ); 
		
	}

}

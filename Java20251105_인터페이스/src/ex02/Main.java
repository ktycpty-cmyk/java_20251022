package ex02;

public class Main {

	public static void main(String[] args) {
		
		Animal dog = new Dog("얌이" , 13);
		
		dog.showinfo();
		
		dog.makeSound();
		
		Animal cat = new Cat("별이" , 14);
		
		cat.showinfo();
		cat.makeSound();
		
	}

}

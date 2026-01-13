package ex03;

public class Main {

	public static void main(String[] args) {
		
		Animal anl = new Dog("뚱이" , 14); 
		
		anl.showinfo();
		anl.makeSound();
		
		Animal an = new Cat("달이" , 13);
		
		an.showinfo();
		an.makeSound();
	}

}

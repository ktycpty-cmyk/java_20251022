package ex09;

public class Student extends Human {
	
	private String number;
	private String major;
	
	public Student() {}
	Student(String name, int age, int weight, int height, String number, String major){
		super(name, age , weight , height);
		
		this.number = number;
		this.major = major;
		
	}
	public void printInformation() {
		System.out.println();
	}
	
	

	
	
}


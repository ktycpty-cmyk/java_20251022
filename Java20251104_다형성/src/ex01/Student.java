package ex01;

public class Student extends Person {
	
	private String schoolName;
	
	public Student() {}
	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
	}
	public void showStudentInfo() {
		super.showInfo();
		System.out.printf("학교: %s\n", schoolName);
	}
}
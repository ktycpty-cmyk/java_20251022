package ex01;


// Student클래스는 Person 클래스 상속
public class Student extends Person {
	
	
	
	
	//멤버변수는 외부 노출 시키지 않는다=> 정보은닉
	
	private String school;
	
	Student(){}
	Student(String name, int age, String school){
		super(name, age);
		this.school = school;
	}
	
	
	
	
	public void study() {
		System.out.println(school + "에서 공부 중 입니다.");
	}

}

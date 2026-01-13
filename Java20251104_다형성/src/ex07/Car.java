package ex07;

public class Car extends Vehicle {
	
	private String type;
	
	public Car(){
		super();
	}
	
	public Car(String type){
		super();
		this.type = type;
	}
	
	public Car(String brand, int year, String type){
		super(brand, year);
		this.type = type;
	}
	


	}

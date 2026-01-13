package ex06_1_상속;

public class CarMain {

	public static void main(String[] args) {
		
		ElectricCar electricCar = new ElectricCar();
		electricCar.move();
		electricCar.charge();
		
		GasCar gasCar = new GasCar();
		gasCar.move();
		gasCar.fillUp();
		
		System.out.println("------------------------");
		
		GasCar gc = new GasCar();
		gc.move();
		gc.fillUp();
		

	}

}

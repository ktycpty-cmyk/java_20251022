package ex01;


	public class Vehicle {
   	 private String brand;
   	 
   	 private int year;
   	 
   	 public Vehicle(){}
   	 public Vehicle(String brand, int year){
   		 this.brand = brand;
   		 this.year = year;
   	 }
   	 
   	 
   	 
   	   	 public void showinfo() {
			System.out.printf("브랜드 : %s, 연식 : %d년", brand , year);
   		 
   	 }
   	 
	}
   	 
    



package ex07;

public class Vehicle {
    	 private String brand;
    	 
    	 private int year;
    	 
    	 Vehicle(){}
    	 Vehicle(String brand, int year){
    		 this.brand = brand;
    		 this.year = year;
    	 }
    	 
    	 public String getBrand() {
			return brand;
    		 
    	 }
    	 
    	 public String showinfo() {
			return brand + ", " + year;
    		 
    	 }
    	 
     
      

}

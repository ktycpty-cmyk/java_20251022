package ex02;

public class Box<T> {
	T item;
	
	void setItem(T item) {
		this.item = item;
	}
	
	T getItem() {
		return item;
	}

}

/*
  public class Box<Car>{
  
  Car item;
  
  void setItem(Car item){
  this.item = item;
  }
  Car getItem() {
	  return item;
  }
  }
*/
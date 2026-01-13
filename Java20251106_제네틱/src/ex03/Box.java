package ex03;

public class Box<T extends Person> {
	
	/*
	 * 타입 제한 : <T extends Person>
	 * T 전달될 수 있는 객체는 
	 * Person 이거나 Person 자손들만 가능
	 */
	
	
	
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
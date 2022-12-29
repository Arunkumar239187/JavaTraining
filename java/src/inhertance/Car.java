package inhertance;

public class Car extends Vehicle{

	
		String module;
		int wheels;
		
	
	void display() {
		System.out.println("type :"+type+" Module :"+module+ " Wheels :"+ wheels);
	}
	public static void main(String[] args) {
		
      Car car=new Car();
      car.module="BMW";
      car.type="s3";
      car.wheels=4;
      car.display();
	}

}

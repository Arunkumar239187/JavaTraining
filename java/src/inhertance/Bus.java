package inhertance;

public class Bus extends Vehicle {

		
			String module;
			int wheels;
			
		
		void display() {
			System.out.println("type :"+type+" Module :"+module+ " Wheels :"+ wheels);
		}
		public static void main(String[] args) {
			
	      Bus bus=new Bus();
	      bus.module="Bharath";
	      bus.type="bens";
	      bus.wheels=10;
	      bus.display();
		}

	}

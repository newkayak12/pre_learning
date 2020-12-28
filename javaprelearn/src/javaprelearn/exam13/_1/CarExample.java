package javaprelearn.exam13._1;

class Car {
	private int speed =100;
	
		public void speedUp() {
			speed += 10;
			
		}
		
		public int getSpeed() {
			
			return speed;
		}
}

class Truck extends Car{
	private int weight = 5000;
}

public class CarExample{
	public static void main ( String [] args )  {
			Truck truck = new Truck();
			//private, it can be used in class by oneself
			//truck.speed =110; (X)
			//truck.weight = 3000;
			truck.speedUp();
			System.out.println(truck.getSpeed());
			//speed is private but it modified by speedUp method
	}
}
package javaprelearn.exam14._1;

abstract class CarMain {
	abstract void moveCar ();
}

class CarSedan extends CarMain {
	public void moveCar() {
		System.out.println( "Sedan moved" );
	}
}

class CarTruck extends CarMain {
	public void moveCar() {
		System.out.println( "Truck moved" );
	}
}


public class AbstractExample {

	public static void main( String[] args ) {

		CarSedan crsd= new CarSedan();
			crsd.moveCar();
		
		CarTruck crtr= new CarTruck();
			crtr.moveCar();
		
	}

}

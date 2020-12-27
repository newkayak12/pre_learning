package javaprelearn.exam10._1;

public class MethodOverride {
	void printString() {
		System.out.println("JavaProgramming");
	}
	void printString(int count) {
		int i;
		for(i=1; i<count; i++) {
			System.out.println("JavaProgramming");
		}
	}
	
	// method overload is done
	
	
	public static void main(String[] args) {
		MethodOverride mtdvrd = new MethodOverride();
		mtdvrd.printString();
		mtdvrd.printString(3);
	}

	//In main method, overloaded methods are called
}

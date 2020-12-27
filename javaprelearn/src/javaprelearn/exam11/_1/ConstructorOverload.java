package javaprelearn.exam11._1;

public class ConstructorOverload {
	public ConstructorOverload() {
		System.out.println("this section is Constructor");
	}
	
	public ConstructorOverload(int num) {
		for(int i =0; i<num; i++) {
			System.out.println("Constructor overload");
		}
	}
	public static void main(String[] args) {

		ConstructorOverload cso1 = new ConstructorOverload();
		ConstructorOverload cso2 = new ConstructorOverload(2);
		
	}

}

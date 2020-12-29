package javaprelearn.exam16._1;

public class NestedClassAndAnonymousClass {
	//no field
	
		public NestedClassAndAnonymousClass() {
			System.out.println("Constructor of Outter Class");
			InnerExam inner = new InnerExam();
			inner.printExam();
		}
	//constructor
	
		public void printOuter() {
			System.out.println("Methods of Outter Class");
		}
	//method
		
	class InnerExam{
			public void printExam() {
				System.out.println("Methods of Inner Class");
				printOuter();
				//Inner class can access outter one without constructor
			}
	// inner class
			
	}
	
		public static void main(String[] args) {
			
			NestedClassAndAnonymousClass outer = new NestedClassAndAnonymousClass();
		}

}

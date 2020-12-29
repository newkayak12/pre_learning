package javaprelearn.exam17._1;

public class ObjectTest {
//field		
	String carName;

//consturctor
		public ObjectTest( String str ) { 
			carName=str;
		}
//method		
		public boolean equal( Object obj ) {
			ObjectTest tmp = (ObjectTest)obj;
				if (carName.equals(tmp.carName)) {
					return true;
				} else {
					return false;
				}
		}
		
		public static void main(String[] args) {

			ObjectTest obj= new ObjectTest("R8");
			ObjectTest obj2= new ObjectTest("R8");
//equals override, object obj, object obj equal
				if(obj.equal(obj2)) {
					System.out.println("Both objects are same");
				} else {
					System.out.println("Both objects are not same");
				}
			
	}

}

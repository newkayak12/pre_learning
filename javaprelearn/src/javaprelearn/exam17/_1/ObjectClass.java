package javaprelearn.exam17._1;

public class ObjectClass {

	public static void main(String[] args) {
			ObjectClass objc= new ObjectClass();
// "javaprelearn.exam17._1.ObjectClass@2f92e0f4" has been printed. @2f92e0f4 is hash value of this class 
			System.out.println(objc.toString());
// str1, str2 have different address value
		String str1 = new String("java");
		String str2 = new String("java");
//false
			System.out.println(str1==str2);
// str1, str3 have same address value
		String str3 = str1;
//true
			System.out.println(str1==str3);

	}

}

package javaprelearn.exam18._1;

public class StringClass {

	public static void main( String[] args ) {
		String str1 = new String("Java Programming");
				System.out.println("1");
				System.out.println(str1.length());
				System.out.println();
				
		String str2 = new String("Java Programming");
				System.out.println("2");
				System.out.println(str2.equals(str2));
				System.out.println();
				
		String str3 = str1.substring(3);
				System.out.println("3");
				System.out.println(str3);
				System.out.println();
				
			str3=str1.substring(0,3);
				System.out.println("4");
				System.out.println(str3);
				System.out.println();
				
		String str10 = new String("Java");
		String str11 = new String("Programming");
				System.out.println("5");
				System.out.println(str10+str11);
				System.out.println();
				
		String str12 = 10.3 + str11;
				System.out.println("6");
				System.out.println(str12);
				System.out.println();

						StringBuffer sb= new StringBuffer();
			sb.append("Java Programming");
				System.out.println("7");
				System.out.println(sb.toString());
				System.out.println();
				
			sb.replace(0, 5, "jsp");
				System.out.println("8");
				System.out.println(sb);
				System.out.println();
				
			sb.delete(0, 3);
				System.out.println("9");
				System.out.println(sb);
				System.out.println();
				
			sb.reverse();
				System.out.println("10");
				System.out.println(sb);
				System.out.println();
		
			
	}
	

}

package javaprelearn.exam05._3;

public class bitOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int iNum1 =7, iNum2=5, iNum3 = -20, result;
result = iNum1&iNum2;
System.out.println("iNum1&iNum2");
System.out.println("iNum1  " + toBinaryString(iNum1));
System.out.println("iNum2  " + toBinaryString(iNum2));
System.out.println("result "+ toBinaryString(result));
System.out.println();



result = iNum1|iNum2;
System.out.println("iNum1|iNum2");
System.out.println("iNum1  " + toBinaryString(iNum1));
System.out.println("iNum2  " + toBinaryString(iNum2));
System.out.println("result "+ toBinaryString(result));
System.out.println();

result = iNum1 <<2;
System.out.println("iNum1 << 2");
System.out.println("iNum1  " + toBinaryString(iNum1));
System.out.println("result "+ toBinaryString(result));
System.out.println();

result = iNum1 >>>3;
System.out.println("iNum1 >>>3");
System.out.println("iNum1  " + toBinaryString(iNum1));
System.out.println("result "+ toBinaryString(result));
System.out.println();

result = iNum3 >>2;
System.out.println("iNum3 >>2");
System.out.println("iNum3  " + toBinaryString(iNum3));
System.out.println("result "+ toBinaryString(result));

int test = -10, result2;
result2 = test>>1;
System.out.println(result2);

	}
	public static String toBinaryString(int value) {
		String str= Integer.toBinaryString(value);
		
		while(str.length()<32) {
			str = "0" +str;
			
		}
		
		return str;
	}
}

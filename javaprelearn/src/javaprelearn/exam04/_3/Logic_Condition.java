package javaprelearn.exam04._3;

public class Logic_Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int iN1=10, iN2=20, iN3=30;
boolean result;
result = (iN1<iN2) && (iN2<iN3);
System.out.println(result);
result = (iN1>iN2) || (iN2<iN3);
System.out.println(result);
result = !result;
System.out.println(result);
iN3=(iN1>=100) ? 200:300;
System.out.println(iN3);
	}

}

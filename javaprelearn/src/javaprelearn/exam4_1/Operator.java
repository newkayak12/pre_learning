package javaprelearn.exam4_1;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int iNum1 =10, iNum2= 20, iresult; // 이렇게 , 로 여러 개 변수를 한 번에 선언할 수도 있음!!!
double dNum1=3.14, dresult;
iresult = iNum1+iNum2;
System.out.println(iresult);
iresult= iNum1+30;
System.out.println(iresult);
dresult = iNum1 +dNum1; //casting 발생  dresult가 int였다면 안됐을거임
System.out.println(dresult);

	}

}

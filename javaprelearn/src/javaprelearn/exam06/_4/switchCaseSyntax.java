package javaprelearn.exam06._4;

public class switchCaseSyntax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int score=93;
switch(score/10) { //score/10는 정수로 ... 소수점은 절삭 _이렇게도 쓸 수 있구나...
case 10:
case 9:
	System.out.println("A");
	break;
case 8:
	System.out.println("B");
	break;
default :
	System.out.println("C");
}
	}

}

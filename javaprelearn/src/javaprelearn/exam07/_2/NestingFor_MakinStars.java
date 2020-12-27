package javaprelearn.exam07._2;

public class NestingFor_MakinStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i, j;
for (i=0; i<5; i++) {   
	for(j=0; j<5; j++) { 
		System.out.print("*");
		if(i==j) {
			System.out.println();
			break;
		} 	
	}
}

System.out.println();

for(i=0; i<5; i++) {
	for(j=0; j<=i; j++) {
		System.out.print("*");
		
	}
	System.out.println();
}
//아직도 비효율적으로 코드를 내가 짜고 있구나...
	}

}

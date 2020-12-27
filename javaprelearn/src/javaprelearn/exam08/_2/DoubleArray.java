package javaprelearn.exam08._2;

public class DoubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int data[][]=new int[2][3];
int count =0;
for(int i=0; i<data.length; i++) {
	System.out.print("|");
	for(int j = 0; j<data[i].length; j++) {
	
		data [i][j]= ++count;
		System.out.print(data[i][j] + "|");
	}
	System.out.println();
}


// int data[]={1,2,3,4,5}; 처럼 선언이 안된다.

	}

}

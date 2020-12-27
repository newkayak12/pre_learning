package javaprelearn.exam12._1;

public class Static_method {

	static int count = 0;
	int age = 30;

	public static int getCount() {

		return count;
	}

	public static void main(String[] args) {

		System.out.println(Static_method.getCount());
		Static_method.count++;
		System.out.println(Static_method.getCount());
	}

}

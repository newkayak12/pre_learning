package javaprelearn.exam09._1;

 class Car { //주 클래스만 public 선언
	//필드
	int num = 5;
	int speed =110;
	// 생성자
	
	// 메소드
void velUp(){
		speed +=10;
	}
void velDown() {
		speed -=5;
}

}

public class CarExam{
	public static void main(String[] args) {
		//생성자??
		Car tico = new Car();
		System.out.println("현재 속도는 " + tico.speed+"Km/h");
		tico.velUp();
		tico.velUp();
		System.out.println("현재 속도는 " + tico.speed+"Km/h");
		tico.velDown();
		tico.velDown();
		System.out.println("현재 속도는 " + tico.speed+"Km/h");
	}
}

package javaprelearn.exam09._1;

 class Car { //�� Ŭ������ public ����
	//�ʵ�
	int num = 5;
	int speed =110;
	// ������
	
	// �޼ҵ�
void velUp(){
		speed +=10;
	}
void velDown() {
		speed -=5;
}

}

public class CarExam{
	public static void main(String[] args) {
		//������??
		Car tico = new Car();
		System.out.println("���� �ӵ��� " + tico.speed+"Km/h");
		tico.velUp();
		tico.velUp();
		System.out.println("���� �ӵ��� " + tico.speed+"Km/h");
		tico.velDown();
		tico.velDown();
		System.out.println("���� �ӵ��� " + tico.speed+"Km/h");
	}
}

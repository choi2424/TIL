package ch06.sec06.exam02;

public class CarExample {

	public static void main(String[] args) {
		
//		��ü����
		Car myCar = new Car();
		
//		�ʵ尪 �о����
		System.out.printf("����ȸ�� : %s\n",myCar.company);
		System.out.printf("�𵨸� : %s\n",myCar.model);
		System.out.printf("���� : %s\n",myCar.color);
		System.out.printf("�ְ�ӵ� : %d\n",myCar.maxSpeed);
		System.out.printf("����ӵ� : %d\n",myCar.speed);
		
//		�ʵ尪 �����ϱ�
		myCar.speed = 60;
		System.out.printf("������ �ӵ� : %d\n",myCar.speed);
	}

}

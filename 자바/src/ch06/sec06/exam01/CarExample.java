package ch06.sec06.exam01;

public class CarExample {

	public static void main(String[] args) {

//		Car ��ü����
		Car myCar = new Car();
//		Car myCar = null; ���������ڷ� ���� �۾��� �����߻� NPE
		
//		Car Ŭ������ ������� ��ü�� ������ �������� �����Ҹ� ����
//		�ʵ尪 �б�
//		. : ����������
		System.out.println("�𵨸� : " + myCar.model);
		System.out.println("�õ����� : " + myCar.start);
		System.out.println("����ӵ� : " + myCar.speed);
		
		
	}

}

package sec07.exam04;

// ������ �����ε�(overloading) : �����ڸ� ������ �����ϴ� �ǹ�
public class Car {
	
//	�ʵ弱��
	String company = "�����ڵ���";
	String model = "�׷���";
	String color = "���";
	int maxSpeed = 200;
	
//	������ ����
	
	Car() {} // ����Ʈ �����ڴ� �ٸ� �����ڼ��� ������ �ڵ����� �������� �����Ƿ� , �������� ������.
	
	Car(String model) {
		this.model = model;
	}
	
	Car(String model , String color) {
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color , int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}

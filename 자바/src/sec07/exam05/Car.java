package sec07.exam05;

// ������ �����ε�(overloading) : �����ڸ� ������ �����ϴ� �ǹ�
// ���ο� �����ڸ� �������� �ʰ�, ���� �����ڸ� ȣ���ϴ� ����. this()
public class Car {
	
//	�ʵ弱��
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
//	������ ���� 4�� : ������ �����ε�(overloading)
//	�Ű������� ������ Ÿ���� ������ �ٸ� ��츸 ������ ���ȴ�.
	
	Car(String model) {
		this(model,"����",250); // 24���� ������ ȣ��
	}
	
	Car(String model , String color) {
		this(model,color,250); // 24���� ������ ȣ��
	}
	
	Car(String model, String color , int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}

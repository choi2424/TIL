package sec09;

// Ŭ������ ���� �Ҷ� , �ν��Ͻ� ����� ���Ͽ� �˾ƺ���.
// Ŭ������ ��������� ����� 2������ �����ȴ�. �޸� ������ ������ �ִ�.(�߿�)
// 1)�ν��Ͻ� ��� 2)����(static)���
// �ڵ�� �ۼ��ϸ� ����� static Ű���带 ��� �� �� ��츦 �ν��Ͻ� ��� ����Ѵ�.
// ����� static Ű���带 ��� �� ��츦 ����(static) ��� ����Ѵ�.
public class Car {
	
//	�ʵ弱��
	String model;
	int speed;
	
//	main()�޼��尡 ������ �Ǹ� main()�޼��� �ȿ� ���� Ŭ������ ����ã�� �� Ŭ�����ȿ�
//	����(static)����� �����ϸ�, �޼��� �����̶�� ���� �����Ҹ� �����Ѵ�.
//	 new�� ����(static)����� �������� �޸𸮻������� �����Ѵ�. 
	static String Color;
//	�⺻������
//	Car() {};
	
//	�����ڼ���
	Car(String model){
		this.model = model; // �Ű������� this�� ���Ұ�
	}
	
//	�޼���
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		this.setSpeed(100);
		System.out.printf("%s�� �޸��ϴ�.(�ü� : %d km/h)\n",this.model,this.speed);
	}
	
	
	
}

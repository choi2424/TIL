package sec08.exam03;

public class CarExample {

	public static void main(String[] args) {
//		myCar ��ü����
		Car myCar = new Car();
		
//		setGas(5)
		myCar.setGas(5);
		
//		if isLeftGas : gas�� �����ϸ� "����մϴ�" �޼����� ����ϰ� , run()�޼ҵ�ȣ��
		if (myCar.isLeftGas() == true) {
			System.out.println("����մϴ�");
			myCar.run();
		}
		
		
//		"gas�� �����ϼ���" ���
		System.out.println("gas�� �����ϼ���");
	}

}

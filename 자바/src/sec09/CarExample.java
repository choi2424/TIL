package sec09;

public class CarExample {

	public static void main(String[] args) {
//		new : �޸� ���������� , CarŬ������ �ν��Ͻ� ����� ������, �������� �޸𸮸� �����Ѵ�
//											����(static)����� �����Ѵ�.
		Car myCar = new Car("������");
//		��������� myCar��ü�� �����Ͽ� ����� ����������, ������ ���Ѵ�.
		myCar.Color = "���";// c#���� �ڹ��� ������ �й������� ������� �ʴ´�.
		
		
		Car yourCar = new Car("����");
		
		
		myCar.run();
		yourCar.run();
	}

}

package sec08.exam04;

public class CalculatorExample {

	public static void main(String[] args) {
//		myCalcu ��ü����
		Calculator myCalcu = new Calculator();
		
//		result1 : ���簢���� ���� ���ϱ� . 10
		double result1 = myCalcu.areaRectangle(10.0);
		
//		result2 : ���簢���� ���� ���ϱ� 10, 20
		double result2 = myCalcu.areaRectangle(10.0, 20.0);
		
		System.out.println("���簢���� ���� = " + result1);
		System.out.println("���簢���� ���� = " + result2);
	}

}

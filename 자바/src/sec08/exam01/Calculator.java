package sec08.exam01;

// ��ü : ����
public class Calculator {
	
//	���ϰ��� ���� �޼��� : void
	void powerOn() {
		System.out.println("������ ŵ�ϴ�."); // powerOn()�޼��带 ȣ��(����)�ϰ�, ȣ���� ������ ��� �Ѿ��
	}
	
//	���ϰ��� ���� �޼���
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	
//	�� ������ �Է¹޾� ���ϴ� ���
	int plus(int x, int y) {
		int result = x + y;
		return result; // plus()�޼��带 ȣ���� �ڵ�� ���� ���� ��� �Ѿ��.
	}
//	�� ������ �Է¹޾� ���� ���
	int minus(int x, int y) {
		int result = x - y;
		return result;
	}
	
	int multiply(int x , int y) {
		int result = x * y;
		return result;
	}
	
//	�� ������ ���� �Է¹޾� ������ ���
	double divide(int x , int y) {
		double result = (double)x / y ;
		return result;
	}
	
	
}

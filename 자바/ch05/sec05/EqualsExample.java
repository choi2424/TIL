package ch05.sec05;

public class EqualsExample {

	public static void main(String[] args) {
//		String Ŭ���� : �������� ������ ������ ���ڿ� �������� �ּҸ� �����Ѵ�.

//		1)�⺻������ Ÿ�� ��Ÿ��
		String strVar1 = "ȫ�浿";
		String strVar2 = "ȫ�浿";
		
//		String ������ �ּҺ񱳴� == �񱳿����ڸ� ����Ѵ�.
		if (strVar1 == strVar2) {
			System.out.println("strVar1��strVar2�� ������ ����."); // �ּҰ� ����
		}else {
			System.out.println("strVar1��strVar2�� ������ �ٸ�."); // �ּҰ� �ٸ���
		}
		
//		������ ��
		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1��strVar2�� ���ڿ������Ͱ� ����.");
		}else {
			System.out.println("strVar1��strVar2�� ���ڿ������Ͱ� �ٸ�.");
		}
		
//		StringŬ������ ����Ÿ��������, �⺻������ Ÿ�� ��Ÿ�ϰ� ���������� Ÿ�� ��Ÿ�� 2���� Ư¡�� ������ �ִ�.
		
//		2)����Ÿ�� ��Ÿ�� . ����Ÿ���� �⺻������ �Ʒ�����ó�� ����ؾ� �Ѵ�.
//		"ȫ�浿" ���ڿ� �����Ͱ� �����ص�, �������� �����Ұ� ���� �����ȴ�.
		String strVar3 = new String("ȫ�浿");
		String strVar4 = new String("ȫ�浿");
		
//		�ּҺ�.
		if (strVar3 == strVar4) {
			System.out.println("strVar3��strVar4�� ������ ����.");
		}else {
			System.out.println("strVar3��strVar4�� ������ �ٸ�.");
		}
		
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3��strVar4�� ���ڿ������Ͱ� ����.");
		}
	}

}

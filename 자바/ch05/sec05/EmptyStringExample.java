package ch05.sec05;

public class EmptyStringExample {

	public static void main(String[] args) {
//		String Ŭ������ �ʱⰪ ����
//		����Ÿ���� ������ �ʱⰪ�� null �� �Ѵ�
//		. : ����������
		
		String hobby = ""; // null���ٴ� "" ���ڿ��� �ַ� ����Ѵ�.
		
//		�̶� hobby�� ���� null�� �ٲٸ� ������ �������� null�� ������ �Ҽ� ���⶧���̴�
		if(hobby.equals("")) {
			System.out.println("hobby ������ �����ϴ� String ��ü�� �� ���ڿ�.");
		}
		

	}

}

package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
//		ScannerŬ���� ��� ����
//		��� : �ܼ�ȯ�濡�� Ű����� �����͸� �Է¹޴� ����.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x �� �Է�: ");
		
//		scanner.nextLine(); �� �ڵ尡 ����Ǹ�, Ű����� �����͸� �Է¹��� �� �ִ� ��������
//		���� : Ű����� ������ �Է� -> ����Ű -> �Է��� �����Ͱ� ����(�ӽñ�����)����
		String strX = scanner.nextLine(); // �����Է��ؾ� �Ѵ�. ���ڰ� �ƴϸ� �����߻�
		int x = Integer.parseInt(strX);
		
		System.out.print("y�� �Է� : ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		
		System.out.println("x + y : " + result);
		
		while(true) {
			System.out.println("�Է� ���ڿ�: ");
			String data = scanner.nextLine();
//			�Է��� ������ q�� ������
			if (data.equals("q")) {
				break; // while���� ����
			}
			System.out.println("��¹��ڿ� : " + data);
			
		}
		
	}

}

package ch02.sec12;

public class PrintfExample {

	public static void main(String[] args) {
//		System.out.println(); �ܼ�ȭ��(�����)�� ���� ����ϴ� ���
		
//		��ǰ�� ���� : 123��
		int value = 123;
		System.out.println("��ǰ�� ���� : " + value + "��");
		
//		������ ��Ʈ���̸� %d
		System.out.printf("��ǰ�� ����: %d��\n", value );
//		%6d 6�� 6�ڸ��� ������ ����� , value �������� ������ ����
		System.out.printf("��ǰ�� ����: %6d��\n", value );
//		%-6d 6�� 6�ڸ��� ����, value�������� - ��������
		System.out.printf("��ǰ�� ����: %-6d��\n", value );
//		%6d 6�� 6�ڸ��� ������ ����� , value �������� ������ ���� , ���� 3�ڸ��� 0���� ä��
		System.out.printf("��ǰ�� ����: %06d��\n", value );
		
		double area = 3.14159265358 * 10 * 10;
		System.out.printf("�������� %d�� ���� ����:%10.2f\n",10, area); // 3.14159000 - > 3.1416 �ݿø� ó����.
		
		String name = "ȫ�浿";
		String job = "����";
		System.out.printf("%6d | %-10s | %10s\n" ,1,name,job);
		
		
		
//		��

	}

}

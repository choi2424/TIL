package ch02.sec01;

public class VariableEx02 {

	public static void main(String[] args) {
		
		int hour = 3; // ��������� ������ ���� �̸��� �ʱⰪ�̶�� �Ѵ�.
		int minute = 5;
		
//		System.out.println() : ���� �Ǵ� ���� �ֿܼ� ��½� ����ϴ� ���.
		System.out.println( hour + "�ð�" + minute + "��" );
		
//		3�ð� 5���� �� ��? 
		int totalMinute = (hour*60) + minute;
		System.out.println( "��" + totalMinute + "��" );

	}

}

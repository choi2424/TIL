package ch03.sec01;

public class IncDecOperatorExample {

	public static void main(String[] args) {
//		���� ������ : ++ , --
		int x = 10;
		int y = 10;
		int z ;
		
//		������ �ܵ����� ���Ǹ�, ������������ ��ġ�� ������� ������ +1 �ؼ� �����Ѵ�
		x++; // ������ ����������
		++x; // ������ ���������

		System.out.println("x = " + x);
		
		System.out.println("-----------------------");
//		������ �ܵ����� ���Ǹ�, ������������ ��ġ�� ������� ������ -1 �ؼ� �����Ѵ�
		y--;
		--y;
		System.out.println("y = " + y);
		
		System.out.println("-----------------------");
		
//		�Ʒ� ������ �ּ��� ������ ����, ���� Ȯ���Ѵ�
		z = ++x; // x�� ������ 1�� ���Ͽ� �������� ���� �о�ͼ� z������ ���� �����Ѵ�. 
//		z = x++; // x�� �������� ���� �о�ͼ� z������ ���� �����Ѵ� . �׸��� x�� 1�� ���Ͽ� �����Ѵ�.
		
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("-----------------------");
		z = ++x + y++ ;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}

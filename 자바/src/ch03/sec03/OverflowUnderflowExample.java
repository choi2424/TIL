package ch03.sec03;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
//		Overflow : ������Ÿ���� ����ϴ� �ִ밪�� �ʰ���
//		Underflow : ������Ÿ���� ����ϴ� �ּҰ��� �ʰ���
		
//		byte var1 = 128; �����߻�
		byte var1 = 125; // -128 ~ 127 ��밪
		for (int i = 0;  i<5; i++) {
			var1++; // 126 , 127 , -128 , -127 , -126 
			System.out.println("var1 : " + var1);
		}
		
		System.out.println("--------------------");
		
		byte var2 = -125; // -128 ~ 127 ��밪
		for (int i = 0;  i<5; i++) {
			var2--; // -126 , -127 , -128 , 127 , 126
			System.out.println("var2 : " + var2);
		}
		
		
	}

}

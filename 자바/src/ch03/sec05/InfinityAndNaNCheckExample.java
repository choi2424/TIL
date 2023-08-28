package ch03.sec05;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
//		0.0���� �� �Ǵ� �������� ���Ҷ� �����Ǵ� ������ �ذ�
		
		int x = 5;
		double y = 0.0;
		
		double z1 = x / y;
		double z2 = x % y;
		
		System.out.println(z1); // Infinity
		System.out.println(z2); // NaN
		
		System.out.println(z1 + 2); // Infinity
		System.out.println(z2 + 2); // NaN
		
//		�˸��� �ڵ�
		if(Double.isInfinite(z1) || Double.isNaN(z1)) {
			System.out.println("�� ���� �Ұ�");
		}else {
			System.out.println(z1+2);
		}
	}

}

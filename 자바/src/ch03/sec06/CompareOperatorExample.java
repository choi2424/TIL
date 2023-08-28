package ch03.sec06;

public class CompareOperatorExample {

	public static void main(String[] args) {
//		�񱳿����ڴ� true,false ���� �����Ѵ�.
//		1)����������
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		
		System.out.println("result1 : " + result1); // ����
		System.out.println("result2 : " + result2); // �����ʴ�.
		System.out.println("result3 : " + result3); // �۰ų�����
		
//		2) ���ڵ�����
		char char1 = 'A'; // �ƽ�Ű�ڵ尪 65
		char char2 = 'B'; // �ƽ�Ű�ڵ尪 66
		boolean result4 = (char1 < char2); // 65 < 66
		
//		3) ����,�Ǽ� ȥ�� �񱳿��� . ����� ���� ū ������Ÿ������ ����ȯ�Ǵ� ��Ģ(�߿�)
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 == num4); // int == double -> (double) int == double
		System.out.println("result5 : " + result5); // true 
		
//		4)�Ǽ� ������. ���е�(��ȿ�ڸ���).
		float num5 = 0.1f; // 0.2323122 -> double 0.232312200000000
		double num6 = 0.1; // 0.232312223242323
		boolean result6 = (num5 == num6); // float == double -> (double) float == double
		boolean result7 = (num5 == (float)num6); 
		System.out.println("result6 : " + result6); // false 
		System.out.println("result7 : " + result7); // true
		
//		5)���ڿ� ������
		String str1 = "�ڹ�";
		String str2 = "Java";
		boolean result8 = (str1.equals(str2)); // str1 == str2 �񱳽� ����ϸ� �ȵ�.(�߿�)
		boolean result9 = (!str1.equals(str2)); 
		System.out.println("result8 : " + result8); // false
		System.out.println("result9 : " + result9); // true
		
				

	}

}

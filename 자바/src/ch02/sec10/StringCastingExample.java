package ch02.sec10;

public class StringCastingExample {

	public static void main(String[] args) {
//		���ڿ� �����͸� �� ������ Ÿ�Կ� �°� ����ȯ�ϴ� ����
//		"10"
		int value1 = Integer.parseInt("10");
//		3.14 -> double 
		double value2 = Double.parseDouble("3.14");
//		"true" 
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("vlaue1 : " + value1);
		System.out.println("vlaue2 : " + value2);
		System.out.println("vlaue3 : " + value3);
		
		// 10 , 3.14 , true ���� ���ڿ��� ��ȯ
		String str1 =  String.valueOf(10);
		String str2 =  String.valueOf(3.14);
		String str3 =  String.valueOf(true);

		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
			
		
	}

}

package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		
//		�ڵ�����ȯ(������)
//		ū ������Ÿ�� = ���� ������Ÿ��;
//		byte < short, char < int < long < float < double
		
		byte byteValue = 10;
		// �ڵ�����ȯ. 1����Ʈ�� byteValue�� �������� �о�ͼ�  4����Ʈ�� ��ȯ �ǰ� �� ���� intValue�� ���Եȴ�
		int intValue = byteValue; // = ���Կ����ڸ� �������� ������ Ÿ�Կ� �������� Ÿ����ġ�� �߻� 
		
		System.out.println(intValue);
		
		char charValue = '��';
		intValue = charValue;
		System.out.println("���������ڵ� : " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue : "+ doubleValue);
				
				
	}

}

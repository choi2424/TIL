package ch02.sec02;

public class LongExample {

	public static void main(String[] args) {
//		long������Ÿ�� : ũ�� 8byte(64bit) ���� = -2^63 ~ 2^63-1		
		
		long var1 = 10; // 10�� int��
		long var2 = 20L; // long������Ÿ���� L or l�� ���̻�� ����Ѵ�.
//		long var3 = 1000000000000; ���� int������ �νĵǱ� ������ �����߻�. int�� ������ �����
		long var4 = 1000000000000l;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}

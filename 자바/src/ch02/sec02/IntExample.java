package ch02.sec02;

public class IntExample {

	public static void main(String[] args) {
//		int�� ������ Ÿ�� : ũ�� 4byte. ���尪 -2147483638~2147483647
		int var1 = 0b1011; // 2���� ǥ���� �տ� 0b�� �ִ´�.
		int var2 = 0206; // 8���� ǥ���� �տ� 0�� �ִ´�.
		int var3 = 365;
		int var4 = 0xB3; // 16���� �տ� 0x�� �ִ´�
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);

	}

}

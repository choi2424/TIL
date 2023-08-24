package ch02.sec04;

public class FloatDoubeExample {

	public static void main(String[] args) {
/*
  		�Ǽ� ������Ÿ��
  		float  : 4byte
  		double : 8byte
  		
  		����������Ÿ�Ժ��ٴ� �Ǽ� ������Ÿ���� ���� ������ Ȯ���ϱ� ���ؼ�
  		�ε�(floating)�Ҽ��� ����̶�� ���·� �Ǽ����� �����Ѵ�.
  		�ε��Ҽ���������� ���� �Ǽ����� ������ �����Ѵ�
  		��ǥ���� ��찡 0.1 + 0.2 != 0.3
  		0.1 + 0.2 = 0.30000000000000004
  		0.1�� �ε��Ҽ��� ������� ����Ǳ� ������ ������ 0.1�� ������� �ʾ� ������ ����.
  		������� �� ���� �´� ���̺귯���� ��� 
  		��ȣ��Ʈ + ������Ʈ + ������Ʈ�� �������� �����.
*/
		
		float var1 = 0.1234567890123456789f;
		// ������ ������Ÿ���� �������� d�� �ȳ־�ȴ� ����Ʈ�� d
		double var2 = 0.123456789123456789d; 
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		
		double var3 = 3e6; // 3*10^6
		float var4 = 3e6f; // 3*10^6
		double var5 = 2e-3; // 2*-10^3
		
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
	}

}

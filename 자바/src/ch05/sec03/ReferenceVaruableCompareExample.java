package ch05.sec03;

public class ReferenceVaruableCompareExample {

	public static void main(String[] args) {
//		����Ÿ�� ��ü(����) ��
		
//		int a = 10; �� �����ʹ� ���ÿ����� �����Ұ� �����ǰ� �������ȴ�.
		
//		����Ÿ������ ������ �����ϸ�, �� ������ �������� ������ �ּҸ� �����ϴ� �������� �����Ѵ� 
//		�׸��� ���ÿ����� �����Ұ� �����ǰ�, �ʱⰪ�� null���̴�
		int[] arr1;   // null
		int[] arr2;	  // null
		int[] arr3;   // null
		
//		�������� ���������Ͱ� ����Ǵ� �����Ҹ� �����ϰ�, �װ��� �ּҸ� �����ϴ� ����.
		arr1 = new int[] { 1 , 2 , 3 };
		arr2 = new int[] { 1 , 2 , 3 };
		arr3 = arr2; // arr2�� ����Ǿ� �ִ� �ּҸ� arr3�� �����Ѵ�.
		
//		�ּҺ�
		System.out.println(arr1 == arr2); // false
		System.out.println(arr2 == arr3); // true
		
		
	}

}

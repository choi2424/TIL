package ch05.sec06;

public class ArrayCreateByNewExample2 {

	public static void main(String[] args) {
//		�迭�� �ʱⰪ
		
		int[] arr1 = new int[3]; // new int[�迭ũ��]
		
		printArr1(arr1);
//		�迭 �׸��� �� ����
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		System.out.println();
		
		printArr1(arr1);
		
		System.out.println();
		
		double[] arr2 = new double[3];
		
		printArr2(arr2);
		
		System.out.println();
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		
		printArr2(arr2);
		
		System.out.println();
		
		
		
		String[] arr3 = new String[3];
		
		printArr3(arr3);
		
		System.out.println();
		
		arr3[0] = "1��";
		arr3[1] = "2��";
		arr3[2] = "3��";
		
		printArr3(arr3);
		
//		for���� �ݺ�
//		�޼��� 3���� �����ؼ� , arr1, arr2 , arr3 �ʱⰪ�� ����� ���� ��� �޼ҵ� 3�������
	}
//	arr1�� ����ϴ� �޼���
	public static void  printArr1(int[] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			System.out.printf("arr1 [ %d ] : %d \n", i , arr1[i]);
		} 	
		
	}
//	arr2�� ����ϴ� �޼���	
	public static void  printArr2(double[] arr2) {
		for (int i = 0; i < arr2.length; i++) {
			System.out.printf("arr2 [ %d ] : %f \n", i , arr2[i]);
		}
	}
//	arr3�� ����ϴ� �޼���
	public static void  printArr3(String[] arr3) {
		for (int i = 0; i < arr3.length; i++) {
			System.out.printf("arr3 [ %d ] : %s \n", i , arr3[i]);
		}
}
}

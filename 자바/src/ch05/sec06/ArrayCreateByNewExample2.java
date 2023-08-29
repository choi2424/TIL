package ch05.sec06;

public class ArrayCreateByNewExample2 {

	public static void main(String[] args) {
//		배열의 초기값
		
		int[] arr1 = new int[3]; // new int[배열크기]
		
		printArr1(arr1);
//		배열 항목의 값 변경
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
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		
		printArr3(arr3);
		
//		for문이 반복
//		메서드 3개를 정의해서 , arr1, arr2 , arr3 초기값과 변경된 값을 출력 메소드 3개만들기
	}
//	arr1을 출력하는 메서드
	public static void  printArr1(int[] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			System.out.printf("arr1 [ %d ] : %d \n", i , arr1[i]);
		} 	
		
	}
//	arr2을 출력하는 메서드	
	public static void  printArr2(double[] arr2) {
		for (int i = 0; i < arr2.length; i++) {
			System.out.printf("arr2 [ %d ] : %f \n", i , arr2[i]);
		}
	}
//	arr3을 출력하는 메서드
	public static void  printArr3(String[] arr3) {
		for (int i = 0; i < arr3.length; i++) {
			System.out.printf("arr3 [ %d ] : %s \n", i , arr3[i]);
		}
}
}

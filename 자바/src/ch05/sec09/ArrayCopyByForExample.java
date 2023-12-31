package ch05.sec09;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
//		배열은 크기를 변경 불가능.
//		배열복사
		
//		길이가 3인 배열
		int[] oldIntArray = { 1 , 2 , 3 };
		
//		길이가 5인 배열
		int[] newIntArray = new int[5]; // 배열은 int형이므로 초기값이 0 으로 설정됨
		
//		배열복사
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		
//		배열출력 : 배열복사 이후
		for (int i = 0; i < newIntArray.length; i++) {
			System.out.printf("%d,", newIntArray[i]);
		}
	}

}

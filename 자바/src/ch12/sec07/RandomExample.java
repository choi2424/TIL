package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

//	Random 예제
//	Random random = new Random(3); 고정된 값
//	Random random = new Random(); 랜덤값

public class RandomExample {

	public static void main(String[] args) {
//		선택번호
		int[] selectNumber = new int[6]; // 기본값 0
		Random random = new Random(3); // 종자값.
		System.out.print("선택번호 :");
		for (int i = 0; i < selectNumber.length; i++) {
			selectNumber[i] = random.nextInt(45) + 1; // 1~45범위의값
			System.out.print(selectNumber[i] + " ");
		}// 15 21 16 17 34 28
		System.out.println();
		
//		당첨번호
		int[] winningNumber = new int[6]; // 기본값 0
		random = new Random(5); // 종자값.
		System.out.print("선택번호 :");
		for (int i = 0; i < selectNumber.length; i++) {
			winningNumber[i] = random.nextInt(45) + 1; // 1~45범위의값
			System.out.print(winningNumber[i] + " ");
		} // 18 38 45 15 22 26
		System.out.println();
//		당첨여부
//		오름차순 정렬
		Arrays.sort(selectNumber); // 15 21 16 17 34 28
		Arrays.sort(winningNumber);// 18 38 45 15 22 26
		boolean result = Arrays.equals(selectNumber, winningNumber);
		if(result) {
			System.out.println("1등에 당첨");
		}else {
			System.out.println("낙첨");
		}
	}

}

package ch05.sec09;

public class ArrayCopyExample {

	public static void main(String[] args) {
//		 배열복사 : System.arraycopy() 메서드를 이용
		
//		길이가 3인 원본배열
		String[] oldStrArray = { "Java" , "array" , "copy" };
		
//		길이가 5인 사본배열
		String[] newStrArray = new String[5];
		
//		배열복사
		System.arraycopy(oldStrArray, 0, newStrArray, 2 , oldStrArray.length);
		
//		배열출력
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ",");
		}

	}

}

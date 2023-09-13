package ch12.sec05;

import java.util.StringTokenizer;

/*
	문자열 데이터에 구분자가 존재 했을 경우, 구분자를 이용하여 작업하는 예제
 */

public class StringTokenizerExample {

	public static void main(String[] args) {
		String data1 = "홍길동&이수홍,박연수"; // db정보
		String[] arr = data1.split("&|,");  // | or 의미
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		String data2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(data2, "/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}

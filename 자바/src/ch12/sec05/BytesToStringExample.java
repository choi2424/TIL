package ch12.sec05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

//	String클래스와 인코딩 예제.
//	자바의 문자열에 대한 기본인코딩 : UTF-8
//	문자열 - > 바이트배열 ,   바이트배열 -> 문자열 변환작업 문법지원.
public class BytesToStringExample {

	public static void main(String[] args) throws Exception {
		String data = "자바";
		
//		String -> byte배열(기본 : UTF - 인코딩) 한글 3바이트
		byte[] arr1 = data.getBytes(); // 6바이트 기억장소
//		byte[] arr1 = data.getBytes("UTF-8");
		System.out.println("arr1 : " + Arrays.toString(arr1));
		
//		byte배열 -> String(기본 : UTF-8 인코딩)
		String str1 = new String(arr1);
//		String str1 = new String(arr1 , "UTF-8");
		System.out.println("str1 : " + str1);
		
		byte[] arr2 = data.getBytes("Euc-KR");
		System.out.println("arr2 : " + Arrays.toString(arr2));
		
		String str2 = new String(arr2,"EUC-KR");
		System.out.println("str2 : " + str2);
		
	}

}

package ch18.sec06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/*	보조스트림(2차스트림)
 	- 메인스트림(1차스트림)을 기반으로하여, 보조적으로 추가하여 사용하는 스트림.
	- 문자변환스트림 : InputStreamWriter, OutputStreamWriter
	바이트기반 스트림 -> 문자기반 스트림으로 변환하여 작업할 때 사용.
*/


public class CharacterConvertStreamExample {
	
	public static void main(String[] args) throws Exception{
		
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}
	
//	파일생성하여 , 문자데이터 쓰기작업. 출력스트림
	public static void write(String str) throws Exception {
//		스트림객체를 생성하면 , 파일이 생성 . 자바는 기본 인코딩 UTF-8
		OutputStream os = new FileOutputStream("C:/dev/devTools/temp/test.txt");
		
//		작업
		
//		스트림  -> 문자 기반으로 변환작업 . OutputStreamWriter
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		writer.write(str); // 스트림 안에 내용이 채워진 상태
		writer.flush(); // 스트림 안의 내용을 파일에 쓰는 작업. 버퍼가 비워짐
		writer.close(); // 메모리 비활성화.
	}
	
//	파일의 내용을 읽기작업 , 입력스트림
	public static String read() throws Exception {
		InputStream is = new FileInputStream("C:/dev/devTools/temp/test.txt");
		
//		작업
		
//		스트림 -> 문자 기반으로 변환작업 . InputStreamReader
		Reader reader = new InputStreamReader(is, "UTF-8");
		char[] data = new char[100];
		int num = reader.read(data); // 
		reader.close();
		
//		문자열 변환
		String str = new String(data, 0, num); // 읽어오는데이터 ,어디서부터 읽어올지, 읽어오는 데이터 갯수
		
		
		return str;
	}
	
}

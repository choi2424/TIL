package ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {

	public static void main(String[] args) throws Exception {
//		파일복사 예제.
		
		String originalFileName = "c:/dev/devtools/temp/test.jpg";
		String targetFileName = "c:/dev/devtools/temp/test2.jpg";
		
//		입력스트림은 test.jpg 파일을 읽는 목적
		InputStream is = new FileInputStream(originalFileName);
		OutputStream os = new FileOutputStream(targetFileName);
		
		byte[] data = new byte[1024];
		
//		입력스트림 작업 : test.jpg 파일의 내용을 읽어서 , 출력스트림 내부에 쓰기작업.
		while(true) {
			int num = is.read(data);
			if(num == -1)break;
			os.write(data,0,num); // 출력 스트팀 내부에 작업
		}
		
		os.flush(); // 출력스트림에 있던 내용을 사본파일(test2.jpg)에 쓰기. 스트림 안은 비워진다.
		os.close();
		is.close();
		
		System.out.println("복사 성공");
	}

}

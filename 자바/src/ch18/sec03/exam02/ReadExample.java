package ch18.sec03.exam02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
	
	public static void main(String[] args) {
//		파일의 내용을 읽어오는 예제
		
		try {
			InputStream is = new FileInputStream("C:/dev/devTools/temp/test2.db");
			
			byte[] data = new byte[100];
			
			while (true) {
				int num = is.read(data); // data배열의 크기만큼 읽어온다 , 실제 데이터는 3바이트이므로 , 3바이트만 읽어온다
				if(num == -1) break;
				
				for (int i = 0; i < num; i++) {
					System.out.println(data[i]);
				}
				
				
			}
			is.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

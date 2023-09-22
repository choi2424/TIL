package ch18.sec02.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
	
	public static void main(String[] args) {
		
		try {
			OutputStream os = new FileOutputStream("C:/dev/devTools/temp/test2.db");
			
			byte[] array = { 10 , 20 , 30 };
			
//			버퍼(빨대안) 내용 채우기
			os.write(array);
			
//			버퍼(빨대만) 내용 쓰기 - test2,db
			os.flush();
			
//			스트림객체닫기(빨대제가)
			os.close();
			
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}
}

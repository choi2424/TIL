package ch18.sec04.exam02;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
	
	public static void main(String[] args) {
//		문자기반의 입력스트림 작업
		
		Reader reader = null;
		
		try {
			
//			문자단위로 읽기
			reader = new FileReader("C:/dev/devTools/temp/test.txt");
			while(true) {
				int data = reader.read();
				if(data == -1) break;
				System.out.print((char)data);
			}
			reader.close();
			System.out.println();
			
//			문자 배열로 읽기
			reader = new FileReader("C:/dev/devTools/temp/test.txt");
			char[] data = new char[100]; 
			while(true) {
				int num = reader.read(data); // 배열의 크기만큼 읽기. 200바이트씩 읽기.
				if(num == -1) break;
				for (int i = 0; i < num; i++) {
					System.out.print(data[i]);
				}
			}
			
		} catch (IOException e) {}
		
	}
}

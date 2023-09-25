package ch18.sec07.exam01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//	보조스트림을 사용 유무에 따른 복사예제.
//	버퍼스트림 . BufferedInputStream  BufferedOutputStream  
public class BufferExample {

	public static void main(String[] args) throws Exception {
//		입출력 스트림 생성
		String originalFilePats1 = BufferExample.class.getResource("test.jpg").getPath();
		String targetFilePath1 = "C:/dev/devTools/temp/test.jpg";
		FileInputStream fis = new FileInputStream(originalFilePats1); // 파일존재
		FileOutputStream fos = new FileOutputStream(targetFilePath1); // 파일생성
		
//		입출력 스트림 생성 + 버퍼스트림 생성(보조)
		String originalFilePats2 = BufferExample.class.getResource("test2.jpg").getPath();
		String targetFilePath2 = "C:/dev/devTools/temp/test2.jpg";
		
		FileInputStream fis2 = new FileInputStream(originalFilePats2); // 메인스트림
		BufferedInputStream bis = new BufferedInputStream(fis2); // 보조스트림
		
		
//		버퍼보조스트림
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2); // 메인스트림
		BufferedOutputStream bos = new BufferedOutputStream(fos2); // 보조스트림
		
//		파일복사기능
		long nonBufferTime = copy(fis, fos); // 버퍼스트림 미사용
		System.out.println("버퍼스트림 미사용:\t" + nonBufferTime + "ns");
		
		long bufferTime = copy(bis, bos); // 버퍼스트림 사용
		System.out.println("버퍼스트림 사용\t" + bufferTime + "ns");
		
//		입출력스트림에서는 객체생성하면, 객체닫기를 반드시 해야한다. 닫기순서는 생성을 역순으로 하면된다.
		fis.close();
		fos.close();
		
		bis.close();
		fis2.close();
		
		bos.close();
		fos2.close();
	}
	
//	파일복사기능 . 버퍼보조스트림 사용유무에 따른 시간체크
	public static long copy(InputStream is , OutputStream os) throws Exception {
		
//		시작시간
		long start = System.nanoTime(); // 1970.1.1.0:00:00
		
//		복사작업
		while(true ) {
			int data = is.read(); // 입력스트림 (읽기)
			if(data == -1) break;
			os.write(data); // 출력스트림 (쓰기)
		}
		
//		종료시간
		long end = System.nanoTime();
		
		return(end-start); // 복사시간
	}
	
	
}

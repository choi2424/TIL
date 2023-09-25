package ch18.sec10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("C:/dev/devTools/temp/object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
//		객체생성
		Member m1 = new Member("fall", "단풍이");
		Product p1 = new Product("노트북", 1500000);
		int[] arr1 = { 1 , 2 , 3 };
		
//		객체를 직렬화하여 파일에 저장
		oos.writeObject(m1);
		oos.writeObject(p1);
		oos.writeObject(arr1);
		
//		객체닫기 
		oos.flush();
		oos.close();
		fos.close();
		
//		입력스트림 작업
//		보조스트림 작업
		FileInputStream fis = new FileInputStream("C:/dev/devTools/temp/object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
//		파일의 내용을 읽고 역직렬화해서 객체로 복원 . 직렬화 순서 일치
		Member m2 = (Member) ois.readObject();
		Product p2 = (Product) ois.readObject();
		int[] arr2 = (int[])ois.readObject(); 
			
		ois.close();
		fis.close();
		
//		복원된 객체 내용확인
		System.out.println(m2);
		System.out.println(p2);
		System.out.println(Arrays.toString(arr2));
		
		
		
	}

}

package ch18.sec11;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	
	public static void main(String[] args) throws Exception {
		
		File dir = new File("C:/dev/devTools/temp/images");
		File file1 = new File("C:/dev/devTools/temp/file1.txt");
		File file2 = new File("C:/dev/devTools/temp/file2.txt");
		File file3 = new File("C:/dev/devTools/temp/file3.txt");
		
//		존재하지 않으면 와파일또는 폴더 생성작업
		if( dir.exists() == false ) { dir.mkdirs(); }
		if( file1.exists() == false) { file1.createNewFile();}
		if( file2.exists() == false) { file2.createNewFile();}
		if( file3.exists() == false) { file3.createNewFile();}
		
//		Temp폴더의 내용을 출력
		File temp = new File("C:/dev/devTools/temp");
		File[] contents = temp.listFiles();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for (File file : contents) {
			System.out.printf("%-25s",sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.printf("%-10s%-20s","<DIR>",file.getName()); // 폴더명
			}else {
				System.out.printf("%-10s%-20s",file.length(),file.getName()); // 파일명
			}
			System.out.println();
		}
		
		
	}
}

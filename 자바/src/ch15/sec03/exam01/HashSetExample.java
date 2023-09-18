package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

// 인터페이스를 구현한 클래스 : 저장순서를 유지하지 않는다. 객체가 중복되지 않는다.
// package ch12.sec03.exam02; 패키지의 HashSetExample.java 예제 참고할 것.
public class HashSetExample {

	public static void main(String[] args) {
		
//		HashSet<String> set = new HashSet<String>();
		Set<String> set = new HashSet<String>();
		
		//객체저장
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // 중복객체이므로 저장하지 않음.
		set.add("MyBatis");
		
		// 저장된 객체 수 출력
		int size = set.size();
		System.out.println("총 객체수 : " + size); // 총 객체수 : 4
		
		
		
	}

}

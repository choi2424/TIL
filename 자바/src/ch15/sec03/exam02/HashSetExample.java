package ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		// 
		Set<Member> set = new HashSet<Member>();
		
//		set.add(new Member("홍길동", 30));
//		set.add(new Member("홍길동", 30));

		Member set1 = new Member("홍길동", 30);
		set.add(set1);
		Member set2 = new Member("홍길동", 30);
		set.add(set2);

		System.out.println("총 객체 수 : " + set.size());
	}

}

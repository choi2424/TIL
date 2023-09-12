package ch12.sec03.exam02;

import java.util.HashSet;

//	HashSet 컬렉션 클래스 : 객체를 저장시 사용하는 기능제공. 동일객체를 중복저장 불가능
//	이 예제를 테스트할 경우 Student 클래스 hashCode(), equals()의 재정의 구문을 주석을 번갈아 사용함으로써 확인
public class HashSetExample {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		
		Student s1 = new Student(1, "홍길동");
		hashSet.add(s1); // 내부적으로 hashCode()와 equals()메서드가 사용이되여 중복검사가 발생한다.
		System.out.println("저장된 객체수 : " + hashSet.size());
		
		Student s2 = new Student(1, "홍길동");
		hashSet.add(s2);
		System.out.println("저장된 객체수 : " + hashSet.size());
		
		Student s3 = new Student(2, "홍길동");
		hashSet.add(s3);
		System.out.println("저장된 객체수 : " + hashSet.size());
	}

}

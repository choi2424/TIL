package ch15.sec01.exam01;

import java.util.ArrayList;

/*
	컬렉션 : 기억장소 . 객체를 저장하는 목적으로 존재하는 기억장소
		-배열의 특징
		  -> 동일한 데이터타입으로, 연속적인 형태의 기억장소를 하나의 이름으로 관리
		  -> 길이가 고정되어 있어, 길이 변경 불가능.
	예)	int[] arr = new int[5];
	
		arr.length;
		arr.length = 5 // 에러발생
		
		-컬렉션의 특징
			-> 컬렉션 기능을 제공하는 클래스를 통하여, 객체를 생성 했을시 힙영역에 기본크기의 기억장소가 생성
			-> 데이터가 추가 할때마다 기억장소가 자동으로 생성이되어, 데이터를 저장하는 특징이있다
		
 	제너릭 :  
 */
public class GenericCollectionBasic {
	
	public static void main(String[] args) {
//		컬렉션 기능을 제공하는 클래스
//		<> 타입 파라미터 = 제네릭문법이 적용된 클래스
//		제너릭을 이용하지 않는 컬렉션 클래스 사용
//		제너릭이 나오기전에는  Object 최상위 클래스로 모든데이터타입을 다 넣었었다
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(10.5);
		al.add(true);
		al.add("홍길동");
		
		al.add(new Car());
		al.add(new Person());
		

//		제너릭을 이용한 컬렉션 클래스 사용
//		컬렉션 형태의 구조를 가지고 있는 기억장소는 내부적으로 데이터를 Object클래스로 관리한다
		ArrayList al2 = new ArrayList();
//		제너릭 클래스를 사용할 경우에는 참조타입만 가능.
		ArrayList<String> al3 = new ArrayList<String>();
//		al3라는 객체가 가리키는 힙영역에 컬렉션 구조를 가지고있는 기억장소에 실제 저장하는 데이터타입은 String으로하겠다
		al3.add("홍길동");
		al3.add("손흥민");
		
		ArrayList<Car> al4 = new ArrayList<Car>();
		al4.add(new Car());
		
//		al5
		ArrayList<Person> al5 = new ArrayList<Person>();
		al5.add(new Person());
		
		
		
	}
}

class Car{
}

class Person {
	
}
	
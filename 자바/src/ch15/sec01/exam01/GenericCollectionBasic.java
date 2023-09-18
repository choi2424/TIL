package ch15.sec01.exam01;

import java.util.ArrayList;

/*
	컬렉션 : 기억장소 . 객체를 저장하는 목적으로 존재하는 기억장소
		-배열비교
		  -> 동일한 데이터타입으로, 연속적인 형태의 기억장소를 하나의 이름으로 관리
		  -> 길이가 고정되어 있어, 길이 변경 불가능.
	예)	int[] arr = new int[5];
	
		arr.length;
		arr.length = 5 // 에러발생
		
	- 컬렉션 특징
		-> 컬렉션 기능을 제공하는 클래스를 통하여, 객체를 생성 했을시 힙영역에 기본크기의 기억장소가 생성.
		-> 데이터를 추가 할 때마다, 기억장소가 자동으로 생성이되며, 데이터를 저장하는 특징.
	
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
		
		System.out.println(al.get(0));

		
		
		for (int i = 0; i < al.size(); i++) {
		    Object element = al.get(i);
		    System.out.println(element);
		}
		
//		제너릭을 이용한 컬렉션 클래스 사용
		// 컬렉션 형태의 구조를 가지고 있는 기억장소는 내부적으로 데이터를 Object클래스로 관리한다.
		ArrayList al2 = new ArrayList();
		
		// 제네릭 클래스를 사용할 경우 참조타입만 가능.
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("홍길동");
		al3.add("손흥민");

		ArrayList<Car> al4 = new ArrayList<Car>();
		al4.add(new Car());
		System.out.println("al4 : " + al4);
		
		// al5
		ArrayList<Person> al5 = new ArrayList<Person>();
		al5.add(new Person());		
		System.out.println("al5 : " + al5);
		System.out.println("al5.get(0) : " + al5.get(0));
		
		
		
//		System.out.println(al2);
		
		ArrayList<String> list = new ArrayList<>();
		list.add("name1");
		list.add("name2");
		list.add("name3");
		
		System.out.println(list);
		System.out.println("list.get(1) : " + list.get(1));
		
		ArrayList<Integer> list_int = new ArrayList<>();
		// 기본 데이터 타입은 사용 할 수 없고, 참조형 데이터 타입을 사용해야 한다.
	}
}

class Car{
}

class Person {
	
}

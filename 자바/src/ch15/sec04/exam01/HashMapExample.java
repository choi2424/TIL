package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// Map 인터페이스를 구현한 HashMap 클래스 예제.
// key, value 한쌍의 구조로 되어 관리된다. 한쌍의 구조를 Entry로 부른다.
// key는 중복불가능, value값은 중복 허용.
public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("홍길동", 85);
		map.put("이순신", 95);
		map.put("홍범도", 80);
		map.put("홍길동", 80); // "홍길동" key가 중복되어 기존 키에 덮어씌워져 값이 저장된다.
		
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
		
		// 키로 값 얻기.
		String key = "홍길동";
		int value = map.get(key); // get() 의 값을 "홍길동"을 입력하여 value값을 받아온다.
		System.out.println(key + " : " + value);
		System.out.println();
		
		// map -> set으로 참초하여, iterator객체로 작업
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next(); // map.put("홍길동", 85); 저장되어 있는
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + " : " + v);
			
		}
		System.out.println();
		
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
		
	}

}

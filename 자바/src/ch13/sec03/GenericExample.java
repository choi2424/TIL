package ch13.sec03;

public class GenericExample {
	
//	제네릭으로 설계된 메서드
//	<T> 리턴타입 <T> 메서드명 (T 매개변수); 
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	
	
	public static void main(String[] args) {
//		제네릭 메서드 호출
		Box<Integer> box1 = boxing(100); // <Integer> Box<Integer> boxing(Integer t) 
		int intValue = box1.get();
		System.out.println(intValue);
		
		
		Box<String> box2 = boxing("홍길동");
		String str = box2.get();
		System.out.println(str);
	}
}

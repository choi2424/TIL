package ch13.sec03;

//	제너릭 클래스 정의 : 클래스명<T> 
//	제너릭 클래스 사용 : 예) Box<String> b1 = new Box() <> ;
public class Box<T> {
	
//	필드
	private T t;
	
//	Getter 메서드
	public T get() {
		return t;
	}
	
//	Setter 메서드
	public void set(T t) {
		this.t = t;
	}
	
	
}

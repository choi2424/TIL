package ch08.sec02;

//	인터페이스 상속목적으로 설계, 추상클래스도 동일. new를 이용한 객체생성작업은 불가능하다.
//	전자제품의 리모컨 : 규격
public interface RemoteControl {
	
// 일반 메서드 선언 불가능
//	public void trunOn() {
//		System.out.println("출발");
//	}
	
//	추상 메서드
	public void trunOn(); // 컴파일작업 public abstract void trunOn();  
	
}

package ch16.sec01;

//	함수형 인터페이스 : 인터페이스가 단 하나의 추상메서드를 가지고 있는 것
//	인터페이스에 익명구현객체를 람다식으로 표현하려면 , 함수형 인터페이스 이어야 한다.
@FunctionalInterface // 컴파일과정에서 추상메서드가 하나인지 검사를 한다 . 명시적으로 사용하여 컴파일러에게 함수형 인터페이스 라고 정보를 알려줌
public interface Calculable {
	
//	추상메서드
	void claculate(int x , int y);
}

package ch05.sec03;

public class ValueTypeReferenceType {

	public static void main(String[] args) {
		/*
		 * 기본타입과 참조타입의 기억장소 관리
		 * 
		 * 기본타입 : 8개, 정수형타입(byte , short , char , int , long) , 실수형타입( float , double) ,
		 *  논리형타입 - boolean 
		 *  참조타입 : 4개, 배열 , 열거 , 클래스 , 인터페이스
		 * 
		 *  JVM은 프로그램 실행시, 필요한 기억장소를 , 매서드영역 , 스택영영 , 힙영역 형태로 나누어 사용한다.
		 *  3 영역은 각각 프로그램에 필요한 정보를 관리한다.
		 *  메서드영역 : 클래스파일(byte code)을 읽어들인 코드가 사용
		 *  스택영역 : 기본데이터타입 , 참조타입 사용
		 *  힙영역 : 참조타입만 사용
		 */		
		int a = 10; // 기본타입 : 정수형 문법
		
		double[] arr = new double[] { 1 , 2 , 3 }; // 참조타입 : 배열문법
		/* 참조타입은 
		 * 1)int[] arr : 구문은 스택영역에 기억장소 생성,
		 * 2)arr = new int[] {1,2,3} : 구문은 힙영역에 기억장소가 생성된다. 그리고, 생성된 기억장소의 주소가 스택영역에 대입된다. 
		 * 주소는 4바이트의 기억장소를 사용한다
		 */	
		}

}

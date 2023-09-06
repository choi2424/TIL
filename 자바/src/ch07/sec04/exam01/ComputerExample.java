package ch07.sec04.exam01;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		
//		부모클래스 Calculator 객체생성 .. 자식 Computer 클래스 상관x
		Calculator  calculator= new Calculator();
		
		System.out.println("원 면적 : " + calculator.areaCircle(r)); // 부모 자신의 메서드 호출
		System.out.println();
		
//		자식클래스 Computer 객체생성.
		Computer computer = new Computer();
		
		System.out.println("원 면적 : " + computer.areaCircle(r)); // 자식 자신의 메서드 호출
		
//		부모클래스의 areaCircle() 메서드가 목록에서 숨겨저 있음. 호출하는 방법은 super.areaCircle()
		
	}

}

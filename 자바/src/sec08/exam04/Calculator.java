package sec08.exam04;

public class Calculator {
//	메서드 오버로딩(overloading) : 하나의 클래스에서 동일한 메소드명을 여러개 정의할 수 있는 기능.	
//	사각형의 넓이
	
	
//	정사각형의 넓이 . areaRectangle
	double areaRectangle(double width) {
		return width * width;
	}
	
	
	
//	직사각형의 넓이 . areaRectangle
	double areaRectangle(double width , double height) {
		return width * height;
	}
	
}

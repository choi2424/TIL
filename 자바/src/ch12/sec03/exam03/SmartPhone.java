package ch12.sec03.exam03;

//	Object클래스의 toString메서드 재정의
//	toString() - "클래스명@16진수해시코드"로 구성된 문자열을 리턴
//	hashCode : 객체가 참조하는 주소를 내용으로 객체를 식별하는 목적으로 만든 유일한 정수값. 
public class SmartPhone /* extends Object */{ 
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
//	재정의 했을때 안했을때 차이점 확인
//	재정의 내용 : 클래스의 필드 정보를 요약형태로 보여주는 특징.
	@Override
	public String toString() {
		
		return company + "," + os;
	}
	
}

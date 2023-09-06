package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
//		SmartPhone 객체생성 . 부모클래스 를 가지고 있는 SmartPhone클래스 
		SmartPhone myPone = new SmartPhone("갤럭시", "은색");
		
//		Phone으로부터 상소받은 필드 읽기.
		System.out.println("모델 : " + myPone.model);
		System.out.println("색상 : " + myPone.color);
		
//		SmartPhone의 필드 읽기
		System.out.println("와이파이 상태 :" + myPone.wifi);
		
//		Phone으로부터 상속받은 메서드 호출하기
		myPone.bell();
		myPone.sendVoice("여보세요");
		myPone.receiveVoice("안녕하세요 ! 저는 홍길동인데요");
		myPone.sendVoice("아~ 네! , 반갑습니다");
		
//		SmartPhone의 메서드 호출
		myPone.setWifi(true);
		myPone.internet();
		
	}

}

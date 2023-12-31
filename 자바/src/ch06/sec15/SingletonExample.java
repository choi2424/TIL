package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
		
//		싱글톤 클래스는 외부에서 객체생성이 불가능하다.
//		Singleton obj1 = new Singleton(); 컴파일 에러
//		Singleton obj2 = new Singleton(); 컴파일 에러
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton객체입니다.");
		}else {
			System.out.println("다른 Singleton객체입니다.");
		}
		
	}

}

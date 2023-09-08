package ch08.sec08;

public class MultiInterfaceImplExample {

	public static void main(String[] args) {
		RemoteControl rc = new SmartTelevision();
		
		rc.turnOn();
		rc.turnOff();
//		rc.search(); 사용불가
		Searchable searchable = new SmartTelevision();		
		
		searchable.search("http://www.youtube.com");
//		searchable.turnOn();  사용불가능
//		searchable.turnOff(); 사용불가능
		
//		SmartTelevision st = new SmartTelevision(); 3개의 메서드가 접근가능.
		
		
	}

}

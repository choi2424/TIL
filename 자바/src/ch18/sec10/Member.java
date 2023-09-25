package ch18.sec10;

import java.io.Serializable;

//	직렬화 작업에 사용할 클래스는 Serializable 인터페이스를 상속(구현)해야 한다.

public class Member implements Serializable{
	
	private static final long serialVersionUID = 32372156165156L; 
	private String id;
	private String name;
	
	public Member(String id,String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		
		return id + " : " + name;
	}
	
}

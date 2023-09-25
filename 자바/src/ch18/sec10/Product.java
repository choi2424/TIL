package ch18.sec10;

import java.io.Serializable;

//	직렬화 작업에 사용할 클래스는 Serializable 인터페이스를 상속(구현)해야 한다.
// 	serialVersionUID 필드 : 직렬화 할때 사용한 클래스와 역질렬화 할때 사용한 클라스가 기본적으로 동일한 클라스여야한다


public class Product implements Serializable{

	private String id;
	private int price;
	
	public Product(String id,int price) {
		this.id = id;
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		return id + " : " + price;
	}
	
}

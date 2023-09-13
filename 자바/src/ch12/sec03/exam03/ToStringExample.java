package ch12.sec03.exam03;

public class ToStringExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("삼성전자","안드로이드");
		
		String strobj = myPhone.toString();
		System.out.println(strobj);
		
		System.out.println(myPhone); // toString()메서드가 내부적으로 호출
	}

}

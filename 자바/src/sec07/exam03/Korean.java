package sec07.exam03;

public class Korean {
//	필드선언
	String nation = "대한민국";
	String name; // 값이 달라져야 한다.
	String ssn; // 값이 달라져야한다
	
//	매개변수가 있는 생성자 선언
//	생성자의 파리미터명과 필드명이 동일한 경우 , 필드명은 this.필드명으로 구분해서 사용해야 한다.
	public Korean(String name , String ssn){
		this.name = name;
		this.ssn = ssn;
	}
}

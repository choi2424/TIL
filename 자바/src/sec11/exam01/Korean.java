package sec11.exam01;

/*
	final : 필드에 사용이되면, 초기값을 변경 불가능.

*/
public class Korean {

//	final : 최종적인 사전뜻.
	 final String nation = "대한민국";
	 final String ssn;
	
	String name;
	
//	생성자 작업을 하지 않으면 , ssn 필드 에러발생됨.
	public Korean( String ssn , String name ) {
		this.ssn = ssn;
		this.name = name;
		
	}
	
}

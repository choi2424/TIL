package sec10.exam01.staticmember;

// 정적(static) 키워드를 클래스의 멤버에 사용시 공유목적으로 사용.

// 대출 예제.

public class Loan {
//	대출상품의 이율은 고정금리 3%이다.
	
//	이율(iYul)을 정적(static) 멤버로 변경하면, 메서드 영역에 단 1번만 생성이 되면서, 기억장소를 공유목적으로 사용가능해진다
//	1000개의 대출이 생성될 때, 1000번의 객체생성 구문에서 힙영역의 메모리 생성이 제외가 되어, 불필요한 기억장소의 낭비를 방지.
	
	
//	이름, 금액 , 이율
	String name;
	int price;
	static int iYul = 3;
	
	Loan(String name, int price){
		this.name = name;
		this.price = price;
		
		
				
	}
}

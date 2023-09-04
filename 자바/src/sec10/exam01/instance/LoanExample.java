package sec10.exam01.instance;

public class LoanExample {

	public static void main(String[] args) {
//		홍길동 대출
		Loan loan1 = new Loan("홍길동", 5000, 3);
		
//		손흥민 대출
		Loan loan2 = new Loan("손흥민", 3000, 3);
		
//		이강인 대출
		Loan loan3 = new Loan("이강인", 8000, 3);
		
		System.out.printf("%s 대출정보는? %d원이고 %d이율입니다. \n",loan1.name,loan1.price,loan1.iYul);
		System.out.printf("%s 대출정보는? %d원이고 %d이율입니다. \n",loan2.name,loan2.price,loan2.iYul);
		System.out.printf("%s 대출정보는? %d원이고 %d이율입니다. \n",loan3.name,loan3.price,loan3.iYul);
		
//		고정금리이지만 , 코로나로 인하여 금융정책 변화발생 . 3% -> 5%
		
//		변경작업 , 힙영역에 각각의 기억장소가 생성되어 있는 곳을 접근.
		loan1.iYul = 5;
		loan2.iYul = 5;
		loan3.iYul = 5;
		
		System.out.println("-------------이율이 3% -> 5%로 변경----------");
		
		System.out.printf("%s 대출정보는? %d원이고 %d이율입니다. \n",loan1.name,loan1.price,loan1.iYul);
		System.out.printf("%s 대출정보는? %d원이고 %d이율입니다. \n",loan2.name,loan2.price,loan2.iYul);
		System.out.printf("%s 대출정보는? %d원이고 %d이율입니다. \n",loan3.name,loan3.price,loan3.iYul);
		
	
	}

}

package sec10.exam01.staticmember;

public class LoanExample {

	public static void main(String[] args) {
//		ȫ�浿 ����
		Loan loan1 = new Loan("ȫ�浿", 5000);
		
//		����� ����
		Loan loan2 = new Loan("�����", 3000);
		
//		�̰��� ����
		Loan loan3 = new Loan("�̰���", 8000);
	
		System.out.printf("%s ����������? %d���̰� %d�����Դϴ�. \n",loan1.name,loan1.price,Loan.iYul);
		System.out.printf("%s ����������? %d���̰� %d�����Դϴ�. \n",loan2.name,loan2.price,Loan.iYul);
		System.out.printf("%s ����������? %d���̰� %d�����Դϴ�. \n",loan3.name,loan3.price,Loan.iYul);
		
		
//		������ 3% -> 5% �� ����
		
		Loan.iYul = 5;
		
		System.out.println("-------------������ 3% -> 5%�� ����----------");
		
		System.out.printf("%s ����������? %d���̰� %d�����Դϴ�. \n",loan1.name,loan1.price,Loan.iYul);
		System.out.printf("%s ����������? %d���̰� %d�����Դϴ�. \n",loan2.name,loan2.price,Loan.iYul);
		System.out.printf("%s ����������? %d���̰� %d�����Դϴ�. \n",loan3.name,loan3.price,Loan.iYul);
		
	}

}

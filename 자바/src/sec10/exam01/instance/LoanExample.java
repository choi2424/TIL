package sec10.exam01.instance;

public class LoanExample {

	public static void main(String[] args) {
//		ȫ�浿 ����
		Loan loan1 = new Loan("ȫ�浿", 5000, 3);
		
//		����� ����
		Loan loan2 = new Loan("�����", 3000, 3);
		
//		�̰��� ����
		Loan loan3 = new Loan("�̰���", 8000, 3);
		
		System.out.printf("%s ����������? %d���̰� %d�����Դϴ�. \n",loan1.name,loan1.price,loan1.iYul);
		System.out.printf("%s ����������? %d���̰� %d�����Դϴ�. \n",loan2.name,loan2.price,loan2.iYul);
		System.out.printf("%s ����������? %d���̰� %d�����Դϴ�. \n",loan3.name,loan3.price,loan3.iYul);
		
//		�����ݸ������� , �ڷγ��� ���Ͽ� ������å ��ȭ�߻� . 3% -> 5%
		
//		�����۾� , �������� ������ �����Ұ� �����Ǿ� �ִ� ���� ����.
		loan1.iYul = 5;
		loan2.iYul = 5;
		loan3.iYul = 5;
		
		System.out.println("-------------������ 3% -> 5%�� ����----------");
		
		System.out.printf("%s ����������? %d���̰� %d�����Դϴ�. \n",loan1.name,loan1.price,loan1.iYul);
		System.out.printf("%s ����������? %d���̰� %d�����Դϴ�. \n",loan2.name,loan2.price,loan2.iYul);
		System.out.printf("%s ����������? %d���̰� %d�����Դϴ�. \n",loan3.name,loan3.price,loan3.iYul);
		
	
	}

}

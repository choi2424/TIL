package sec10.exam01.staticmember;

// ����(static) Ű���带 Ŭ������ ����� ���� ������������ ���.

// ���� ����.

public class Loan {
//	�����ǰ�� ������ �����ݸ� 3%�̴�.
	
//	����(iYul)�� ����(static) ����� �����ϸ�, �޼��� ������ �� 1���� ������ �Ǹ鼭, �����Ҹ� ������������ ��밡��������
//	1000���� ������ ������ ��, 1000���� ��ü���� �������� �������� �޸� ������ ���ܰ� �Ǿ�, ���ʿ��� �������� ���� ����.
	
	
//	�̸�, �ݾ� , ����
	String name;
	int price;
	static int iYul = 3;
	
	Loan(String name, int price){
		this.name = name;
		this.price = price;
		
		
				
	}
}

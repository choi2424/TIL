package sec10.exam02;

// ���� ��{...} : �����ʵ带 �ʱ�ȭ �ϴ� �۾��� ���.

public class Television {
	
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	
//	System.out.println(); ������ ���� ��ġ�� ȣ��, ���� , �ݺ��� ��� �Ұ���
	
	
//	String color = "�����";
	
//	������ : ��������ʵ带 �ʱ�ȭ �۾� , ��������ʵ尡 �޸𸮰� �����ǰ� �� �ڵ�ȣ��Ǵ� Ư¡
//	��{} : ���,�ݺ���, ���๮��� ������ ����� ���� �ִ�.
	
	static {
		info = company + "-" + model;
		System.out.println("���� �� ȣ��");
	}
//	���� Ŭ������ �ν��Ͻ� ����� ������ ��쿡 ��ü���������� ���Ͽ� �����ϰ� �ȴ�.
//	�׷����� ������ �̷��ڵ�� �ۼ��ؼ� �ȵȴ�
	Television () {
		company = "";
	}
	
	
	
}

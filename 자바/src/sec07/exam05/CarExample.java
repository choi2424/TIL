package sec07.exam05;

public class CarExample {

	public static void main(String[] args) {
		Car a = new Car("�ڰ���");
		Car b = new Car("���׽ý�");
		Car c = new Car("���׽ý�","������");
		Car d = new Car("���׽ý�","������",250);
		
		
		System.out.printf("��a�� �� : %s , ���� : %s , �ְ�ӵ� : %d\n",a.model,a.color,a.maxSpeed);
		System.out.printf("��b�� �� : %s , ���� : %s , �ְ�ӵ� : %d\n",b.model,b.color,b.maxSpeed);
		System.out.printf("��c�� �� : %s , ���� : %s , �ְ�ӵ� : %d\n",c.model,c.color,c.maxSpeed);
		System.out.printf("��d�� �� : %s , ���� : %s , �ְ�ӵ� : %d\n",d.model,d.color,d.maxSpeed);
		
//		"�ڰ���" , "����" 
		Car Car3 = new Car("�ڰ���","����");
		System.out.printf("Car3�� �� : %s , ���� : %s , �ְ�ӵ� : %d\n",Car3.model,Car3.color,Car3.maxSpeed);
//		"�ý�" , "����" , "200" 
		Car Car4 = new Car("�ý�","����",200);
		System.out.printf("Car4�� �� : %s , ���� : %s , �ְ�ӵ� : %d\n",Car4.model,Car4.color,Car4.maxSpeed);
	}

}

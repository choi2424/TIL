package ch05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
//		StringŬ���� : ���ڿ� �����͸� ����ϴ� ����
//		����Ÿ��������, ������ �⺻������Ÿ�� ��Ÿ��ó�� ����� ���� �ִ�.
		
		String hobby = "����"; // �������� "����"�̶�� ���ڿ� �����Ͱ� ����Ǵ� �ּҸ� �Ҵ�.
		hobby = null; // �Ҵ�� �ּҰ� ���� ������ ������� ����� ����.
		
		String kind1 = "�ڵ���";
		String kind2 = kind1; // �������� "������"�� ����Ǿ� �ִ� �ּҸ� kind1�� ���� ���Թ޴´�.
		kind1 = null;
		
		System.out.println("kind1 :" + kind2);
		
//		GC(Garbage Collector) : ������� �ʴ� ��ü�� ���޸𸮸� �Ҹ��Ű��, �޸𸮸� ����
		
			

	}

}

package ch05.sec05;

public class IndexOfContainsExample {

	public static void main(String[] args) {
//		���ڿ� ã��
		
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���"); // �˻����ڿ��� �������� ������ -1�� ��ȯ.
		System.out.println(location);
		
		String str1 = subject.substring(location);
		System.out.println(str1);
		
		location = subject.indexOf("�ڹ�");

		if(location != -1) {
			System.out.println("�ڹٿ� ���õ� å�Դϴ�.");
		}else {
			System.out.println("�ڹٿ� ���õ� å�� �ƴմϴ�.");
		}
		
		boolean result = subject.contains("�ڹ�");
		if(result) {
			System.out.println("�ڹٿ� ���õ� å�̱���.");
		}else {
			System.out.println("�ڹٿ� ���� ���� å�̱���.");
		}
		
	}

}

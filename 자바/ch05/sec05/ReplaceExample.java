package ch05.sec05;

public class ReplaceExample {

	public static void main(String[] args) {
//		���ڿ� ��ü. (�߿�) ���ڿ� �Һ���
		String oldStr = "�ڹ� ���ڿ��� �Һ��Դϴ�. �ڹ� ���ڿ��� String�Դϴ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA"); // �������� ���ο� ���ڿ� �����Ұ� �����ǰ� , �ּҰ� ���Եȴ�.
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
		if(oldStr == newStr) {
			System.out.println("������ ����");
		}else {
			System.out.println("������ �ٸ���");
		}
	}

}

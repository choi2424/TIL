package programmers;

public class programmers03_01 {

	public static void main(String[] args) {
/*
 * ���̰� ���� �� ���ڿ� str1�� str2�� �־����ϴ�.
 * 
 * �� ���ڿ��� �� ���ڰ� �տ������� ���� �����ư��鼭 �� ���� �����ϴ� ���ڿ��� ����� 
 * return �ϴ� solution �Լ��� �ϼ����ּ���.
 */	
		String str1 = "aaaaa";
		String str2 = "bbbbb";
		String solution = "";
		
		for (int i = 0; i < str1.length(); i++) {
		
			solution += str1.charAt(i);
			solution += str2.charAt(i);
		
		}
		
		System.out.println(solution);
		
	}
	
}
			
		


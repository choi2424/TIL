package programmers;

public class programmers03_03 {

	public static void main(String[] args) {
/*
 ���ڿ� my_string�� ���� k�� �־��� ��, 
 my_string�� k�� �ݺ��� ���ڿ��� return �ϴ� solution �Լ��� �ۼ��� �ּ���.
 */
		String my_string = "string";
		int k = 3;
		String answer = "";
		for (int i = 0; i < k; i++) {
			answer += my_string;
		}
		System.out.println(answer);
        
//		System.out.print(my_string.repeat(k));
//		java 11���� �߰��� repeat����� �̿��ϸ� ���ٷ� �����ϴ�

	}

}

package programmers;

public class programmers02_02 {

	public static void main(String[] args) {
//		�� ���� ���ڿ� str1, str2�� �������� ���еǾ� �Է����� �־����ϴ�.
//		����� ���� ���� str1�� str2�� �̾ ����ϴ� �ڵ带 �ۼ��� ������.
		
		
        String a = "apple "
        		+ "pen";
        String b = "Hello "
        		+ "World!";
        
        String c = a.replaceAll("\\s+", "");
        String d = b.replaceAll("\\s+", "");
        
        System.out.println(c);
        System.out.println(d);
        
	}

}

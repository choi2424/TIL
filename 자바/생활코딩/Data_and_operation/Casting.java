
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 2;
		System.out.println(b);
		
//		int c = 1.1;
		double d = 1.1;
		// (int) �� �Է��ϸ� 0.1�� �սǵȴ� 1.1�� ����� �������������ϴµ� ������ int�� �ٲ����
		int e = (int) 1.1;
		System.out.println(e);
		
		// 1 to String
		String f = Integer.toString(1);
		System.out.println(f.getClass());
	
		

	}

}

package ch05.sec11;

public class MainStringArrayArgument {

	public static void main(String[] args) {
//		JVM �����Ǹ鼭, �ڹ����α׷��� main() ���۸޼��带 ȣ���Ѵ�.
//		String[] args ����
		
		if(args.length != 2) {
			System.out.println("���α׷� �Է°��� ����");
			System.exit(0); // ���α׷� ������
		}
		
//		main()�޼����� �Ű������� 2�� �����Ͽ� �����������
		String strNum1 = args[0];
		String strNum2 = args[1];
		
//		���ڿ��� ���������� ��ȯ, ��) "10" -> 10��ȯ
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.printf("%d + %d = %d",num1,num2,result);
		
		

	}

}

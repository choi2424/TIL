package ch02.sec06;

public class TextBlockExample {

	public static void main(String[] args) {
		
		String str = "{" +
		"\n" +
		"\t\"id\":\"winter\",\n "+
		"\t\"name\":\"������\"\n" +
		"}";
		
		/* java13 ������������ ����. �ؽ�Ʈ��Ϲ���, ���� java8(jdk1.8)������ ����.
		String str2 = """
				{
						"id" : "winter",
						"name" : "������"
				}
		""";
		*/
		System.out.println(str);
	}

}

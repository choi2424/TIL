package ch05.sec08;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
//		�迭�� ����ϴ� ����
//		����Ÿ�� �迭
		
/*		
 * 		String str1 , str2 , str3
*/
		String[] strArray = new String[3];
		strArray[0] = "Java"; 
		strArray[1] = "Java"; 
		strArray[2] = new String("Java"); // ����Ÿ�� �����
		
//		�ּҺ�
		System.out.println(strArray[0] == strArray[1]); // true
		System.out.println(strArray[0] == strArray[2]); // false

//		�����ͺ�(��)
		System.out.println(strArray[0].equals(strArray[2])); // true
		
//		�迭�� ũ��(����) ������ �Ҽ��� ����
//		length�Ӽ��� get���� set������ ����.
//		strArray.length = 30;
		
		

	}

}

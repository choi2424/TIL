package sec07.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("È«±æµ¿", "123456-1234567");
		Korean k2 = new Korean("¼ÕÈï¹Î", "654321-7654321");
		
//		°³¸í
//		k1.name = "GD";
		
		System.out.printf("k1.nation : %s\n"
				+ "k1.name : %s\n"
				+ "k1.ssn : %s\n\n",k1.nation,k1.name,k1.ssn);
		
		
		System.out.println("k2.nation : " + k2.nation);
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
		
		 
	}

}

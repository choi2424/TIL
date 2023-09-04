package sec11.exam01;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("123456-1234567", "È«±æµ¿");
		Korean k2 = new Korean("789456-7894561", "¼ÕÈï¹Î");
		System.out.println(k1.ssn);
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k2.ssn);
		System.out.println(k1.nation);
		System.out.println(k2.name);
	}

}


public class StringApp {

	public static void main(String[] args) {
		
		System.out.println("Hello World"); // String
		System.out.println('h'); // 자바에서는 작은따옴표가 character를나타낸다 한글자를 나타냄
		
//		System.out.println("Hello
//				 world");  자바에서는 html과 다르게 이런식으로 줄바꿈하면 에러가생긴다
		System.out.println("Hello \n World"); //줄바꿈을 하고싶을땐\n
		
		//임무가 있는 문자를 일시적으로 해방시키는것을 escape 한다고한다 
		// \하고 뒤에붙는 큰따옴표를 이스케이프해줬다
		System.out.println("Hello  \"World\""); // Hello "World"
		
	}

}

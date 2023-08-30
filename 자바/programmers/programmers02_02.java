package programmers;

public class programmers02_02 {

	public static void main(String[] args) {
//		두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
//		입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.
		
		
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

package programmers;

public class programmers03_04 {

	public static void main(String[] args) {
/*
		연산 ++는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.

		12 ++ 3 = 123
		3 ++ 12 = 312
		양의 정수 a와 b가 주어졌을 때,
		a ++ b와 b ++ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.

		단, a ++ b와 b ++ a가 같다면 a ++ b를 return 합니다.
*/
		int a = 9;
		int b = 91;
		int answer = 0;
		
		if(Integer.parseInt((String.valueOf(a)+b)) >= Integer.parseInt((String.valueOf(b)+a))) {
			answer += Integer.parseInt((String.valueOf(a)+b));
		}else {
			answer += Integer.parseInt((String.valueOf(b)+a));
		}
		System.out.println(answer);
		/* 숫자를 문자로 변환할때 그냥 "" 앞에 붙였으면 됬는데 
		 * 맞다 틀리다 선택지가 두개면 if보단 3항 연산자를 써야겠다
		int aLong = Integer.parseInt(""+a+b);
        int bLong = Integer.parseInt(""+b+a);
        answer = aLong > bLong ? aLong : bLong;
        */
	}

}

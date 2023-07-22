
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 2;
		System.out.println(b);
		
//		int c = 1.1;
		double d = 1.1;
		// (int) 를 입력하면 0.1이 손실된다 1.1은 더블로 변수를만들어야하는데 강제로 int로 바꿔버림
		int e = (int) 1.1;
		System.out.println(e);
		
		// 1 to String
		String f = Integer.toString(1);
		System.out.println(f.getClass());
	
		

	}

}

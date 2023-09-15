package ch13.sec04;



// 타입제한
public class GenericExample {

//	Number 클래스를 상위클래스로 상속받는 참조타입만 타입파라미터로 사용.
	public static <T extends Number> boolean compare(T t1,T t2) {
		
		System.out.println("compare(" + t1.getClass().getSimpleName()+ "," +
				 t2.getClass().getSimpleName() + ")");
		
//		Number 클래스의 메서드 사용.
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return ( v1 == v2 );
		 
		
				
	}
	
//	boolean compare(Integer t1,Integer t2)
//	boolean compare(Double t1,Double t2)
	
	public static void main(String[] args) {
//		제네릭 메서드 호출
		boolean result1 = compare(10, 20); // int -> Integer
		System.out.println(result1);
		System.out.println();
		
		boolean result2 = compare(4.5, 4.5); // double -> Double
		System.out.println(result2);
		System.out.println();
		
		boolean result3 = compare(4, 4.0); // int -> Integer , double -> Double
		System.out.println(result3);
		
		
	}

}

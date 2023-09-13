package ch12.sec07;

public class MathExample {
	
	public static void main(String[] args) {
		
//		큰정수 또는 작은 정수 얻기
		double v1 = Math.ceil(5.3); // 올림함수
		double v2 = Math.floor(5.3); // 내림함수
		System.out.printf("v1 = %.2f\n",v1);
		System.out.printf("v2 = %.2f\n",v2);
		
		long v3 = Math.max(3, 7);
		long v4 = Math.min(3, 7);
		
		System.out.printf("v3 = %d\n",v3);
		System.out.printf("v4 = %d\n",v4);
		
		double value = 12.3456; // 소수 4자리
		double temp1 = value * 100; // 1234.56 
		long temp2 = Math.round(temp1); // 1235
		double v5 = temp2 / 100.0; // 12.35
		System.out.printf("v5 = %.2f\n",v5);
		
	}
}

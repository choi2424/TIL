package sec08.exam03;

// return 키워드 사용예제
// return [반환값]; 메서드의 실행을 종료. 제어를 호출한 곳으로 돌려준다.
// 반관값이 존재하면, 함께 돌려준다.

public class Car {
//	필드 선언
	int gas;
	
//	리턴값이 없는 메소드 . gas에게 매개변수로 값을 받아서, gas필드값을 변경
	void setGas(int gas) {
		this.gas = gas;
		
	}
	
//	차의 가스상태체크
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다");
			return false;
		}
		System.out.println("gas가 있습니다");
		return true;
	}
	
//	운전하는 기능 .
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.printf("달립니다.(gas 잔량 : %d)\n",gas);
				gas -= 1;
			}else {
				System.out.printf("멈춥니다.(gas 잔량 : %d)\n",gas);
				return;
			}
		} 
			
		
		
	}
	
}

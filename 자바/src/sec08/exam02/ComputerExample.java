package sec08.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		
//		°´Ã¼ myCom
		Computer myCom = new Computer();
		
		int result1 = myCom.sum(1,2,3);
		System.out.printf("result1 : %d\n",result1);
		
		int result2 = myCom.sum(1,2,3,4,5);		
		System.out.printf("result2 : %d\n",result2);
		
		int[] values3 = {1,2,3,4,5};
		int result3 = myCom.sum(values3);
		System.out.printf("result3 : %d\n",result3);
		
		
		
	}

}

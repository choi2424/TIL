package sec07.exam04;

public class CarExample {

	public static void main(String[] args) {
		Car a = new Car();
		Car b = new Car("제네시스");
		Car c = new Car("제네시스","검정색");
		Car d = new Car("제네시스","검정색",250);
		
		System.out.printf("차a의 모델 : %s , 색깔 : %s , 최고속도 : %d\n",a.model,a.color,a.maxSpeed);
		System.out.printf("차b의 모델 : %s , 색깔 : %s , 최고속도 : %d\n",b.model,b.color,b.maxSpeed);
		System.out.printf("차c의 모델 : %s , 색깔 : %s , 최고속도 : %d\n",c.model,c.color,c.maxSpeed);
		System.out.printf("차d의 모델 : %s , 색깔 : %s , 최고속도 : %d\n",d.model,d.color,d.maxSpeed);
		
//		"자가용" , "빨강" 
		Car Car3 = new Car("자가용","빨강");
		System.out.printf("Car3의 모델 : %s , 색깔 : %s , 최고속도 : %d\n",Car3.model,Car3.color,Car3.maxSpeed);
//		"택시" , "검정" , "200" 
		Car Car4 = new Car("택시","검정",200);
		System.out.printf("Car4의 모델 : %s , 색깔 : %s , 최고속도 : %d\n",Car4.model,Car4.color,Car4.maxSpeed);
	}

}

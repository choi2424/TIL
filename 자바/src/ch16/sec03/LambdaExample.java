package ch16.sec03;

public class LambdaExample {

	public static void main(String[] args) {
		Person person = new Person();
		
//		매개변수가 2개 일 경우
		person.action1((String name, String job) -> {
			System.out.print(name + "이 ");
			System.out.println(job + "을 합니다.");
		});
		
		person.action2((word) -> {
			System.out.print("\"" + word + "\"");
			System.out.println("라고 말합니다.");
		});
		
		person.action2(word -> System.out.println("\"" + word + "\"라고 외칩니다."));
	}

}

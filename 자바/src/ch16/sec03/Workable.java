package ch16.sec03;

@FunctionalInterface
public interface Workable {
	
	void work(String name, String job); // 매개변수가 2개있는 람다식으로 재정의
}

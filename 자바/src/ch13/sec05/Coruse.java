package ch13.sec05;

//	학원과정
//	모든 대상이 등록 과정, 학생만 등록 가능 , 직장인및 일반인만 등록가능
public class Coruse {
	
//	모든 대상이 등록가능한 과정
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함");
	}
	
//	학생만 등록가능한 과정 , 최상위 클래스 Student를 상위로 하는클래스
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course2을 등록함");
	}
	
//	직장인 및 일반인만 등록가능 , 최하위 클래스 Worker 를 하위로 하는 클래스
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course3을 등록함");
	}
}

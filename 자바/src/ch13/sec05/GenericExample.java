package ch13.sec05;

public class GenericExample {

	public static void main(String[] args) {
//		모든 사람이 신청가능한 수강
		Coruse.registerCourse1(new Applicant<Person>(new Person()));
		Coruse.registerCourse1(new Applicant<Worker>(new Worker()));
		Coruse.registerCourse1(new Applicant<Student>(new Student()));
		Coruse.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Coruse.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		
//		학생만 신청가능 . Person , Worker 클래스는 제외
		Coruse.registerCourse2(new Applicant<Student>(new Student()));
		Coruse.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Coruse.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		
//		Coruse.registerCourse2(new Applicant<Person>(new Person())); 등록에러
//		Coruse.registerCourse2(new Applicant<Person>(new Worker())); 등록에러
		System.out.println();
		
//		직장인 및 일반인만 신청가능 . Student , HighStudent , MiddleStudent 제외
		Coruse.registerCourse3(new Applicant<Person>(new Person()));
		Coruse.registerCourse3(new Applicant<Worker>(new Worker()));
		
//		Coruse.registerCourse3(new Applicant<Student>(new Student()));  등록에러
//		Coruse.registerCourse3(new Applicant<HighStudent>(new HighStudent()));  등록에러
//		Coruse.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));  등록에러
	}

}

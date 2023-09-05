package ch06.sec13.exam02.package2;

import ch06.sec13.exam02.package1.A_class;

public class C_class {
	
	A_class a1 = new A_class(true);
	// 생성자는 다른 패키지 이지만, public이므로 접근 가능.
	
//	A_class a2 = new A_class(1);
	// 이 생성자는 default로 생성되었기에 다른 패키지에서 사용 할 수 없다.
	
//	A_class a3 = new A_class("문자열");
	// private 생성자를 사용 하였기에 같은 패키지와 그 밖의 패키지에서도 사용 할 수 없다.
	
}

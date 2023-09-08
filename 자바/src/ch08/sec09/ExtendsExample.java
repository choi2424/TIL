package ch08.sec09;

public class ExtendsExample {

	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl();
		
		InterfaceA ia = impl;
		ia.methodA(); // 부모인터페이스 변수로 형변환 되면 자신의  추상메서드를 구현한 메서드만 호출이 가능.
//		ia.methodB(); 
		
		System.out.println();
		
		InterfaceB ib = impl;
//		ib.methodA();
		ib.methodB(); // 부모인터페이스 변수로 형변환 되면 , 자신의 추상메서드를 구현한 메서드만 호출이 가능 
		
		System.out.println();
		
//		부모인터페이스 변수로 형변환 되면 , 자신의 추상메서드를 구현한 메서드만 호출이 가능
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}

}

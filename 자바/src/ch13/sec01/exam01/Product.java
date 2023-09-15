package ch13.sec01.exam01;

public class Product<A,B> {
	
//	필드
	private A kind;
	private B model;
	
//	getter,setter메서드
	public A getKind() { return this.kind; }
	public B getModel() { return this.model; }
	public void setKind(A kind) { this.kind = kind; }
	public void setModel(B model) { this.model = model; }
}

/*
Product<Tv,String> product1 = new Product<Tv, String>();
//	필드
	private Tv kind;
	private String model;
	
//	getter,setter메서드
	public Tv getKind() { return this.kind; }
	public String getModel() { return this.model; }
	public void setKind(Tv kind) { this.kind = kind; }
	public void setModel(String model) { this.model = model; }


Product<Car, String> product2 = new Product<Car, String>();

//	필드
	private Car kind;
	private String model;
	
//	getter,setter메서드
	public Car getKind() { return this.kind; }
	public String getModel() { return this.model; }
	public void setKind(Car kind) { this.kind = kind; }
	public void setModel(String model) { this.model = model; }

*/

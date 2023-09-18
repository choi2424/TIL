package ch15.sec02.exam02;

// ArrayList클래스가 제공하는 컬렉션 구조에 저장할 목적.
public class Board /*extends Object*/ {

	// 필드
	private String subject;
	private String content;
	private String writer;
	
	// 생성자
	// 매개변수가 있는 생성자로 인하여, 기본생성자는 컴파일과정에서 자동생성 되지 않는다.
	public Board(String subject, String content, String writer) {
//		super(); // 컴파일 과정에서 자동으로 생성. 부모 클래스의 기본생성자 호출 메소드.
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
	// 컬렉션
	public String getSubject() { return subject; }
	
	public void setSubject(String subject) { this.subject = subject; }
	
	
	public String getContent() { return content; }
	
	public void setContent(String content) { this.content = content; }
	
	
	public String getWriter() { return writer; }
	
	public void setWriter(String writer) { this.writer = writer; }
	
	
	
	
}

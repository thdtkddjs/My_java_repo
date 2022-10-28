package test.mypac;
/*
 * [interface]
 * 
 * 생성자가 없다.
 * 추상 메소드만 가질 수 있다.
 * 필드는 static fianl 상수만 가질 수 있다.
 * data type의 역할은 할 수 있다.
 * interface type의 참조값이 필요하면 
 * 구현(implements)를 경유해서 객체를 생성해야한다.
 * 클래스 상속은 단일 상속이지만, 인터페이스는 다중 구현이 가능하다.
 */
public interface Remocon {
	//필드는 static final 필드만 가질 수 있다.
	//그래서 static final을 생략해도 상관 x
	public static final String COMPANY="LG";
	
	public void up();
	public void down();
}

package text.main;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 * 콘솔창에 "안녕하세요"를 출력하려고 한다.
		 * 해당 목표를 달성하려면 출력 기능을 수행할 객체가 필요하다.
		 * 그 객체는 어디에 있나? System의 out이라는
		 * Static 필드에 해당 객체의 참조값이 들어있다.
		 * System은 Java에서 이미 생성해서 미리 준비된 객체이다.
		 * Java는 이런 기본 클래스 역할을 하는 클래스들을
		 * java.lang 패키지에 보관하고 있다.
		 */
		
		//다중정의(overloading된 println() 메소드 사용해보기
		System.out.println("안녕하세요");
		System.out.println(true);
		System.out.println('a');
	}
}

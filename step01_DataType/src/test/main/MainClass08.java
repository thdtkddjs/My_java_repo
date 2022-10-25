package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		String str="abcd12345";
		int result = str.length();
		char result2 = str.charAt(5);
		/*
		 * String 객체의 메소드를 활용하여
		 * str 변수 안의 문자를 모두 대문자로 변환하여
		 * str2라는 이름의 변수에 담아보세요.
		 */
		String str2=str.toUpperCase();
		
		String greet="Hello! mimi, Bye! mimi";
		//위의 문자열에서 mimi라는 문자열을 mama로 교체
		//단, String 객체의 메소드를 활용해서
		greet = greet.replaceAll("mimi", "mama");
		
		String message="My name is Kimgura";
		/*
		 * 위의 문자열이 My로 시작하는지 여부를
		 * isStart라는 변수에 담아보기
		 * 
		 * 위의 문자열에서 i가 문자열의 몇번째 인덱스에 위치하고
		 * 있는지를 index에 담기
		 */
		boolean isStart=message.startsWith("My");
		int index = message.indexOf("i");
	}
}

package test.main;
/*
 * string 타입
 */
public class MainClass05 {
	public static void main(String[] args) {
		//김구라라는 string 데이터를 heap영억에 저장하고 그 키가 되는 참조값을 지정한다.
		String name ="김구라";
		// name 안에 있는 참조값을 tmp 변수에 복사해주기
		String tmp = name;
		// 원숭이라는 string 데이터를 heap 영역에 만들고 덮어쓰기
		name = "원숭이";
		//name 변수 비우기
		//참조 데이터가 담길 수 있는 빈 공간을 만든다.
		name = null;
		name = tmp;
	}
}

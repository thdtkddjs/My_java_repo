package test.main;
/*
 * [기본 data type의 참조 data type]
 * byte		: Byte
 * short	: Short
 * int		: Integer
 * long		: Long
 * 
 * float	: Float
 * double	: Double
 * 
 * char		: Character
 * boolean	: Boolean
 * 
 * - 때로는 기본 데이터 type의 참조 데이터 타입이 필요하기도 하다
 * - 기본 데이터 타입을 객체에 포장(boxing)하는 형태이다
 * - boxing과 unboxing은 자동으로 되기 떄문에 프로그래머가 
 * - 신경쓸 필요는 없다.
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		int num1=10;
		//String처럼 Static 필드에 이미 입력되어있다.
		Integer num2=10;
		//문자를 숫자로 바꾸기(String을 int로 변환한다.
		System.out.println(Integer.parseInt("100"));
	}

}

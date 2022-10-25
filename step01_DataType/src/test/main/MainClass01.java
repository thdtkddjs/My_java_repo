package test.main;
/*
 *  [ Java 기본 데이터 type ]
 *  
 *  1. 숫자형
 *  
 *  정수형 : byte, short, int, long
 *  
 *  - byte 변수명;  // -128 ~ 127
 *  - short 변수명;  // -32768 ~ 32767
 *  - int  변수명; // -2,147,483,648 ~ 2,147,483,647
 *  - long 변수명; // -9223372036854775808 ~ 9,223,372,036,854,775,807
 *  
 *  실수형 : float, double
 *  
 *  - float 변수명; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double 변수명; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		byte a = 10;
		short b = -30000;
		int c = 1382904719;
		long d = -29830170;
		
		float e = 4f;
		double f = 9.99;
		/*
		 * 변수의 크기가 다를때는
		 * 큰 쪽에서 작은 쪽으로 옮길때는 상관이 없지만
		 * 반대라면 더 작은 쪽에 casting을 해야한다.
		 */
		byte tmp1 = (byte)b;
		//실수형 변수들
		//d,f를 붙이지 않으면 double 타입으로 간주되어 플로트에서 에러가 뜬다.
		float num1=10.1f;
		double num2=10.1d;
		double num3=10;
		
		float tmp3 = (float)num2;
		
		System.out.println("main 메소드가 끝났습니다.");
	}
}

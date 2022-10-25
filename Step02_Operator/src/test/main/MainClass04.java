package test.main;
//논리연산자 Test
public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * or 연산
		 * 모두 false일때 만 결과가 false
		 */
		boolean result1 = false||false;
		boolean result2 = true||false;
		boolean result3 = false||true;
		boolean result4 = true||true;
		/*
		 * and 연산
		 * 모두 다 true 일때만 결과가 true
		 */
		boolean result5 = false&&false;
		boolean result6 = true&&false;
		boolean result7 = false&&true;
		boolean result8 = true&&true;
		//not 연산
		boolean result9 = !true;
		boolean result10 = !false;
	}
}

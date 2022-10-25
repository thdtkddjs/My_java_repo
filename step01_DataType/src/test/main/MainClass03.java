package test.main;
/*
 * 논리형
 * true or false로 나뉘는 데이터 타입이다.
 * 비교/논리 연산자로도 얻어내진다.
 */
public class MainClass03 {
	public static void main(String[] args) {
		//논리형 변수선언과 동시에 값 대입
		boolean isrun=true;
		if (isrun) {
			System.out.println("달려요");
		}
		//비교 연산
		boolean isGreator = 10>1;
		//논리 연산
		boolean result = true||false;
		
		//한 번 선언한 변수는 다시 선언할 수 없다.
		//변수에 담을 수 있는 것은 같은 타입의 값 뿐이다.
		//result = 10 =>> false
		result = false;
	}
}

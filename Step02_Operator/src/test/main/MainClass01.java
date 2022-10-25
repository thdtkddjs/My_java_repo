package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		int num1=5;
		int num2=2;
		//+연산하기
		int sum = 10+1;
		int sum2 = num1 + num2;
		int sum3 = 10 + num2;
		//정수 끼리 연산하면 정수만 나온다.
		int result1 = 5/3;
		int result2 = num1/num2;
		//실수 값을 얻고 싶다면 연산 대상 중 적어도 하나는 실수여야한다.
		double result3 = 5/ 3.0;
		double result4 = num1/(double)num2;
		//앞의 수를 뒤의 수로 나눈 나머지
		int result5 = num1 % num2;
	}
}

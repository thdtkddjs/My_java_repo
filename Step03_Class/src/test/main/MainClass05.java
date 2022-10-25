package test.main;

import test.mypac.Rect;;

/*
 * test.mypac에 rect라는 이름의 클래스를 만들고자 한다.
 * 해당 클래스로 객체를 생성하고
 * 사각형의 폭과 높이를 필드에 대입하고
 * showArea()를 호출하면 사각형의 넓이가 콘솔창에 출력될 수 있도록
 * Rect클래스를 설계해보세요.
 */
public class MainClass05 {
	public static void main(String[] args) {
		Rect test=new Rect();
		
		test.height= 12;
		test.width = 15;
		test.showArea();
		
		Rect test2=new Rect();
		
		test2.height= 22;
		test2.width = 55;
		test2.showArea();
		
		
	}
}

package test.mypac;

public class Member {
	public int num;
	public String name;
	public String addr;
	
	//생성자에도 매개변수 전달이 가능하다.
	//단, 이렇게 생성자를 정의하면 기본 생성자는 사라진다
	public Member(int num, String name, String addr) {
		//생성자의 인자로 전달받은 값을 필드에 저장하기
		this.num=num;
		this.name=name;
		this.addr=addr;
	}
	//생성자 역시 다중생성이 가능하다.
	//이를 통해 기본 생성자를 다시 만들어줄 수 있다.
	public Member() {
		
	}
	
	public void showInfo() {
	System.out.println(
			"번호 : " +this.num+
			", 이름 : "+this.name+
			", 주소 : "+this.addr
			);
	}
}
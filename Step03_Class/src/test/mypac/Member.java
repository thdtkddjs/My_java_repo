package test.mypac;

public class Member {
	public int num;
	public String name;
	public String address;
	
	public void showInfo() {
	System.out.println(
			"번호 : " +this.num+
			", 이름 : "+this.name+
			", 주소 : "+this.address
			);
	}
}
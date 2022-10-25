package test.mypac;
/*
 * class의 역할
 * 1. 객체의 설계도 역할
 * 2. data type 역할
 * 3. static 필드와 메소드를 포함하는 역할
 */
public class Car {
	//저장소(field)
	public String name;
	
	//달리는 기능(method)
	public void drive() {
		System.out.println(this.name+" 이(가) 달려요!");
	}
	public void stop() {
		System.out.println(this.name+" 은(는) 멈춰요!");
	}

}

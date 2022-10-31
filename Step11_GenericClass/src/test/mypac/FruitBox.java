package test.mypac;
/*
 * class 안에서 사용하는 특정 type을 고정하지 않고
 * 클래스를 사용하는 시점에서 type을 정할 수 있게 한다.
 * 
 * - 아래 선언한 T 는 뭘 써도 상관은 없다.
 *   보통 type이라는 의미에서 T라고 많이 정한다.
 * - T를 포괄클래스(Generic Class)라고 한다.
 */
public class FruitBox<T> {
	//클래스를 사용하는 시점에 전달된 type을 필드의 type으로 결정한다.
	private T item;
	
	//필드에 값을 넣는 메소드
	public void setItem(T item) {
		this.item=item;
	}
	//필드에 저장된 값을 리턴하는 메소드
	public T getItem() {
		return item;
	}
}

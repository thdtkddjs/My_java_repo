package test.mypac;

//추상 메소드를 1개만 만들도록 강제하는 역할
//()->{} 형태로 사용할 때 오류가 나지 않도록 해줌
@FunctionalInterface
public interface joinner {
	public String join(String one, String two);
}

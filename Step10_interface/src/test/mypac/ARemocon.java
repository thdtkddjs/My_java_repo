package test.mypac;

public class ARemocon implements Remocon{
	int volume = 50;
	@Override
	public void up() {
		// TODO Auto-generated method stub
		volume++;
		System.out.println("현재 볼륨은 "+volume);
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		volume--;
		System.out.println("현재 볼륨은 "+volume);
	}
	

}

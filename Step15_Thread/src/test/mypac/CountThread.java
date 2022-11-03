package test.mypac;

public class CountThread extends Thread{
	@Override
	public void run() {
		//카운트 값을 저장할 지역변수 만들고 10
		int count=10;
		
		while (count>0) {
			System.out.println("현재 카운트: "+count);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count--;
		}
		System.out.println("Count Down Over!");
	}
}

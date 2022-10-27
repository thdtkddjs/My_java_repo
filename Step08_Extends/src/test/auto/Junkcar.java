package test.auto;

public class Junkcar extends ElecCar{
	public Junkcar(Engine engine) {
		super(engine);
		// TODO Auto-generated constructor stub
	}
	
	int trash = 0;
	int stash = 0;
	
	public void collect() {
		trash += 1;
		System.out.println("현재 고물 갯수: "+trash);
		System.out.println("쓰레기 수집 중");
	}
	
	public void sell() {
		while (trash>0) {
			trash -= 1;
			stash += 1000;
			System.out.println("고물 판매 중...");
		}
		System.out.println("저장된 고물 전량 판매 완료!");
		System.out.println("현재 자금 : "+stash);
	}

}

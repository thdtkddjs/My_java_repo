package test.mypac;

public class MacBook {
	//외부에서 접근이 불가하도록 접근 지정자를 private로 설정
	private CPU cpu;
	private Memory memory;
	private HardDisk harddisk;
	public MacBook(CPU cpu, Memory memory, HardDisk harddisk){
		this.cpu=cpu;
		this.memory=memory;
		this.harddisk=harddisk;
	}
	public void doGame() {
		if(this.cpu==null || memory==null || harddisk ==null) {
			System.out.println("부품이 부족해서 맥북이 동작 불가입니다.");
			return;
		}
		System.out.println("신나게 게임을 해요!");
	}
}

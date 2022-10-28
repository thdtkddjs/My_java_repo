package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	//anonymous inner class를 이요하여
	//interface type의 참조값을 얻어내기
	//static 메소드 안에서 사용해야 되므로 static 필드로 만든다.
	static Remocon r1=new Remocon() {
		
		@Override
		public void up() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void down() {
			// TODO Auto-generated method stub
			
		}
	};
	public static void main(String[] args) {
		useRemocon(r1);
		//anonymous local inner class를 이요하여
		//interface type의 참조값을 얻어내기
		Remocon r2=new Remocon() {
			@Override
			public void up() {
				// TODO Auto-generated method stub
			}
			@Override
			public void down() {
				// TODO Auto-generated method stub
			}
		};
		useRemocon(r2);
		//메소드 호출과 동시에 Remocon Type을 즉석에서 만듦
		useRemocon(new Remocon() {			
			@Override
			public void up() {
				// TODO Auto-generated method stub				
			}			
			@Override
			public void down() {
				// TODO Auto-generated method stub
			}
		});
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}

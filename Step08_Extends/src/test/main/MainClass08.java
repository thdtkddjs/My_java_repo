package test.main;

import test.util.MyUtil;

public class MainClass08 {
	public static void main(String[] args) {
		//Static 필드에 있는 것이더라도 상속받아 사용 가능.
		MyUtil.send();
		MyUtil.clear();
		MyUtil.light();
	}
}

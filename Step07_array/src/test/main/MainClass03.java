package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		//String을 담을 수 있는 방 3개짜리 빈 배열 객체
		String[] names= {null, null, null};
		//3개의 방에 순서대로 친구의 이름을 담기
		names[0] = "김재완";
		names[1] = "배용빈";
		names[2] = "서서현";
		
		//3. 배열에 들어있는 친구의 이름을 콘솔창에 출력
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		for(int i=0; i<names.length;i++) {
			System.out.println(names[i]);
		}
	}
}

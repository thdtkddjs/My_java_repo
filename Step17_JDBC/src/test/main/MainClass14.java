package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		//추가할 회원의 정보라고 가정
		String name="원숭이";
		String addr="동물원";
		
		/*
		 * 회원의 정보를 DB와 상호작용하는 객체를 생성하고
		 * 지역 변수에 담아 사용한다.
		 */
		MemberDao dao=new MemberDao();
		
		MemberDto dto=new MemberDto();
		//회원 정보를 담아 전달해줄 dto 객체에 정보를 setter하고
		dto.setName(name);
		dto.setAddr(addr);
		//회원 정보를 DB에 등록함과 동시에 성공 여부도 리턴한다.
		boolean isSuccess=dao.insert(dto);
		
		
		if(isSuccess) {
			System.out.println("추가가 성공했습니다");
		}else {
			System.out.println("다시 시도해주세요.");
		}
	}
}

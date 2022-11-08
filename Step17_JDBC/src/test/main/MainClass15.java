package test.main;

import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass15 {
	public static void main(String[] args) {
		/*
		 * Scanner객체를 활용해 Member 테이블을 추가해보자.
		 * MemeberDto 객체에 데이터를 저장하고
		 * DB에 저장해보자.
		 */
		
		Scanner scan1=new Scanner(System.in);
		Scanner scan2=new Scanner(System.in);
		Scanner scan3=new Scanner(System.in);
		
		MemberDto dto=new MemberDto();
		
		MemberDao dao=new MemberDao();
		System.out.println("입력을 멈추려면 -1을 입력해주세요.");
		while(true) {
			
			int num =0;
			String name=null;
			String addr=null;

			System.out.print("멈추시곘습니까?(-1입력)");
			num=scan1.nextInt();
		if(num==-1) {
			break;
		}
			System.out.print("이름 입력: ");
			name=scan2.nextLine();
			System.out.print("주소 입력: ");
			addr=scan3.nextLine();
			
			dto.setName(name);
			dto.setAddr(addr);
			
			boolean isS=dao.insert(dto);
			
			if(isS=false) {
				System.out.println("입력 실패!");
			} else System.out.println("입력 성공!");
		}
	}
}

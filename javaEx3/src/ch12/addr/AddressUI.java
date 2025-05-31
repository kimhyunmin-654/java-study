package ch12.addr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/*
  - 데이터 등록
  	: 이름, 전화번호, 생년원일, 주소, 등록일
  	: 등록일은 컴퓨터 시스템의 날짜에서 yyyy-MM-dd 형식만 등록
  	: 이름과 전화번호가 동일하면 등록 불가(선택사항)
  	: 생년월일은 yyyy-MM-dd 형식이 아니면 등록불가(선택사항)
  	
  - 데이터 출력
  	: 이름 전화번호 생년월일 나이 주소 등록일
  	: 나이는 생년월일을 기준으로 계산(선택사항)
 */


public class AddressUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private Address addr = new AddressImpl();
	
	public void menu() {
		int ch;
		
		while(true) {
			try {
				System.out.print("1.등록 2.수정 3.삭제 4.이름검색 5.전체리스트 6.종료 => ");
				ch = Integer.parseInt(br.readLine());
				
				if(ch == 6) {
					System.out.println("프로그램 종료");
					return;
				}
				
				switch(ch) {
				case 1: insert(); break;
				case 2: update(); break;
				case 3: delete(); break;
				case 4: searchName(); break;
				case 5: printAll(); break;
				
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	protected void insert() {
		System.out.println("\n[데이터 등록]");
		
		try {
			AddressVO vo = new AddressVO();
			
		
			System.out.print("이름 ? ");
			vo.setName(br.readLine());
			
			System.out.print("전화번호 ? ");
			vo.setTel(br.readLine());					
			
			System.out.print("생년월일 ? ");
			vo.setBirth(br.readLine());
			
			System.out.print("주소 ? ");
			vo.setAddress(br.readLine());
			
			System.out.print("등록일 ? ");
			vo.setRegi(br.readLine());
			
			addr.insertAddress(vo);
			
			System.out.println("데이터가 등록 되었습니다.");
			
		} catch (NullPointerException e) {
			System.out.println("데이터를 입력하세요");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected void update() {
		System.out.println("\n[데이터 수정]");
		try {
			String name, tel;
			
			System.out.print("수정할 이름 ? ");
			name = br.readLine();
			System.out.print("수정할 전화번호 ? ");
			tel = br.readLine();
			
			AddressVO vo = addr.findById(name, tel);
			if(vo == null) {
				System.out.println("등록된 이름과 전화번호가 없습니다.\n");
				return;
			}
			
			System.out.print("새로운 생년월일 ? ");
			vo.setBirth(br.readLine());
			
			System.out.print("주소 ? ");
			vo.setAddress(br.readLine());
			
			System.out.print("등록일 ? ");
			vo.setRegi(br.readLine());
			
			System.out.println("수정이 완료되었습니다.");
			
			
		} catch (NullPointerException e) {
			System.out.println("데이터를 등록하세요.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	protected void delete() {
		System.out.println("\n[데이터 삭제]");
		String name, tel;
		
		try {
			System.out.print("삭제할 이름 ? ");
			name = br.readLine();
			System.out.print("삭제할 전화번호 ? ");
			tel = br.readLine();
			
			boolean b = addr.deleteAddress(name, tel);
			if (b) {
				System.out.println("데이터를 삭제했습니다.");
			} else {
				System.out.println("등록된 데이터가 아닙닌다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}
	
	protected void searchName() {
		System.out.println("\n[이름 검색]");
		String name;
		
		try {
			System.out.print("검색할 이름 ? ");
			name = br.readLine();
			
			List<AddressVO> list = addr.findByName(name);
			if (list.size() == 0) {
				System.out.println("등록된 데이터가 없습니다.");
				return;
			}
			
			for(AddressVO vo : list) {
				System.out.println(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}
	
	protected void printAll() {
		System.out.println("\n[전체 리스트]");
		
		List<AddressVO> list = addr.findByAll();
		System.out.println("등록인원수 : " + list.size());
		for(AddressVO vo : list) {
			System.out.println(vo);
		}
		System.out.println();
	}
	

}

package ch12.unit07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex07_Comparator {

	public static void main(String[] args) {
		List<UserDTO> list = new ArrayList<UserDTO>();
		
		list.add(new UserDTO("다다다", "010-1234-5515", 25));
		list.add(new UserDTO("나나나", "010-1534-5124", 23));
		list.add(new UserDTO("가가가", "010-6544-7534", 27));
		list.add(new UserDTO("다가나", "010-0464-6543", 21));
		list.add(new UserDTO("마바사", "010-1123-5213", 29));
		
		System.out.println("정렬전...");
		print(list);
		
		// 이름순으로 정렬
		// Comparator 인터페이스 : 정렬 기준 설정
		Comparator<UserDTO> comp = new Comparator<UserDTO>() {
			
			@Override
			public int compare(UserDTO o1, UserDTO o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		
		Collections.sort(list, comp);
		System.out.println("\n이름정렬후...");
		print(list);
		
		// 나이 오름차순
		Comparator<UserDTO> comp2 = new Comparator<UserDTO>() {
			
			@Override
			public int compare(UserDTO o1, UserDTO o2) {
				return o1.getAge() - o2.getAge();
			}
		};
		
		Collections.sort(list, comp2);
		System.out.println("\n나이정렬후...");
		print(list);
		
		
	}
	
	public static void print(List<UserDTO> list) {
		for(UserDTO dto : list) {
			System.out.print(dto.getName() + "\t");
			System.out.print(dto.getTel() + "\t");
			System.out.println(dto.getAge());
		}
	}

}

class UserDTO {
	private String name;
	private String tel;
	int age;
	
	public UserDTO() {	
	}
	
	public UserDTO(String name, String tel, int age) {
		this.name= name;
		this.tel = tel;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}

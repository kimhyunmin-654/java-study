package ch12.addr;

// 이름, 전화번호, 생년원일, 주소, 나이, 등록일
public class AddressVO {
	private String name, tel, birth, address, regi;

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

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRegi() {
		return regi;
	}

	public void setRegi(String regi) {
		this.regi = regi;
	}
	
	public void date() {
		
	}
	
	
	@Override
	public String toString() {
		if(name == null || tel == null) {
			return null;
		}
		
		String s = null;
		
		s = String.format("%s\t%s\t%s\t%s\t%s",
				name, tel, birth, address, regi);
		
		return s;
	}
}

package ch12.addr;

import java.util.List;

public interface Address {
	// 데이터 등록
	public void insertAddress(AddressVO vo);
	
	
	// ID 검색
	public AddressVO findById(String name, String tel);
	
	// 전체 리스트
	public List<AddressVO> findByAll();

	// 이름 검색
	public List<AddressVO> findByName(String name);
	
	// 삭제
	public boolean deleteAddress(String name, String tel);

}

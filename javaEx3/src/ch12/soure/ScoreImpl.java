package ch12.soure;

import java.util.ArrayList;
import java.util.List;

public class ScoreImpl implements Score {
	// 학생 정보를 저장할 List 구현 클래스 객체
	private List<ScoreVO> list = new ArrayList<ScoreVO>();
	
	@Override
	public void insertScore(ScoreVO vo) {
		// 중복학번이 등록되지 않도록 수정해야 함
		// List 객체의 마지막 요소 추가
		list.add(vo);
	}

	@Override
	public List<ScoreVO> findByAll() {
		return list;
	}

	@Override
	public ScoreVO findByHak(String hak) {
		for(ScoreVO vo : list) {
			if(vo.getHak().equals(hak)) {
				return vo;
			}
		}
		return null;
	}

	@Override
	public List<ScoreVO> findByName(String name) {
		// 이름 검색
		List<ScoreVO> searchList = new ArrayList<ScoreVO>();
		
		for(ScoreVO vo : list) {
			if(vo.getName().indexOf(name) >= 0) {
				searchList.add(vo);
			}
		}
		
		return searchList;
	}

	@Override
	public boolean deleteScore(String hak) {
		ScoreVO vo = findByHak(hak);
		return list.remove(vo); // 삭제를 성공하면 true, 실패하면 false 반환
	}
	
}

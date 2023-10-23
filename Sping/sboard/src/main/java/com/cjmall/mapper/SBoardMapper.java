package com.cjmall.mapper;

//컬렉션 3개 인터페이스 : List , Set , Map
import java.util.List;

import com.cjmall.domain.SBoardVO;
import com.cjmall.domain.Criteria;



public interface SBoardMapper {

public void register(SBoardVO sboard);

// 게시물 읽기 또는 글수정폼  1개 BoardVo
	public SBoardVO get(Long idx);
	
//조회수 증가
	public void readCount(Long idx);
	
// 글수정하기
	public void modify(SBoardVO sboard);

//	목록 여러개 가져오기 List 
	public List<SBoardVO> getList();
	
//페이징목록, 목록 여러개 List<BoardVO> 리턴값    	
	public List<SBoardVO> getListWithPaging(Criteria cri);
   
//전체 데이터개수 (검색포함)
	public int getTotelCount(Criteria cri); // type, keyword 사용
	
//	글삭제하기
public void delete(Long idx);


}
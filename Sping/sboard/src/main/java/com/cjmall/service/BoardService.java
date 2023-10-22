package com.cjmall.service;



import java.util.List;

import com.cjmall.domain.SBoardVO;
import com.cjmall.domain.Criteria;

// 인터페이스는 애노테이션을 사용하지 않음.

public interface BoardService {

	public void register(SBoardVO board);
   
	public List<SBoardVO> getList();
	
	public List<SBoardVO> getListWithPaging(Criteria cri);
	
	public int getTotelCount(Criteria cri);
	
	public SBoardVO get(Long bno);
	
	public void modify(SBoardVO board);
	
	public void delete(Long bno);
	
	
}
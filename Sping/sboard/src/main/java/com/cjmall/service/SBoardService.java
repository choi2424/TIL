package com.cjmall.service;



import java.util.List;

import com.cjmall.domain.SBoardVO;
import com.cjmall.domain.Criteria;


public interface SBoardService {

	public void register(SBoardVO sboard);
   
	public List<SBoardVO> getList();
	
	public List<SBoardVO> getListWithPaging(Criteria cri);
	
	public int getTotelCount(Criteria cri);
	
	public SBoardVO get(Long idx);
	
	public void modify(SBoardVO sboard);
	
	public void delete(Long idx);
	
	
}
package com.cjmall.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cjmall.domain.SBoardVO;
import com.cjmall.domain.Criteria;
import com.cjmall.mapper.BoardMapper;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {


	private final BoardMapper boardMapper;

	

	@Override
	public void register(SBoardVO board) {

		boardMapper.register(board);      
	}

	@Override
	public List<SBoardVO> getList() {
		// TODO Auto-generated method stub
		return boardMapper.getList();
	}

	@Override
	public SBoardVO get(Long idx) {
		// TODO Auto-generated method stub
		
		//	조회수 증가		
		boardMapper.readCount(idx);
		
		return boardMapper.get(idx);				
	}

	@Override
	public void modify(SBoardVO board) {
		// TODO Auto-generated method stub
		boardMapper.modify(board); 
		
	}

	@Override
	public void delete(Long idx) {
		// TODO Auto-generated method stub
		boardMapper.delete(idx);
		
	}

	@Override
	public List<SBoardVO> getListWithPaging(Criteria cri) {
		// TODO Auto-generated method stub
		return boardMapper.getListWithPaging(cri);
	}

	@Override
	public int getTotelCount(Criteria cri) {
		// TODO Auto-generated method stub
		return boardMapper.getTotelCount(cri);
	}

	

}
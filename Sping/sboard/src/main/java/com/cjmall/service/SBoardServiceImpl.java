package com.cjmall.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cjmall.domain.SBoardVO;
import com.cjmall.domain.Criteria;
import com.cjmall.mapper.SBoardMapper;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class SBoardServiceImpl implements SBoardService {


	private final SBoardMapper sboardMapper;

	

	@Override
	public void register(SBoardVO sboard) {

		sboardMapper.register(sboard);      
	}

	@Override
	public List<SBoardVO> getList() {
		// TODO Auto-generated method stub
		return sboardMapper.getList();
	}

	@Override
	public SBoardVO get(Long idx) {
		// TODO Auto-generated method stub
		
		//	조회수 증가		
		sboardMapper.readCount(idx);
		
		return sboardMapper.get(idx);				
	}

	@Override
	public void modify(SBoardVO sboard) {
		// TODO Auto-generated method stub
		sboardMapper.modify(sboard); 
		
	}

	@Override
	public void delete(Long idx) {
		// TODO Auto-generated method stub
		sboardMapper.delete(idx);
		
	}

	@Override
	public List<SBoardVO> getListWithPaging(Criteria cri) {
		// TODO Auto-generated method stub
		return sboardMapper.getListWithPaging(cri);
	}

	@Override
	public int getTotelCount(Criteria cri) {
		// TODO Auto-generated method stub
		return sboardMapper.getTotelCount(cri);
	}

	

}
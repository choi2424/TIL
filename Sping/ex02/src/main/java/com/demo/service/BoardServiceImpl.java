package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.domain.BoardVO;
import com.demo.domain.Criteria;
import com.demo.mapper.BoardMapper;

import lombok.RequiredArgsConstructor;

// 상속받은 클래스는 반드시 애노테이션이 들어가야 한다.

//- root-context.xml 파일
//   <context:component-scan base-package="com.demo.service" /> 수동으로 추가

// 구현 클래스는 인터페이스를 상속시 추사메서드를 반드시 재정의 해야 한다.(문법 규칙)
// BoardMapper인터페이스에 추상메소드르 호출하는 작업을 해야 한다.
@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

	//	스프링이 BoardMapper인터페이스를 참조하도록 주입해준다.(DI)
	private final BoardMapper boardMapper;

	//	public BoardServiceImpl(BoardMapper boardMapper) {
	//	this.boardMapper = boardMapper;
	//	}
	//   ↑ 이 코드를 롬복이 알아서 생성해 준다. @RequiredArgsConstructor

	// 롬복에서 제공하는 @RequiredArgsConstructor 애노테이션을 입력하면
	// private final BoardMapper boardMapper;필드를 내용으로 하는 생성자가 만들어진다.
	// 그리고 그 생성자로 인하여, BoardMapper인터페이스의 bean이 주입된다.

	@Override
	public void register(BoardVO board) {

		boardMapper.register(board);      
	}

	@Override
	public List<BoardVO> getList() {
		// TODO Auto-generated method stub
		return boardMapper.getList();
	}

	@Override
	public BoardVO get(Long bno) {
		// TODO Auto-generated method stub
		return boardMapper.get(bno);
	}

	@Override
	public void modify(BoardVO board) {
		// TODO Auto-generated method stub
		boardMapper.modify(board); 
		
	}

	@Override
	public void delete(Long bno) {
		// TODO Auto-generated method stub
		boardMapper.delete(bno);
		
	}

	@Override
	public List<BoardVO> getListWithPaging(Criteria cri) {
		// TODO Auto-generated method stub
		return boardMapper.getListWithPaging(cri);
	}

	@Override
	public int getTotelCount(Criteria cri) {
		// TODO Auto-generated method stub
		return boardMapper.getTotelCount(cri);
	}

	

}
package com.cjmall.mapper;

//컬렉션 3개 인터페이스 : List , Set , Map
import java.util.List;

import com.cjmall.domain.SBoardVO;
import com.cjmall.domain.Criteria;

//인터페이스(중요)
//BoardMapper인터페이스와 BoardMapper.xml 하나로 관리된다

//- root-context.xml 파일
//<mybatis-spring:scan base-package="com.demo.mapper" /> 수동으로 추가

public interface BoardMapper {

// 추상 메소드

// 글쓰기 저장
// 매서드명과 id="register"는 일치 되어야 한다. <insert id="register"></insert>
public void register(SBoardVO board);

// 게시물 읽기 또는 글수정폼  1개 BoardVo
	public SBoardVO get(Long bno);
	
//조회수 증가
	public void readCount(Long bno);
	
// 글수정하기
	public void modify(SBoardVO board);

//	목록 여러개 가져오기 List 
	public List<SBoardVO> getList();
	
//페이징목록, 목록 여러개 List<BoardVO> 리턴값    	
	public List<SBoardVO> getListWithPaging(Criteria cri);
   
//전체 데이터개수 (검색포함)
	public int getTotelCount(Criteria cri); // type, keyword 사용
	
//	글삭제하기
public void delete(Long bno);


}
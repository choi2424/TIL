package com.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.demo.domain.BoardVO;
import com.demo.domain.Criteria;
import com.demo.domain.PageDTO;
import com.demo.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

// 게시판 기능에 사용할 URL매핑주소를 구성요소로 하는 컨트롤러 기능의 클래스.
// servlet-context.xml파일의 <context:component-scan base-package="com.demo.controller" /> 자동 추가됨.
// BoardController에서는 BoardServiceImpl매소드를 호출한다.

@Log4j 
// @Log4j를 사용할 때는 pum.xml파일에서 <geoupId>Log4j</geoupId>위치에서
// <scope>runtime</scope>를 주석처리 해야 사용할 수 있다.(크러싱)
// log 객체를 지원해줌.
@Controller
@RequestMapping("/board/*")  // views폴더 밑에 board 폴더 생성
@RequiredArgsConstructor
public class BoardController {

	//   private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	private final BoardService boardService;

	//   public public BoardController(BoardService boardService) {
	//      this.boardService = boardService;
	//   }
	//   ↑ 이 코드를 롬복이 알아서 생성해 준다. @RequiredArgsConstructor

	// 매핑주소 /board/register
	// 글쓰기 폼
	@GetMapping("/register")
	public void register() {
		log.info("called register...");
	}

	// http://localhost:9090/board/register
	// 저장버튼 클릭 후 글쓰기 저장
	@PostMapping("/register")
	public String register(BoardVO board) {

		log.info("게시판 입력데이터 : " + board); // board.toString()
		// DB저장
		/*
		 * 1) BoardMapper인터페이스와 BoardMapper.xml작업
		 * 1) BoardService인터페이스와 BoardServiceImpl 클래스
		 */

		boardService.register(board);

		return "redirect:/board/list";
	}

	//	매핑주소 /board/list
	//	목록
	//	Model model : list.jsp파일에 데이터(대부분 DB)를 출력하고자 할때
	
//		스프링이 Criteria 생성자를 호출하여 , 객체를 생성한다.
//		Criteria cri = new Criteria(); this(1 , 10)
//		Model model = new 생성자()
	@GetMapping("/list")
	public void list(Criteria cri ,Model model) {
		
		log.info("list : " + cri); // cri.toString()
//		Criteria(pageNum=1, amount=10, type=null, keyword=null)
		
//		1)목록 데이터
		List<BoardVO> list = boardService.getListWithPaging(cri);
		model.addAttribute("list", list);
		
//		2)페이징기능
		int total = boardService.getTotelCount(cri);
		
		log.info("데이터 총 개수 : " + total);
		
		PageDTO pageDTO = new PageDTO(cri, total);
		model.addAttribute("pageMaker",pageDTO);
		
		log.info("페이징 정보 : " + pageDTO);
	}

	//	매핑주소 /board/get?bno=게시물번호
	//  게시물읽기 : 리스트에서 제목을 클릭했을 때, 게시물번호에 데이터를 출력
	@GetMapping({"/get","/modify"})
	public void get(@RequestParam("bno") Long bno,@ModelAttribute("cri") Criteria cri, Model model) {
		//	   목록에서 선택한 게시물 번호
		log.info("게시물번호 : " + bno);
		
		//	페이징과검색정보
		log.info("페이징과검색정보" + cri);
		BoardVO board = boardService.get(bno);
		model.addAttribute("board", board);
	}

	//	매핑주소 /board/modify   
	//	수정하기
	//	RedirectAttributes 페이지(주소)를 이동시 파라미터정보를 제공하는 목적으로 사용 
	@PostMapping("/modify")
	public String modify(BoardVO board, Criteria cri , RedirectAttributes rttr) {

		log.info("수정 데이터 : " + board);;
		log.info("Criteria : " + cri);
		//	   DB저장
		boardService.modify(board);
		
	//	검색과 페이지정보를 이동주소(/board/list)의 파라미터로 사용하기 위한 작업
//		rttr.addAttribute("pageNum", cri.getPageNum());
//		rttr.addAttribute("amount", cri.getAmount());
//		rttr.addAttribute("type", cri.getType());
//		rttr.addAttribute("keyword", cri.getKeyword());

	//	/board/list?pageNum=값&amount=값&type=값&keyword=값
		return "redirect:/board/list" + cri.getListLink(); // list(Criteria cri, Model model)
	}

	//	매핑주소 /board/delete   
	//	삭제하기
	@GetMapping("/delete")
	public String delete(@RequestParam("bno") Long bno , Criteria cri , RedirectAttributes rttr) {

		log.info("삭제할 번호  : " + bno);

		//   	DB작업
		boardService.delete(bno);
		
//		검색과 페이지정보를 이동주소(/board/list)의 파라미터로 사용하기 위한 작업
//			rttr.addAttribute("pageNum", cri.getPageNum());
//			rttr.addAttribute("amount", cri.getAmount());
//			rttr.addAttribute("type", cri.getType());
//			rttr.addAttribute("keyword", cri.getKeyword());

		return "redirect:/board/list" + cri.getListLink();
	}
}
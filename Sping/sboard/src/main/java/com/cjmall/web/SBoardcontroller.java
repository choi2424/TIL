package com.cjmall.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cjmall.domain.SBoardVO;
import com.cjmall.domain.Criteria;
import com.cjmall.domain.PageDTO;
import com.cjmall.service.SBoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j 
@Controller
@RequestMapping("/sboard/*") 
@RequiredArgsConstructor
public class SBoardcontroller {


	private final SBoardService sboardService;

	@GetMapping("/register")
	public void register() {
		log.info("called register...");
	}

	@PostMapping("/register")
	public String register(SBoardVO sboard) {

		log.info("게시판 입력데이터 : " + sboard); 


		sboardService.register(sboard);

		return "redirect:/sboard/list";
	}


	@GetMapping("/list")
	public void list(Criteria cri ,Model model) {
		
		log.info("list : " + cri); 
		
//		1)목록 데이터
		List<SBoardVO> list = sboardService.getListWithPaging(cri);
		model.addAttribute("list", list);
		
//		2)페이징기능
		int total = sboardService.getTotelCount(cri);
		
		PageDTO pageDTO = new PageDTO(cri, total);
		model.addAttribute("pageMaker",pageDTO);
		
	}

	@GetMapping({"/get","/modify"})
	public void get(@RequestParam("idx") Long idx,@ModelAttribute("cri") Criteria cri, Model model) {
		//	   목록에서 선택한 게시물 번호
		log.info("게시물번호 : " + idx);
		
		//	페이징과검색정보
		log.info("페이징과검색정보" + cri);
		SBoardVO sboard = sboardService.get(idx);
		model.addAttribute("sboard", sboard);
	}


	@PostMapping("/modify")
	public String modify(SBoardVO sboard, Criteria cri , RedirectAttributes rttr) {

		log.info("수정 데이터 : " + sboard);;
		log.info("Criteria : " + cri);
		//	   DB저장
		sboardService.modify(sboard);



		return "redirect:/sboard/list" + cri.getListLink(); 
	}
  
	//	삭제하기
	@GetMapping("/delete")
	public String delete(@RequestParam("idx") Long idx , Criteria cri , RedirectAttributes rttr) {

		log.info("삭제할 번호  : " + idx);

		//   	DB작업
		sboardService.delete(idx);
		

		return "redirect:/sboard/list" + cri.getListLink();
	}
}
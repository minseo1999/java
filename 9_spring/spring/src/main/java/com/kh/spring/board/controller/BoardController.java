package com.kh.spring.board.controller;

import java.io.File;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;
import com.kh.spring.board.model.vo.Board;
import com.kh.spring.board.model.vo.Reply;
import com.kh.spring.board.service.BoardService;
import com.kh.spring.common.template.Template;
import com.kh.spring.common.vo.PageInfo;

@Controller
public class BoardController {
	
	private final BoardService boardservice;
	
	@Autowired
	public BoardController(BoardService boardservice) {
		this.boardservice = boardservice;
	}
	
	@RequestMapping("list.bo")
	public String selectList(@RequestParam(value="cpage", defaultValue="1")int currentPage, Model model) {
		int boardCount = boardservice.selectListCount();
		
		PageInfo pi = Template.getPageInfo(boardCount, currentPage, 10, 5);
		ArrayList<Board> list = boardservice.selectList(pi);
		
		model.addAttribute("list",list);
		model.addAttribute("pi",pi);
		
		return "board/boardListView";
	}
	
	@RequestMapping("detail.bo")
	public String selectBoard(@RequestParam(value="bno")int bno, Model model) {
		int result = boardservice.increaseCount(bno);
		
		if(result > 0) {
			Board b = boardservice.selectBoard(bno);
			model.addAttribute("b",b);
			
			return "board/boardDetailView";
		} else {
			model.addAttribute("errMsg", "게시글 조회 실패");
			return "common/errorPage";
		}
	}
	
	@GetMapping("enrollForm.bo")
	public String enrollForm() {
		return "board/boardEnrollForm";
	}
	
	@PostMapping("insert.bo")
	public String insertBoard(Board b, MultipartFile upfile, HttpSession session, Model m) {
		
		if(!upfile.getOriginalFilename().equals("")) {
			String changeName = Template.saveFile(upfile, session, "/resources/uploadFile/");
			
			b.setChangeName("/resources/uploadFile/" + changeName);
			b.setOriginName(upfile.getOriginalFilename());
		}
		
		int result = boardservice.insertBoard(b);
		
		if(result > 0) {
			session.setAttribute("alertMsg", "게시글 작성 성공");
			return "redirect:list.bo";
		} else {
			m.addAttribute("errorMsg", "게시글 작성 실패");
			return "common/errorPage";
		}
	}
	
	@PostMapping("updateForm.bo")
	public String updateForm(int bno, Model m) {
		
		m.addAttribute("b",boardservice.selectBoard(bno));
		return "board/boardUpdateForm";
		
	}
	
	@PostMapping ("update.bo")
	public String updateBoard(Board b, MultipartFile reupFile, HttpSession session, Model m) {
		if(!reupFile.getOriginalFilename().equals("") ) {
			new File(session.getServletContext().getRealPath(b.getChangeName())).delete();
		}
		
		String changeName = Template.saveFile(reupFile, session, "/resources/uploadFile");
		
		b.setOriginName(reupFile.getOriginalFilename());
		b.setChangeName("/resources/uploadFile/");
		
		int result = boardservice.updateBoard(b);
		
		if(result > 0) {
			session.setAttribute("alertMsg", "게시글 수정 성공");
			return "redirect:/";
		} else {
			m.addAttribute("errorMsg","게시글 수정 실패");
			return "common/errorPage/";
		}
	}
	
	@ResponseBody
	@RequestMapping(value="rlist.bo", produces = "application/json; charset-UTF-8")
	public String ajaxSelectReplyList(int bno) {
		ArrayList<Reply> list =  boardservice.selectReply(bno);
		
		return new Gson().toJson(list);
	}
	
	@ResponseBody
	@RequestMapping("rinsert.bo")
	public String ajaxInsertReply(Reply r) {
		//성공했을 때 success, 실패했을 때 fail
		return boardservice.insertReply(r) > 0 ? "success" : "fail";
	}
	
	@ResponseBody
	@RequestMapping("topList.bo")
	public String ajaxTopBoardList() {
		return new Gson().toJson(boardservice.selectTopBoardList());	
	}
}

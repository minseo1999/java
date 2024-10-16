package com.kh.spring.board.service;

import java.util.ArrayList;

import com.kh.spring.board.model.vo.Board;
import com.kh.spring.board.model.vo.Reply;
import com.kh.spring.common.vo.PageInfo;

public interface BoardService {
	
	//게시글 총 갯수 가져오는 부분
	int selectListCount();

	//게시글 목록 가져오기
	ArrayList<Board> selectList(PageInfo pi);
	
	//보드정보 불러오기
	Board selectBoard(int bno);
	
	//조회수 증가
	int increaseCount(int bno);
	
	//새 게시물
	int insertBoard(Board b);

	//게시물 수정
	int updateBoard(Board b);

	//댓글 불러오기
	ArrayList<Reply> selectReply(int bno);

	int insertReply(Reply r);

	ArrayList<Board> selectTopBoardList();

}

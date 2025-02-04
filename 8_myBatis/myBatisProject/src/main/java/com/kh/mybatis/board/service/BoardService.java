package com.kh.mybatis.board.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.kh.mybatis.board.model.vo.Board;
import com.kh.mybatis.board.model.vo.Reply;
import com.kh.mybatis.common.vo.PageInfo;

public interface BoardService {
	public int selectListCount();
	public ArrayList<Board> selectList(PageInfo pi);
	public Board increaseCount(int boardNo);
	public ArrayList<Reply> selectReplyList(int boardNo);
	public int selectSearchCount(HashMap<String, String> map);
	public ArrayList<Board> selectSearchList(HashMap<String, String> map, PageInfo pi);
}

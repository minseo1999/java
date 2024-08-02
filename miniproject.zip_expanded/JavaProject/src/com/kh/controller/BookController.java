package com.kh.controller;

import com.kh.vo.Book;

//controller의 역할
//vo객체를 이용해서 기능을 수행해주는 역할
public class BookController {
	private Book[] bookList = new Book[100];

	public BookController() {
		super();
	}
	
	public void inertBook(Book bk) {
		// bookList에 bk저장
		//가장 앞쪽에 비어있는 공간(null)을 찾아서 bk저장
		
		for(int i=0; i<bookList.length; i++) {
			if(bookList[i] == null) {
				bookList[i] = bk;
				break;
			}
		}
	}
}

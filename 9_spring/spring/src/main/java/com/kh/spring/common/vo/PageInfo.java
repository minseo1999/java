package com.kh.spring.common.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PageInfo {
	int listCount; //현재 총 게시글 수
	int currentPage; //현재 페이지
	int pageLimit; // 페이지 하단에 보이는 페이징 수
	int boardLimit;
	int maxPage; //가장 마지막 페이지(총 페이지 수)
	int startPage; //페이징바의 시작 수
	int endPage; //페이징바의 마지막 끝 수
}

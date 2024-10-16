package com.kh.spring.common.template;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.MultipartFile;

import com.kh.spring.common.vo.PageInfo;

public class Template {
	public static PageInfo getPageInfo(int listCount, int currentPage, int pageLimit, int boardLimit) {
		
		int maxPage = (int)Math.ceil((double)listCount/boardLimit);
		int startPage = ((currentPage -1)/pageLimit) *pageLimit +1;
		int endPage = startPage + pageLimit -1;
		
		endPage = endPage > maxPage ? maxPage : endPage;
		
		PageInfo pi = new PageInfo(listCount, currentPage, pageLimit, boardLimit, maxPage, startPage, endPage);
		return pi;
	}
	
	public static String saveFile(MultipartFile upfile, HttpSession session, String Path) {
		String originName = upfile.getOriginalFilename();
		
		String ext = originName.substring(originName.lastIndexOf("."));
		
		String currentTime = new SimpleDateFormat("yyyyMMddHHss").format(new Date());
		int randNum = (int)(Math.random()*90000) + 10000;
		
		
		String changeName = currentTime + "_" + randNum + ext;
		
		String savePath = session.getServletContext().getRealPath(Path);
		
		try {
			upfile.transferTo(new File(savePath + changeName));
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		
		return changeName;
	}
}

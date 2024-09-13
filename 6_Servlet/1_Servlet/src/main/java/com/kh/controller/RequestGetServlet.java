package com.kh.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class RequestGetServlet
 * Servlet 같은 경우 반드시 contextPath 뒤에 작성되어야한다.
 * http:localhost:5000/test1.do
 */

public class RequestGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestGetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Get방식으로 요청시 해당 doGet메소드가 저절로 호출된다.
		/*
		 	첫번째 매개변수인 request에는 요청시 전달된 내용들이 담겨있음(사용자가 입력한 값, 요청방식, 요청자의 ip주소등)
		 	두번째 매개변수인 response는 요청 처리 후 응답에 사용되는 객체
		 	
		 	요청처리를 위해서 요청시 전달된 값들 추출
		 	request의 parameter 영역안에 존재
		 	request.getParameter("키")
		 */
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		int age = Integer.parseInt(request.getParameter("age"));
		String city = request.getParameter("city");
		double height = Double.parseDouble(request.getParameter("height"));
		
		String[] foods = request.getParameterValues("fodd");
		
		System.out.println("name : " + name);
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		System.out.println("city : " + city);
		System.out.println("height : " + height);
		
		if(foods == null) {
			System.out.println("foods : 없음");
		}else {
			System.out.println("foods : " + String.join(" ", foods));
		}
		
		//1. 이제부터 내가 출력할 내용은 문서형태의 html이고 문자셋은 utf-8이다
		response.setContentType("text/html; charset=utf-8");
		
		//2. 응답받는 사용자(요청했던 사람)와 스트림(클라이언트와의 통로) 생성
		PrintWriter out = response.getWriter();
		
		//3. 위에서 가져온 스트림을 통해 응답 html을 한줄씩 출력
		out.println("<html>");
		out.println("<head>");
		out.println("<style>");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>개인정보</h1>");
		
		out.println("<h2>개인정보응답화면</h2>");
		out.printf("<span>%s</span>님은", name);
		out.printf("<span>%d</span>살이며", age);
		out.printf("<span>%s</span>에 삽니다", city);
		out.println("성별은 ");
		if(gender == null) {
			out.println("선택하지 않았습니다.");
		} else {
			if(gender.equals("M")) {
				out.printf("<span>남자입니다.</span>", gender);
			} else {
				out.printf("<span>여자입니다.</span>", gender);
			}
		}
		
		out.println("</body>");
		out.println("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

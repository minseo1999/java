package com.kh.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestPostServlet
 */
public class RequestPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestPostServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//post방식의 경우
		//데이터를 추출하기 전에 인코딩 형식을 설정해줘야함
		//request.setCharacterEncoding("utf-8");
		//요청시 전달된 값들은 request 영역에 담겨있음
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
		
		//순수 SERVLET방식 : 자바 코드 내에 html을 기술
		//JSP(Java Server Page) 방식 : html 내에 자바코드 쓸 수 있음
		
		//응답 페이지를 만드는 과정을 jsp에ㅔ게 위임
		//단, 응답페이지에 필요한 데이터는 전달해줘야 함
		/**
		 * 데이터를 담기위한 공간 == request의 attribute영역
		 * request.setAttribute("키",값);
		 */
		
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		request.setAttribute("city", city);
		request.setAttribute("height", height);
		request.setAttribute("gender", gender);
		request.setAttribute("food", foods);
		
		/*
		 * 응답하고자 하는 뷰(jsp) 선택해서 넘겨줌 -> requestDispatcher객체 생성
		 */
		RequestDispatcher view = request.getRequestDispatcher("views/responsePage.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("호출완료");
		doGet(request, response);
	}

}

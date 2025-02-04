package com.kh.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class PizzaServlet
 */
public class PizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1)인코딩 처리
		request.setCharacterEncoding("UTF-8");
		
		//2)요청시 전달값 추출, 데이터 가공처리 -> 변수나 객체에 넘겨받은 값 기록
		String name = request.getParameter("userName");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String message = request.getParameter("message");
		
		String pizza = request.getParameter("pizza");
		String[] toppings = request.getParameterValues("topping"); //여러개일때
		String[] side = request.getParameterValues("side");
		String payment = request.getParameter("payment");
		
		//3)요청처리(db에 sql문 실행 > service > dao)
		int price = 0;
		switch(pizza) {
			case "콤비네이션" : price+=5000; break;
			case "치즈피자" :
			case "포테이토" : price += 6000; break;
			default : price +=7000;
		}

		if(toppings != null) {
			for(String topping : toppings) {
				switch(topping) {
				case "치즈추가" :
				case "고구마무스" : price +=1500; break;
				case "치즈바이트" :
				case "파인애플" : price +=2000; break;
				default : price+=2500;
				}
			}
		}
		
		if(side != null) {
			for(String s : side) {
				switch(s) {
				case "콜라" :
				case "사이다" : price +=1500; break;
				default : price+=2000;
				}
			}
		}
		
		//요청 처리 후 사용자가 보게 될 응답페이지를 만들어서 넘겨주기
		//응답페이지(jsp)를 선택해서 포워딩
		/**
		 * 단, 응답페이지에 필요한 데이터가 없다면 담아서 포워딩
		 */
		request.setAttribute("name", name);
		request.setAttribute("phone", phone);
		request.setAttribute("address", address);
		request.setAttribute("message", message);
		

		request.setAttribute("pizza", pizza);
		request.setAttribute("toppings", toppings);
		request.setAttribute("side", side);
		request.setAttribute("payment", payment);
		request.setAttribute("price", price);
		
		//응답할 뷰 선택
		RequestDispatcher view = request.getRequestDispatcher("views/Pizza/PizzaPayment.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
	}

}

package com.kh.etc.opendata.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class run {
	public static final String SERVICE_KEY = "VXOYqX%2F80IQ2amEj0mkyBE%2FkMJy9hoyp%2Fa04pKxBjmzaFpWcEpK%2BEXi8CelHfwnlWo%2BHlO7NZsLLgtVMwKvKQQ%3D%3D";
	
	
	public static void main(String[] args) throws IOException {
		String url = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty";
		url += "?servicekey=" + SERVICE_KEY;
		url += "&returnType=json";
		url += "&sidoName=" + URLEncoder.encode("서울","UTF-8"); //전달값 인코딩
		
		System.out.println(url);
		
		/*
		 	자바코드로 클라이언트 역할을 해서 서버로 요청을 보낼 때 
		 	HttpURLConnection 객체를 이용해서 요청을 보냄
		 	
		 	1. 요청하고자 하는 url을 전달하면서 java.net.URL객체 생성
		 */
		URL requestURL = new URL(url);
		
		//2. 만들어진 URL객체를 가지고 HttpURLConnection객체 생성
		HttpURLConnection urlconn = (HttpURLConnection)requestURL.openConnection();
		
		//3. 요청에 필요한 Header 정보 생성하기
		urlconn.setRequestMethod("GET");
		
		//4. 해당 api서버로 요청 보낸 후 입력데이터 읽어오기;
		BufferedReader br =  new BufferedReader(new InputStreamReader(urlconn.getInputStream()));
		
		String result = "";
		String line;
		while((line = br.readLine()) != null) {
			
		}
		
		
	}
}

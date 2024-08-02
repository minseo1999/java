package test.t240711.object3;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Book[] barr = new Book[10];
		
//		arr[0] = new Book("안녕","소설","김철수",50);
//		System.out.println(arr[0].toString());
		
		// TODO Auto-generated method stub
		/*
		 *  도서관 책 관리 프로그램
		 *  
		 *  
		 *  사용자로부터 제목, 장르, 저자, 책 번호를 입력받아
		 *  b1 이라는 객체를 생성하고 생성된 객체에 toString 메소드를 호출하여 정보 확인
		 */
		
		
//		int n = 0;
//		while(n!=9) {
//			System.out.println("========================================");
//			System.out.println("1. 도서 등록");
//			System.out.println("2. 등록 도서 목록");
//			System.out.println("3. 도서 검색");
//			System.out.println("4. 도서 삭제");
//			System.out.println("9. 종료");
//			System.out.print("메뉴 번호 : ");
//			n = sc.nextInt();
//			sc.nextLine();
//			
//			switch (n) {
//			case 1:
//				System.out.print("title : ");
//				String title;
//				title = sc.nextLine();
//				
//				System.out.print("genre : ");
//				String genre;
//				genre = sc.nextLine();
//
//				System.out.print("author : ");
//				String author;
//				author = sc.nextLine();
//				
//				System.out.print("bookNo : ");
//				int bookNo; 
//				bookNo = sc.nextInt();
//				
//				for(int i=0; i<barr.length; i++) {
//					if(barr[i] == null) {
//						barr[i] = new Book(title,genre,author,bookNo);
//						break;
//					}
//				}			
//				break;
//			case 2:
//				System.out.println("================등록 도서목록================");
//				for(int i=0; i<barr.length; i++) {
//					if(barr[i] != null) {
//						System.out.println(barr[i].toString());
//						}
//					}break;
//					
//					
//			case 3:
//				System.out.println("제목 : ");
//				String findTitle = sc.nextLine();
//				
//				for(int i=0; i<barr.length; i++) {
//					if(barr[i] == null) {
//						System.out.println("검색한 도서를 찾지 못하였습니다.");
//						break;
//					}else if(barr[i].getTitle().equals(findTitle)) {
//						System.out.println(barr[i].toString());
//						break;
//					}
//				}
//				break;
//				
//			case 4:
//				System.out.println("================등록 도서목록================");
//				for(int i=0; i<barr.length; i++) {
//					if(barr[i] != null) {
//						System.out.println(barr[i].toString());
//						}
//					}
//				
//				System.out.println("삭제할 도서의 목록 번호 : ");
//				int num = sc.nextInt();
//				
//				for(int i=0; i<barr.length; i++) {
//					if(barr[i] == null) {
//						System.out.println("삭제할 번호를 찾지 못했습니다.");
//						break;
//					}else if(num == barr[i].getBookNo()) {
//						System.out.println("삭제한 도서 : " + barr[i].getBookNo());
//						for(int j=i; j<barr.length-1; j++) {
//							barr[j] = barr[j+1];
//						}barr[barr.length-1] = null;
//						break;
//					}
//					
//				}break;
//			case 9:
//				System.out.println("종료되었습니다.");
//				return;
//				
//			default: System.out.println("다시 입력하세요");
//				break;
//			}
//		}
//		System.out.println("종료되었습니다.");

		new Libray().menu();
		
	
	
	}

}

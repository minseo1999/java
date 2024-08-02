package test.t240711.object3;

import java.util.Scanner;

public class Libray {
	//사용자와 소통, 입력받고 응답하기
	
	Scanner sc = new Scanner(System.in);
	
	private Book[] barr = new Book[10];
	
	public void menu() {
		int n = 0;
		while(n!=9) {
			System.out.println("========================================");
			System.out.println("1. 도서 등록");
			System.out.println("2. 등록 도서 목록");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 삭제");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 : ");
			n = sc.nextInt();
			sc.nextLine();
			switch(n) {
			case 1:
				this.addBook();
				break;
			case 2:
				this.printBookList();
				break;
			case 3:
				this.searchBook();
				break;
			case 4:
				this.printBookList();
				this.deleteBook();
				break;
			case 9:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("다시 입력하세요");
				break;
			}
		}
	}

	
	public void addBook() {

		System.out.print("title : ");
		String title;
		title = sc.nextLine();
		
		System.out.print("genre : ");
		String genre;
		genre = sc.nextLine();

		System.out.print("author : ");
		String author;
		author = sc.nextLine();
		
		System.out.print("bookNo : ");
		int bookNo; 
		bookNo = sc.nextInt();
		
		for(int i=0; i<barr.length; i++) {
			if(barr[i] == null) {
				barr[i] = new Book(title,genre,author,bookNo);
				break;
			}
		}			
	}

	public void printBookList() {
		System.out.println("================등록 도서목록================");
		for(int i=0; i<barr.length; i++) {
			if(barr[i] != null) {
				System.out.println(barr[i].toString());
				}
			}		
	}

	public void searchBook() {
		System.out.println("제목 : ");
		String findTitle = sc.nextLine();
		
		for(int i=0; i<barr.length; i++) {
			if(barr[i] == null) {
				System.out.println("검색한 도서를 찾지 못하였습니다.");
				break;
			}else if(barr[i].getTitle().equals(findTitle)) {
				System.out.println(barr[i].toString());
				break;
			}
		}
	}

	public void deleteBook() {
		System.out.println("삭제할 도서의 목록 번호 : ");
		int num = sc.nextInt();
		
		for(int i=0; i<barr.length; i++) {
			if(barr[i] == null) {
				System.out.println("삭제할 번호를 찾지 못했습니다.");
				break;
			}else if(num == barr[i].getBookNo()) {
				System.out.println("삭제한 도서 : " + barr[i].getBookNo());
				for(int j=i; j<barr.length-1; j++) {
					barr[j] = barr[j+1];
				}barr[barr.length-1] = null;
				break;
			}
			
		}
	}

}

package test240724.object1;

import java.util.Scanner;

public class FileMenu {
	
	Scanner sc = new Scanner(System.in);
	
	FileController fc = new FileController();
	
	public void mainMenu() {
		int n = 0;
		while(n!=9) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 :");
			
			switch (n) {
			case 1:
				this.fileSave();
				break;
			case 2:
				this.fileOpen();
				break;
			case 3:
				this.fileEdit();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				break;
			}
		}
		
		
		
		
	}
	
	public void fileSave() {
		System.out.println("파일에 저장할 내용을 입력하세요.");
		System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
		System.out.print("내용 :");
		StringBuilder sb = new StringBuilder(); //문자열을 다루는 객체 (String 과 비슷한 역할)
		sb.append(sc.nextLine());
		char ans = sc.next().charAt(0);
		String name = null;
		while(ans != 'y') {
			System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
			name = sc.nextLine();
			if(fc.checkName(name) == true) {
				System.out.println("“이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)");
			}
		} fc.fileSave(name, sb);
		
		
	}
	
	public void fileOpen() {
		
	}
	
	public void fileEdit() {
		
	}

}

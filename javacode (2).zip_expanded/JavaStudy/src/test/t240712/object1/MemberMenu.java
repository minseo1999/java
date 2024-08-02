package test.t240712.object1;

import java.util.Scanner;

public class MemberMenu {
	
	Scanner sc = new Scanner(System.in);
	
	MemberController mc = new MemberController();
	
	Member mArr = new Member();

	public MemberMenu() {
		super();
	}
	
	public void mainMenu() {
		int n = 0;
		while(n!=9) {
			if(mc.existMemberNum()<=9) {
				System.out.println("=====================================================");
				System.out.println("등록 가능한 회원 수는 " + (mc.SIZE-mc.existMemberNum()) + "명 입니다.");
				System.out.println("현재 등록한 회원 수는 " + mc.existMemberNum() + "명 입니다.");
				System.out.println("1. 새 회원 등록");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
				n = sc.nextInt();
				
				switch (n) {
				case 1:
					this.insertMember();
					break;
				case 2:
					this.searchMember();
					break;
				case 3:
					this.updateMember();
					break;
				case 4:
					this.deleteMember();
					break;
				case 5:
					this.printAll();
					break;
				case 9:
					System.out.println("종료합니다.");
					return;
				default:
					System.out.println("다시 입력하세요");
					break;
				}
			}else {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
				n = sc.nextInt();
				
				switch (n) {
				case 2:
					this.searchMember();
					break;
				case 3:
					this.updateMember();
					break;
				case 4:
					this.deleteMember();
					break;
				case 5:
					this.printAll();
					break;
				case 9:
					System.out.println("종료합니다.");
					return;
				default:
					System.out.println("다시 입력하세요");
					break;
				
			}
			
		}
	}
		
	}
	
	public void insertMember() {
		System.out.println("새 회원을 등록합니다.");
		System.out.print("아이디 : ");
		String id = sc.next();
		while(mc.checkId(id)) {
			System.out.println("중복된 아이디 입니다. 다시 입력하세요");
			System.out.print("아이디 : ");
			id = sc.next();
			
		}sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		System.out.print("성별(m/f) : ");
		char gender = sc.next().charAt(0);
		while(gender != 'm'&&gender != 'M'&&gender != 'f'&&gender != 'F') {
			System.out.println("잘못된 성별입니다. 다시 입력해주세요.");
			System.out.print("성별(m/f) : ");
			gender = sc.next().charAt(0);
		}
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		mc.insertMember(id, name, password, email, gender, age);
		
	}
	
	public void searchMember() {
		int n = 0;
		while(n!=9) {
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 메인으로 돌아가기");
			n = sc.nextInt();
			
			switch (n) {
			case 1:
				this.searchId();
				break;
			case 2:
				this.searchName();
				break;
			case 3:
				this.searchEmail();
				break;
			case 9:
				this.mainMenu();
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				this.mainMenu();
				break;
			}
		}
		
	}
	
	public void searchId() {
		System.out.println("아이디를 입력하세요 : ");
		String id = sc.next();
		for(int i=0; i<mc.existMemberNum(); i++) {
			if(mc.searchId(id)!=null) {
				System.out.println("찾으신 회원 조회 결과입니다.");
				System.out.println(mc.searchId(id));
				this.mainMenu();
				break;
			}else {
				System.out.println("검색 결과가 없습니다.");
				this.mainMenu();
				break;
			}
		}
	}
	
	public void searchName() {
		System.out.println("이름을 입력하세요 : ");
		String name = sc.next();
		for(int i=0; i<mc.existMemberNum(); i++) {
			if(mc.searchName(name)!=null) {
				System.out.println("찾으신 회원 조회 결과입니다.");
				System.out.println(mc.searchName(name));
				this.mainMenu();
				break;
			}else {
				System.out.println("검색 결과가 없습니다.");
				this.mainMenu();
				break;
			}
		}
		
	}
	
	public void searchEmail() {
		System.out.println("이메일을 입력하세요 : ");
		String email = sc.next();
		for(int i=0; i<mc.existMemberNum(); i++) {
			if(mc.searchEmail(email)!=null) {
				System.out.println("찾으신 회원 조회 결과입니다.");
				System.out.println(mc.searchEmail(email));
				this.mainMenu();
				break;
			}else {
				System.out.println("검색 결과가 없습니다.");
				this.mainMenu();
				break;
			}
		}
		
	}
	
	public void updateMember() {
		int n = 0;
		while(n!=9) {
			System.out.println("1. 비밀번호 수정하기");
			System.out.println("2. 이름 수정하기");
			System.out.println("3. 이메일 수정하기");
			System.out.println("9. 메인으로 돌아가기");
			n = sc.nextInt();
			
			switch (n) {
			case 1:
				this.updatePassword();
				break;
			case 2:
				this.updateName();
				break;
			case 3:
				this.updateEmail();
				break;
			case 9:
				this.mainMenu();
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				this.mainMenu();
				break;
			}
		}
		
		
		
	}
	
	public void updatePassword() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		sc.nextLine();
		System.out.print("수정할 회원의 비밀번호 : ");
		String password = sc.nextLine();
		
		if(mc.updatePassword(id, password) == false) {
			System.out.println("존재하지 않는 아이디입니다.");
			this.mainMenu();
		}else {
			System.out.println("수정 되었습니다.");
			this.mainMenu();
		}
		
	}
	
	public void updateName() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		sc.nextLine();
		System.out.print("수정할 회원의 이름 : ");
		String name = sc.nextLine();
		
		if(mc.updateName(id, name) == false) {
			System.out.println("존재하지 않는 아이디입니다.");
			this.mainMenu();
		}else {
			System.out.println("수정 되었습니다.");
			this.mainMenu();
		}
		
	}
	
	public void updateEmail() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		sc.nextLine();
		System.out.print("수정할 회원의 이메일 : ");
		String email = sc.nextLine();
		
		if(mc.updateEmail(id,email) == false) {
			System.out.println("존재하지 않는 아이디입니다.");
			this.mainMenu();
		}else {
			System.out.println("수정 되었습니다.");
			this.mainMenu();
		}
		
	}
	
	public void deleteMember() {
		int n = 0;
		while(n!=9) {
			System.out.println("1. 특정 회원 삭제하기");
			System.out.println("2. 모든 회원 삭제하기");
			System.out.println("9. 메인으로 돌아가기");
			n = sc.nextInt();
			
			switch (n) {
			case 1:
				this.deleteOne();
				break;
			case 2:
				this.deleteAll();
				break;
			case 9:
				this.mainMenu();
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				this.mainMenu();
				break;
			}
		}
		
	}
	
	public void deleteOne() {
		System.out.print("삭제할 회원의 아이디 : ");
		String id = sc.next();
		System.out.println("정말 삭제하시겠습니까? : ");
		char ans = sc.next().charAt(0);
		
		while(ans!='y'&&ans!='Y') {
			System.out.println("잘못 입력하셨습니다.");
			ans = sc.next().charAt(0);
		}
		if(mc.delete(id) != true) {
			System.out.println("존재하지 않는 아이디입니다.");
			this.mainMenu();
		}else {
			System.out.println("성공적으로 삭제하였습니다.");
			this.mainMenu();
		}
		
	}
	
	public void deleteAll() {
		System.out.println("정말 삭제하시겠습니까? : ");
		char ans = sc.next().charAt(0);
		
		while(ans!='y'||ans!='Y') {
			System.out.println("성공적으로 삭제하였습니다.");
			mc.delete2();
			this.mainMenu();
		}
		
	}
	
	public void printAll() {
		if(mc.existMemberNum() == 0) {
			System.out.println("저장된 회원이 없습니다.");
			this.mainMenu();
		}else {
			mc.printAll();
			this.mainMenu();
		}
		
		
	}
	
	
	
}

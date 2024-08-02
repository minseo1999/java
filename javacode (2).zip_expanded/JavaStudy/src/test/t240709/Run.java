package test.t240709;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member mem = new Member();
		
		mem.memberName = "최민서";
		
		mem.printName();
		
		mem.changeName("최민서2");
		
		mem.printName();
		
		Member memId = new Member("minseo1999","minseo1020");
		
		System.out.println(memId.memberId);
		System.out.println(memId.memberPwd);
		
		//객체를 하나 생성하고 printName()을 통해 이름을 출력하라
		//아이디 이름 비밀번호 초기화 객체 사용하기
		Member choi = new Member("최민서","20-70015831","alstj321!");
		choi.printName();
		
	}

}

package test.t240709;

public class Member {
	String memberId;
	String memberPwd;
	String memberName;
	int age;
	char gender;
	String phone;
	String email;
	
	//기본생성자
	public Member() {
	}
	//id, pwd를 넘겨받아 초기화하는 생성자
	public Member(String memberId, String memberPwd) {
		this.memberId = memberId;
		this.memberPwd = memberPwd;
	}
	public Member(String memberName, String memberId, String memberPwd) {
		this.memberName = memberName;
		this.memberId = memberId;
		this.memberPwd = memberPwd;
	}
	
	
	public void changeName(String Name) {
		this.memberName = Name;
	}
	public void printName() {
		System.out.println(this.memberName);		
	}
	
	

}

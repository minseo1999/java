package test.t240712.object1;

public class MemberController {
	
	final int SIZE = 10;
	
	private Member[] m = new Member[SIZE];
	
	
	public int existMemberNum() {
		int count = 0;
		for(int i=0; i<m.length; i++) {
			if(m[i] != null) {
				count++;
			}else {
				break;
			}
		}
		return count;
	}
	
	public boolean checkId(String inputId) {
		boolean check = false;
		for(int i=0; i<m.length; i++) {
			if(m[i] == null) {
				break;
			}else if(inputId.equals(m[i].getId())) {
					check = true;
					break;
				}
			}
		return check;
	}
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		for(int i=0; i<m.length; i++) {
			if(m[i] == null) {
//				m[i].setId(id);
//				m[i].setName(name);
//				m[i].setPassword(password);
//				m[i].setEmail(email);
//				m[i].setGender(gender);
//				m[i].setAge(age);
				m[i] = new Member(id,name,password,email,gender,age);
				break;
			}
		}
	}
	
	public String searchId(String id) {
		String res = null;
		for(int i=0;i<m.length; i++) {
			if(id.equals(m[i].getId())) {
				res = m[i].inform();
				break;
			}
		}
		return res;
	}
	
	public String searchName(String name) {
		String res = null;
		for(int i=0;i<m.length; i++) {
			if(name.equals(m[i].getId())) {
				res = m[i].inform();
				break;
			}
		}
		return res;
	}
	
	public String searchEmail(String email) {
		String res = null;
		for(int i=0;i<m.length; i++) {
			if(email.equals(m[i].getId())) {
				res = m[i].inform();
				break;
			}
		}
		return res;
	}
	
	public boolean updatePassword(String id, String password) {
		boolean check = true;
		for(int i=0; i<m.length; i++) {
			if(id.equals(m[i].getId())) {
				check = true;
				m[i].setPassword(password);
				break;
			}else {
				check = false;
			}
		}
		
		return check;
	}
	
	public boolean updateName(String id, String name) {
		boolean check = true;
		for(int i=0; i<m.length; i++) {
			if(id.equals(m[i].getId())) {
				check = true;
				m[i].setName(name);
				break;
			}else {
				check = false;
			}
		}
		return check;
	}
	
	public boolean updateEmail(String id, String email) {
		boolean check = true;
		for(int i=0; i<m.length; i++) {
			if(id.equals(m[i].getId())) {
				check = true;
				m[i].setEmail(email);
				break;
			}else {
				check = false;
			}
		}
		return check;
	}
	
	public boolean delete(String id) {
		boolean check = false;
		for(int i=0; i<m.length; i++) {
			if(m[i] == null) {
				break;
			}else {
				if(id.equals(m[i].getId())) {
					m[i] = null;
					check = true;
					for(int j=i; j<m.length-1; j++) {
						m[j] = m[j+1];
					}m[m.length-1] = null;
					break;
				}else {
					check = false;
				}
			}
		}
		return check;
	}
	
	public void delete2() {
		for(int i=0; i<m.length; i++) {
			m[i] = null;
		}
		this.m = new Member[this.SIZE];
	}
	
	public void printAll() {
		
		for(int i=0; i<this.existMemberNum(); i++) {
			System.out.println(m[i].inform());
		}
		
//		return m;
	}

}

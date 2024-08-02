package test240730.object1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class MemberController {
	HashMap map = new HashMap();
	
	public boolean joinMembership(String id, Member m) {
		if(map.containsKey(id)) {
			return false;
		}else {
			map.put(id, m);
			return true;
		}
	}
	
	public String login(String id, String password) {
		Member m = (Member) map.get(id);
		if(map.containsKey(id)) {
			if(password.equals(m.getPassword())){
				return m.getName();
			}
		}
		return null;
	}
	
	public boolean changePassword(String id, String oldPwd, String newPwd) {
		Member m = (Member) map.get(id);
		if(map.containsKey(id)) {
			if(m.getPassword().equals(oldPwd)) {
				m.setPassword(newPwd);
				return true;
			}
		}
		return false;
	}
	
	public void changeName(String id, String newName) {
		Member m = (Member) map.get(id);
		if(m != null) {
			m.setName(newName);
		}
	}
	
	public TreeMap sameName(String name) {
		TreeMap res = new TreeMap(new Comparator<String>() {
			@Override
			public int compare(String ob1, String ob2) {
				return ob1.compareTo(ob2);
			}
		});

		//map.keySet() -> id가 모여있는 set 자료구조
		for(Object id : map.keySet()) {
			Member m = (Member)map.get(id);
			if(m.getName().equals(name)) {
				res.put(id, m.getName());
			}
		}
		return res;
	}

}

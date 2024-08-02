package test240731.object1;

import java.util.Objects;

public class Farm {
	private String kind;

	public Farm(String kind) {
		super();
		this.kind = kind;
	}

	public Farm() {
		super();
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Farm [kind=" + kind + "]";
	}

	@Override
	public int hashCode() {
		
		return this.getKind().hashCode(); //그냥 두면 문자열 참조라 안됨
		//return Object.hash(this.kind);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Farm) { // 형식이 같고
			if(((Farm)obj).getKind().equals(this.getKind())) { //내용이 같아야함
				return true;
			}
		}
		return false;
	}
	
	

}

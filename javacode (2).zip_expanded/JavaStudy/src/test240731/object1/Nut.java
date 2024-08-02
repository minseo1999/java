package test240731.object1;

import java.util.Objects;

public class Nut extends Farm{
	private String name;

	public Nut(String name) {
		super();
		this.name = name;
	}

	public Nut(String kind, String name) {
		super(kind);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "견과" + name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.getName(),super.getKind());
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Nut) {
			if(((Nut)obj).getName().equals(this.getName())) {
				return true;
			}
		}
		return false;
	}
	
	

}

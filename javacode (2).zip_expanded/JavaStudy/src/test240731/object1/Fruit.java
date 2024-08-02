package test240731.object1;

import java.util.Objects;

public class Fruit extends Farm{
	private String name;

	

	public Fruit(String kind, String name) {
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
		return "과일: " + name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.name, super.getKind());
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Fruit) {
			if(((Fruit)obj).getName().equals(this.getName())) {
				return true;
			}
		}
		return false;
	}
	
	
	

}

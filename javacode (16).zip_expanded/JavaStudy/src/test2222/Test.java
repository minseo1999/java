package test2222;

import java.util.ArrayList;

import test240731.object1.Fruit;

public class Test {
	public void test() {
		ArrayList list = new ArrayList();
		list.add(new Fruit("사과", "빨강"));
		list.add(new Fruit("사과2", "빨강2"));
		list.add(new Fruit("사과3", "빨강3"));
		list.add("맛있는 과일");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
	
}

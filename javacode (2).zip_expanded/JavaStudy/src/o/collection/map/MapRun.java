package o.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapRun {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		
		//계층구조를 보면
		//List 계열, Set 계열의 클래스들은 Collection 을 구현한 클래스이다.
		// => 객체를 추가하고자 할 때 공통적으로 add 메소드를 이용
		
		//Map 계열은 Collection 을 구현한 클래스가 아니다
		// => 객체를 추가하고자 할때 put 메소드를 이용 (key + value 한쌍으로 담아야한다.)
		
		//1. put(k,v) Map 에 키, 밸류 세트로 추가시켜주는 메소드
		
		hm.put("다이제", new Snack("초코맛",1000));
		hm.put("칸초", new Snack("단맛",500));
		hm.put("새우깡", new Snack("짠맛",600));
		hm.put("먹태깡", new Snack("술안주맛",700));
		
		System.out.println(hm);
		// 저장되는 순서 유지 안됨! value 값이 중복이어도 key 값이 중복되지 않으면 잘 저장됨
		hm.put("먹태깡", new Snack("매운맛",700));
		System.out.println(hm);
		// 동일한 key 값으로 다시 추가하는 경우 value 값이 덮어씌워진다. (중복된 key 값이 공존할 수 없다 식별자 역할을 함)
		
		//2. get(Object key) : 해당 key을 가지는 value 값을 리턴해준다.
		System.out.println(hm.get("다이제"));
		
		//3. size() : 담겨있는 객체들의 수 (key 값 기준)
		System.out.println(hm.size());
		
		//4. replace(key, value) => 해당 key 값을 찾아서 value 값으로 수정
		hm.replace("먹태깡", new Snack("아주 매운맛", 1200));
		System.out.println(hm.get("먹태깡"));
		
		//5. remove(Object key) => 해당 key 값을 찾아서 그 세트를 삭제시키는 메소드
		hm.remove("다이제");
		System.out.println(hm);
		
		//전체 객체에 대해서 접근하는 방법
		//for each? x 순서없음
		//Iterator 반복자? x
		
		//1. Map 의 key 는 set 구조와 매우 유사함 => key 값을 모아서 set 구조로 변경
		Set keySet = hm.keySet();
		System.out.println(keySet);
		for(Object key : keySet) {
			System.out.println("key : " + key + "   value : " + hm.get(key)); 
		}
		
		//2. entrySet() 이용
		Set entrySet = hm.entrySet();
		Iterator it = entrySet.iterator();
		while(it.hasNext()) {
			Entry entry = (Entry)it.next(); // Entry 객체 안에 key, value 값이 다 담겨있다.
			
			String key = (String)entry.getKey();
			Snack Value = (Snack)entry.getValue();
			System.out.println("key : " + key + "   value : " + Value);
		}
	}

}

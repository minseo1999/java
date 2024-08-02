package test240729.object2;

import java.util.Comparator;

public class SortedLottery implements Comparator<Lottery>{
	@Override
	public int compare(Lottery o1, Lottery o2) {
		// TODO Auto-generated method stub
		int num = o1.getName().compareTo(o2.getName());
		//0보다 작은 값(음수) : o1이 o2 보다 작다.
		//0 : o1이 o2 같다
		//0보다 큰 값 : o1이 o2 보다 크다.
		if(num == 0) {
			return o1.getPhone().compareTo(o2.getPhone());
		}
		return num;
	}

}

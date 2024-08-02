package test240729.object2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class LotteryController {
	private HashSet lottery = new HashSet();
	private HashSet win = new HashSet();
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l); //정상적으로 들어가면 true 아니면 false 
	}
	
	public boolean  deleteObject(Lottery l) {
		boolean isRemove = lottery.remove(l);
		if(isRemove && win!= null) {
			win.remove(l);
		}
		return isRemove;
	}
	
	public HashSet winObject() {
		// 추첨 대상자 중에서 랜덤으로 뽑아 당첨 목록에 넣는 메소드
		// 랜덤으로 뽑기 위해 lottery를 ArrayList에 담고,
		// 인덱스를 이용해 win에 당첨자 저장
		// 이 때, 당첨자 수는 무조건 4명이며 이를 위해 추첨자 수는 4명 이상이어야 함
		// 만일 당첨자 목록에 삭제된 추첨 대상자가 있다면
		// 기존에 당첨된 사람은 제외하고 삭제된 사람의 자리만 새로운 추첨자로 채움
		List<Lottery> list = new ArrayList<>();
		list.addAll(lottery);
			
		while(win.size() < 4) { // 당첨자 뽑기 사이즈 확인해서 4명하면 계속 진행
			int rand = (int)(Math.random() * list.size());
			win.add(list.get(rand));
			}
		return win;
	}
	
	public TreeSet sortedWinObject() {
		TreeSet sortedWinSet = new TreeSet(new SortedLottery()); // TreeSet 정렬구조가 SortedLottery로 정함
		sortedWinSet.addAll(win);	
		return sortedWinSet;
	}
	
	public boolean searchWinner(Lottery l) {
		return win.contains(l);
	}

	public HashSet getLottery() {
		return lottery;
	}

	public void setLottery(HashSet lottery) {
		this.lottery = lottery;
	}

	public HashSet getWin() {
		return win;
	}

	public void setWin(HashSet win) {
		this.win = win;
	}
	
	
	
}

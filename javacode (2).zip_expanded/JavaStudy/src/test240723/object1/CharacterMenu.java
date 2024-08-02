package test240723.object1;

import java.util.Scanner;

public class CharacterMenu {
	
	Scanner sc = new Scanner(System.in);
	CharacterController cc = new CharacterController();
	
	public void menu() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		try {
		System.out.println(str + "의  알파벳 개수 : " + cc.countAlpha(str));
		} catch(CharCheckException e){
			System.out.println("문자열에 공백 포함");
		} 
		
	}

}

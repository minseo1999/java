package test.t240705;

import java.util.Scanner;

public class T_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int ran = (int)(Math.random() * 100) + 1;
		int ans = 101, c = 1;
		while(ans != ran) {
			System.out.print("1 ~ 100 사이의 임의의 난수를 맞춰보세요 : ");
			ans = sc.nextInt();

			if(ans == ran) {
				System.out.printf("정답입니다!!\n%d 회만에 맞추셨습니다.",c);
				return;
			}else if(ans < ran) {
				System.out.println("Up!");
			}else {
				System.out.println("Down!");
			}
			c++;
		}
		
	}

}

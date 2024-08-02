package hw;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[][] array = {{1,2,3,4},{1,3,5,51},{7,8,9,12},{42,3,2,43}};
		
		int count = 0;
		
		for(int i=0; i<array.length; i++) {
			count+=array[i].length;
		}
		
		int[] copyArr = new int[count];
		int num = 0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if(array[i][j]%3 == 0) {
					for(int k=0; k<count; k++) {
						if(array[i][j] != copyArr[k]) {
						copyArr[num] = array[i][j];
						}
					}
					
				}
				
			}
			num++;	
		}
		for(int i=0; i<count; i++) {
			System.out.print(copyArr[i] + " ");
		}

	}

}

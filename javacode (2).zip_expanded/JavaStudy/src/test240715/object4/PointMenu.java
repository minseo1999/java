package test240715.object4;

import java.util.Scanner;

public class PointMenu {
	
	Scanner sc = new Scanner(System.in);
	
	CircleController cc = new CircleController();
	RectangleController rc = new RectangleController();
	int n = 0,x,y,width,height,radius;
	public void mainMenu() {
		
		while(n!=9) {
			System.out.println("======== 메뉴 ========");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			n = sc.nextInt();
			
			switch (n) {
			case 1:
				this.CircleMenu();
				this.mainMenu();
				break;
			case 2:
				this.rectangleMenu();
				this.mainMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				break;

			default:
				System.out.println("잘못 입력했습니다.");
				break;
			}
			
		}
		
		
	}
	
	public void CircleMenu() {
		
		while(n!=9) {
			System.out.println("======== 원 메뉴 ========");
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			n = sc.nextInt();
			
			switch (n) {
			case 1:
				this.calcCircum();
				this.mainMenu();
				break;
			case 2:
				this.calcCirArea();
				this.mainMenu();
				break;
			case 9:
				this.mainMenu();
				System.out.println("종료합니다.");
				break;

			default:
				System.out.println("잘못 입력했습니다.");
				break;
			}
		
		}
		
	}

	public void rectangleMenu() {
		while(n!=9) {
			System.out.println("======== 사각형 메뉴 ========");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			n = sc.nextInt();
			
			switch (n) {
			case 1:
				this.calcPerimeter();
				this.mainMenu();
				break;
			case 2:
				this.calcRectArea();
				this.mainMenu();
				break;
			case 9:
				this.mainMenu();
				System.out.println("종료합니다.");
				break;

			default:
				System.out.println("잘못 입력했습니다.");
				break;
			}
		
		}
	
	}

	public void calcCircum() {
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		System.out.print("반지름 : ");
		radius = sc.nextInt();
		System.out.println(cc.calcCircum(x, y, radius));
		
	}

	public void calcCirArea() {
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		System.out.print("반지름 : ");
		radius = sc.nextInt();
		System.out.println(cc.calcArea(x, y, radius));
		
	}

	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		System.out.print("높이 : ");
		height = sc.nextInt();
		System.out.print("너비 : ");
		width = sc.nextInt();
		System.out.println(rc.calcPerimeter(x, y, width, height));
		
	}

	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		System.out.print("높이 : ");
		height = sc.nextInt();
		System.out.print("너비 : ");
		width = sc.nextInt();
		System.out.println(rc.calcArea(x, y, width, height));
		
	}





}

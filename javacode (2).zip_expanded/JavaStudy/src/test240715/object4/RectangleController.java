package test240715.object4;

public class RectangleController {
	
	Rectengle r = new Rectengle();
	
	public String calcArea(int x,int y, int width, int height) {
		int calcArea = width * height;
		return "넓이 : " + calcArea;
	}
	
public String calcPerimeter(int x,int y, int width, int height) {
		int calcPerimeter = 2 * (width * height);
		return  "둘레 : " + calcPerimeter;
	}

}

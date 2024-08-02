package test240715.object4;

public class CircleController {
	
	Circle c = new Circle();

		public String calcArea(int x,int y, int radius) {
			double calcArea = radius * radius * c.getPi();
			return "넓이 : "+calcArea;
			
			
		}
		
		public String calcCircum(int x,int y, int radius) {
			double calcCircum = 2 * radius * c.getPi();
			return "둘레 : " + calcCircum;
		}
}
